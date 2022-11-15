package xyz.redtorch.trader.gateway;

import java.util.Date;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.redtorch.trader.entity.Account;
import xyz.redtorch.trader.entity.Contract;
import xyz.redtorch.trader.entity.Position;
import xyz.redtorch.utils.CommonUtil;

/**
 * @author sun0x00@gmail.com
 */
public abstract class GatewayAbstract implements Gateway{
	
	private static Logger log = LoggerFactory.getLogger(GatewayAbstract.class);
	
	protected String gatewayID;
	protected String gatewayDisplayName;
	protected String gatewayLogInfo;

	protected GatewaySetting gatewaySetting;
	

	protected HashSet<String> subscribedSymbols = new HashSet<>();

	Timer timer = new Timer();
	
	public GatewayAbstract(GatewaySetting gatewaySetting){
		this.gatewaySetting = gatewaySetting;
		this.gatewayID = gatewaySetting.getGatewayID();
		this.gatewayDisplayName = gatewaySetting.getGatewayDisplayName();
		this.gatewayLogInfo = "接口ID-[" + gatewayID + "] 名称-[" + gatewayDisplayName+"] >>> ";
		String logContent = gatewayLogInfo+"开始初始化";
		CommonUtil.emitInfoLog(logContent);
		log.info(logContent);
		timer.schedule(new QueryTimerTask(), new Date(), 1000);

	}
	
	@Override
	public HashSet<String> getSubscribedSymbols() {
		return subscribedSymbols;
	}

	@Override
	public GatewaySetting getGatewaySetting() {
		return gatewaySetting;
	}
	
	@Override
	public String getGatewayID() {
		return gatewayID;
	}

	@Override
	public String getGatewayDisplayName() {
		return gatewayDisplayName;
	}

	@Override
	public String getGatewayLogInfo() {
		return this.gatewayLogInfo;
	}

	@Override
	public void emitPositon(Position position) {
		

	}

	@Override
	public void emitAccount(Account account) {
		// 发送事件

		
	}

	@Override
	public void emitContract(Contract contract) {
		
		// 发送事件

				
	}


	@Override
	public void emitErrorLog(String logContent) {
		CommonUtil.emitErrorLog(logContent);
	}
	
	@Override
	public void emitInfoLog(String logContent) {
		CommonUtil.emitInfoLog(logContent);
	}
	
	@Override
	public void emitWarnLog(String logContent) {
		CommonUtil.emitWarnLog(logContent);
	}
	
	@Override
	public void emitDebugLog(String logContent) {
		CommonUtil.emitDebugLog(logContent);
	}
	
	class QueryTimerTask extends TimerTask{

	    @Override
	    public void run() {
	    	try {
		    	if(isConnected()) {
			        queryAccount();
		    	}
			    Thread.sleep(1250);
			    if(isConnected()) {
				    queryPosition();
			    }
			    Thread.sleep(1250);
	    	}catch (Exception e) {
	    		String logContent = gatewayLogInfo+"定时查询发生异常";
				CommonUtil.emitErrorLog(logContent);
				log.error(logContent,e);
			}
	    }
	}
	
}
