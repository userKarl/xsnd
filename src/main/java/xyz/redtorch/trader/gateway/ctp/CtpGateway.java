package xyz.redtorch.trader.gateway.ctp;

import java.io.File;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.redtorch.trader.entity.CancelOrderReq;
import xyz.redtorch.trader.entity.OrderReq;
import xyz.redtorch.trader.entity.SubscribeReq;
import xyz.redtorch.trader.gateway.GatewayAbstract;
import xyz.redtorch.trader.gateway.GatewaySetting;
import xyz.redtorch.utils.CommonUtil;

/**
 * @author sun0x00@gmail.com
 */
public class CtpGateway extends GatewayAbstract {

	private static Logger log = LoggerFactory.getLogger(CtpGateway.class);

	static {
		try {
			if (System.getProperties().getProperty("os.name").toUpperCase().indexOf("WINDOWS") != -1) {

				String envTmpDir = System.getProperty("java.io.tmpdir");
				String tempLibPath = envTmpDir + File.separator + "market" + File.separator + "xyz" + File.separator
						+ "redtorch" + File.separator + "api" + File.separator + "jctp" + File.separator + "lib";

				CommonUtil.copyURLToFileForTmp(tempLibPath, CtpGateway.class.getResource("/assembly/libiconv.dll"));
				CommonUtil.copyURLToFileForTmp(tempLibPath,
						CtpGateway.class.getResource("/assembly/thostmduserapi_se.dll"));
				CommonUtil.copyURLToFileForTmp(tempLibPath,
						CtpGateway.class.getResource("/assembly/jctpv6v5v1x64api.dll"));
				CommonUtil.copyURLToFileForTmp(tempLibPath,
						CtpGateway.class.getResource("/assembly/thosttraderapi_se.dll"));
//				CommonUtil.copyURLToFileForTmp(tempLibPath,
//						CtpGateway.class.getResource("/assembly/jctpv6v6v1p1x64api.dll"));

				System.load(tempLibPath + File.separator + "libiconv.dll");
				System.load(tempLibPath + File.separator + "thostmduserapi_se.dll");
				System.load(tempLibPath + File.separator + "jctpv6v5v1x64api.dll");
				System.load(tempLibPath + File.separator + "thosttraderapi_se.dll");
//				System.load(tempLibPath + File.separator + "jctpv6v6v1p1x64api.dll");
			} else {

				String envTmpDir = "/tmp";
				String tempLibPath = envTmpDir + File.separator + "market" + File.separator + "xyz" + File.separator
						+ "redtorch" + File.separator + "api" + File.separator + "jctp" + File.separator + "lib";

				CommonUtil.copyURLToFileForTmp(tempLibPath,
						CtpGateway.class.getResource("/assembly/libjctpv6v5v1x64api.so"));
//				CommonUtil.copyURLToFileForTmp(tempLibPath,
//						CtpGateway.class.getResource("/assembly/libjctpv6v6v1p1x64api.so"));
				CommonUtil.copyURLToFileForTmp(tempLibPath,
						CtpGateway.class.getResource("/assembly/libthostmduserapi_se.so"));
				CommonUtil.copyURLToFileForTmp(tempLibPath,
						CtpGateway.class.getResource("/assembly/libthosttraderapi_se.so"));

				System.load(tempLibPath + File.separator + "libjctpv6v5v1x64api.so");
				System.load(tempLibPath + File.separator + "libthostmduserapi_se.so");
				System.load(tempLibPath + File.separator + "libthosttraderapi_se.so");
			}
		} catch (Exception e) {
			log.error("复制库失败!", e);
		}

	}

	private HashMap<String, String> contractExchangeMap = new HashMap<>();
	private HashMap<String, Integer> contractSizeMap = new HashMap<>();

	private MdSpi mdSpi = new MdSpi(this);
	private TdSpi tdSpi = new TdSpi(this);

	public CtpGateway(GatewaySetting gatewaySetting) {
		super(gatewaySetting);
	}

	public HashMap<String, String> getContractExchangeMap() {
		return contractExchangeMap;
	}

	public HashMap<String, Integer> getContractSizeMap() {
		return contractSizeMap;
	}

	@Override
	public void subscribe(SubscribeReq subscribeReq) {
		subscribedSymbols.add(subscribeReq.getSymbol());
		if (mdSpi != null) {
			mdSpi.subscribe(subscribeReq.getSymbol());
		}
	}

	@Override
	public void subscribe(String rtSymbol) {
		if (mdSpi != null) {
			mdSpi.subscribe(rtSymbol);
		}
	}

	@Override
	public void unSubscribe(String rtSymbol) {
		subscribedSymbols.remove(rtSymbol);
		if (mdSpi != null) {
			mdSpi.unSubscribe(rtSymbol);
		}
	}

	@Override
	public void connect() {
		if (tdSpi != null) {
			tdSpi.connect();
		}
		if (mdSpi != null) {
			mdSpi.connect();
		}
	}

	@Override
	public void close() {
		if (tdSpi != null) {
			tdSpi.close();
		}
		if (mdSpi != null) {
			mdSpi.close();
		}

	}

	@Override
	public String sendOrder(OrderReq orderReq) {
		if (tdSpi != null) {
			return tdSpi.sendOrder(orderReq);
		} else {
			return null;
		}

	}

	@Override
	public void cancelOrder(CancelOrderReq cancelOrderReq) {
		if (tdSpi != null) {
			tdSpi.cancelOrder(cancelOrderReq);
		}
	}

	@Override
	public void queryAccount() {
		if (tdSpi != null) {
			tdSpi.queryAccount();
		}
	}

	@Override
	public void queryPosition() {
		if (tdSpi != null) {
			tdSpi.queryPosition();
		}
	}

	@Override
	public boolean isConnected() {
		return tdSpi != null && mdSpi != null && tdSpi.isConnected() && mdSpi.isConnected();
	}

	public void setContractExchangeMap(HashMap<String, String> contractExchangeMap) {
		this.contractExchangeMap = contractExchangeMap;
	}

}
