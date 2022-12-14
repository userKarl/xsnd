package xyz.redtorch.trader.gateway.ctp;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.util.StringUtils;
import xyz.redtorch.api.jctp.CThostFtdcAccountregisterField;
import xyz.redtorch.api.jctp.CThostFtdcBatchOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcBrokerTradingAlgosField;
import xyz.redtorch.api.jctp.CThostFtdcBrokerTradingParamsField;
import xyz.redtorch.api.jctp.CThostFtdcBulletinField;
import xyz.redtorch.api.jctp.CThostFtdcCFMMCTradingAccountKeyField;
import xyz.redtorch.api.jctp.CThostFtdcCFMMCTradingAccountTokenField;
import xyz.redtorch.api.jctp.CThostFtdcCancelAccountField;
import xyz.redtorch.api.jctp.CThostFtdcChangeAccountField;
import xyz.redtorch.api.jctp.CThostFtdcCombActionField;
import xyz.redtorch.api.jctp.CThostFtdcCombInstrumentGuardField;
import xyz.redtorch.api.jctp.CThostFtdcContractBankField;
import xyz.redtorch.api.jctp.CThostFtdcDepthMarketDataField;
import xyz.redtorch.api.jctp.CThostFtdcEWarrantOffsetField;
import xyz.redtorch.api.jctp.CThostFtdcErrorConditionalOrderField;
import xyz.redtorch.api.jctp.CThostFtdcExchangeField;
import xyz.redtorch.api.jctp.CThostFtdcExchangeMarginRateAdjustField;
import xyz.redtorch.api.jctp.CThostFtdcExchangeMarginRateField;
import xyz.redtorch.api.jctp.CThostFtdcExchangeRateField;
import xyz.redtorch.api.jctp.CThostFtdcExecOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcExecOrderField;
import xyz.redtorch.api.jctp.CThostFtdcForQuoteField;
import xyz.redtorch.api.jctp.CThostFtdcForQuoteRspField;
import xyz.redtorch.api.jctp.CThostFtdcInputBatchOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcInputCombActionField;
import xyz.redtorch.api.jctp.CThostFtdcInputExecOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcInputExecOrderField;
import xyz.redtorch.api.jctp.CThostFtdcInputForQuoteField;
import xyz.redtorch.api.jctp.CThostFtdcInputOptionSelfCloseActionField;
import xyz.redtorch.api.jctp.CThostFtdcInputOptionSelfCloseField;
import xyz.redtorch.api.jctp.CThostFtdcInputOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcInputOrderField;
import xyz.redtorch.api.jctp.CThostFtdcInputQuoteActionField;
import xyz.redtorch.api.jctp.CThostFtdcInputQuoteField;
import xyz.redtorch.api.jctp.CThostFtdcInstrumentCommissionRateField;
import xyz.redtorch.api.jctp.CThostFtdcInstrumentField;
import xyz.redtorch.api.jctp.CThostFtdcInstrumentMarginRateField;
import xyz.redtorch.api.jctp.CThostFtdcInstrumentOrderCommRateField;
import xyz.redtorch.api.jctp.CThostFtdcInstrumentStatusField;
import xyz.redtorch.api.jctp.CThostFtdcInvestUnitField;
import xyz.redtorch.api.jctp.CThostFtdcInvestorField;
import xyz.redtorch.api.jctp.CThostFtdcInvestorPositionCombineDetailField;
import xyz.redtorch.api.jctp.CThostFtdcInvestorPositionDetailField;
import xyz.redtorch.api.jctp.CThostFtdcInvestorPositionField;
import xyz.redtorch.api.jctp.CThostFtdcInvestorProductGroupMarginField;
import xyz.redtorch.api.jctp.CThostFtdcMMInstrumentCommissionRateField;
import xyz.redtorch.api.jctp.CThostFtdcMMOptionInstrCommRateField;
import xyz.redtorch.api.jctp.CThostFtdcNoticeField;
import xyz.redtorch.api.jctp.CThostFtdcNotifyQueryAccountField;
import xyz.redtorch.api.jctp.CThostFtdcOpenAccountField;
import xyz.redtorch.api.jctp.CThostFtdcOptionInstrCommRateField;
import xyz.redtorch.api.jctp.CThostFtdcOptionInstrTradeCostField;
import xyz.redtorch.api.jctp.CThostFtdcOptionSelfCloseActionField;
import xyz.redtorch.api.jctp.CThostFtdcOptionSelfCloseField;
import xyz.redtorch.api.jctp.CThostFtdcOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcOrderField;
import xyz.redtorch.api.jctp.CThostFtdcParkedOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcParkedOrderField;
import xyz.redtorch.api.jctp.CThostFtdcProductExchRateField;
import xyz.redtorch.api.jctp.CThostFtdcProductField;
import xyz.redtorch.api.jctp.CThostFtdcProductGroupField;
import xyz.redtorch.api.jctp.CThostFtdcQryInstrumentField;
import xyz.redtorch.api.jctp.CThostFtdcQryInvestorPositionField;
import xyz.redtorch.api.jctp.CThostFtdcQryTradingAccountField;
import xyz.redtorch.api.jctp.CThostFtdcQueryCFMMCTradingAccountTokenField;
import xyz.redtorch.api.jctp.CThostFtdcQuoteActionField;
import xyz.redtorch.api.jctp.CThostFtdcQuoteField;
import xyz.redtorch.api.jctp.CThostFtdcRemoveParkedOrderActionField;
import xyz.redtorch.api.jctp.CThostFtdcRemoveParkedOrderField;
import xyz.redtorch.api.jctp.CThostFtdcReqAuthenticateField;
import xyz.redtorch.api.jctp.CThostFtdcReqQueryAccountField;
import xyz.redtorch.api.jctp.CThostFtdcReqRepealField;
import xyz.redtorch.api.jctp.CThostFtdcReqTransferField;
import xyz.redtorch.api.jctp.CThostFtdcReqUserLoginField;
import xyz.redtorch.api.jctp.CThostFtdcRspAuthenticateField;
import xyz.redtorch.api.jctp.CThostFtdcRspInfoField;
import xyz.redtorch.api.jctp.CThostFtdcRspRepealField;
import xyz.redtorch.api.jctp.CThostFtdcRspTransferField;
import xyz.redtorch.api.jctp.CThostFtdcRspUserLoginField;
import xyz.redtorch.api.jctp.CThostFtdcSecAgentACIDMapField;
import xyz.redtorch.api.jctp.CThostFtdcSecAgentCheckModeField;
import xyz.redtorch.api.jctp.CThostFtdcSettlementInfoConfirmField;
import xyz.redtorch.api.jctp.CThostFtdcSettlementInfoField;
import xyz.redtorch.api.jctp.CThostFtdcTradeField;
import xyz.redtorch.api.jctp.CThostFtdcTraderApi;
import xyz.redtorch.api.jctp.CThostFtdcTraderSpi;
import xyz.redtorch.api.jctp.CThostFtdcTradingAccountField;
import xyz.redtorch.api.jctp.CThostFtdcTradingAccountPasswordUpdateField;
import xyz.redtorch.api.jctp.CThostFtdcTradingCodeField;
import xyz.redtorch.api.jctp.CThostFtdcTradingNoticeField;
import xyz.redtorch.api.jctp.CThostFtdcTradingNoticeInfoField;
import xyz.redtorch.api.jctp.CThostFtdcTransferBankField;
import xyz.redtorch.api.jctp.CThostFtdcTransferSerialField;
import xyz.redtorch.api.jctp.CThostFtdcUserLogoutField;
import xyz.redtorch.api.jctp.CThostFtdcUserPasswordUpdateField;
import xyz.redtorch.api.jctp.CtpConstant;
import xyz.redtorch.api.jctp.jctpv6v5v1x64apiConstants;
import xyz.redtorch.trader.base.RtConstant;
import xyz.redtorch.trader.entity.Account;
import xyz.redtorch.trader.entity.CancelOrderReq;
import xyz.redtorch.trader.entity.Contract;
import xyz.redtorch.trader.entity.Order;
import xyz.redtorch.trader.entity.OrderReq;
import xyz.redtorch.trader.entity.Position;
import xyz.redtorch.trader.entity.Trade;

/**
 * @author sun0x00@gmail.com
 */
public class TdSpi extends CThostFtdcTraderSpi {

	private Logger log = LoggerFactory.getLogger(TdSpi.class);
	private CtpGateway ctpGateway;
	// private String mdAddress;
	private String tdAddress;
	private String brokerID;
	private String userID;
	private String password;
	private String autoCode;
	private String userProductInfo;
	private String gatewayLogInfo;
	private String gatewayID;
	// private String gatewayDisplayName;

	private HashMap<String, Position> positionMap = new HashMap<>();

	private HashMap<String, String> contractExchangeMap;
	private HashMap<String, Integer> contractSizeMap;

	// ??????????????????????????????????????????????????????????????????????????????
	private Position lastPosition;
	private Account lastAccount;
	private Order lastOrder;
	private Trade lastTrade;

	TdSpi(CtpGateway ctpGateway) {

		this.ctpGateway = ctpGateway;
		// this.mdAddress = ctpGateway.getGatewaySetting().getMdAddress();
		this.tdAddress = ctpGateway.getGatewaySetting().getTdAddress();
		this.brokerID = ctpGateway.getGatewaySetting().getBrokerID();
		this.userID = ctpGateway.getGatewaySetting().getUserID();
		this.password = ctpGateway.getGatewaySetting().getPassword();
		this.autoCode = ctpGateway.getGatewaySetting().getAuthCode();
		this.gatewayLogInfo = ctpGateway.getGatewayLogInfo();
		this.gatewayID = ctpGateway.getGatewayID();
		// this.gatewayDisplayName = ctpGateway.getGatewayDisplayName();

		this.contractExchangeMap = ctpGateway.getContractExchangeMap();
		this.contractSizeMap = ctpGateway.getContractSizeMap();

	}

	private CThostFtdcTraderApi cThostFtdcTraderApi;

	private boolean connectProcessStatus = false; // ??????????????????
	private boolean connectionStatus = false; // ?????????????????????
	private boolean loginStatus = false; // ????????????
	private String tradingDayStr;

	private volatile int reqID = 0; // ??????????????????
	private volatile int orderRef = 0; // ????????????

	private boolean authStatus = false; // ????????????
	private boolean loginFailed = false; // ????????????????????????????????????????????????

	private int frontID = 0; // ???????????????
	private int sessionID = 0; // ????????????

	/**
	 * ??????
	 */
	public synchronized void connect() {
		try {
			String logContent;
			if (isConnected() || connectProcessStatus) {
				return;
			}

			if (connectionStatus) {
				login();
				return;
			}
			if (cThostFtdcTraderApi != null) {
				cThostFtdcTraderApi.Release();
				cThostFtdcTraderApi.delete();
				connectionStatus = false;
				loginStatus = false;

			}
			String envTmpDir = System.getProperty("java.io.tmpdir");
			String tempFilePath = envTmpDir + File.separator + "xyz" + File.separator + "redtorch" + File.separator
					+ "api" + File.separator + "jctp" + File.separator + "TEMP_CTP" + File.separator + "TD_"
					+ ctpGateway.getGatewayID() + "_";
			File tempFile = new File(tempFilePath);
			if (!tempFile.getParentFile().exists()) {
				try {
					FileUtils.forceMkdirParent(tempFile);
					logContent = gatewayLogInfo + "?????????????????????" + tempFile.getParentFile().getAbsolutePath();
					ctpGateway.emitInfoLog(logContent);
					log.info(logContent);
				} catch (IOException e) {
					logContent = gatewayLogInfo + "???????????????????????????" + tempFile.getParentFile().getAbsolutePath();
					ctpGateway.emitErrorLog(logContent);
					log.error(logContent, e);
				}
			}
			logContent = gatewayLogInfo + "?????????????????????" + tempFile.getParentFile().getAbsolutePath();
			ctpGateway.emitInfoLog(logContent);
			log.info(logContent);
			cThostFtdcTraderApi = CThostFtdcTraderApi.CreateFtdcTraderApi(tempFile.getAbsolutePath());
			cThostFtdcTraderApi.RegisterSpi(this);
			cThostFtdcTraderApi.RegisterFront(tdAddress);
			cThostFtdcTraderApi.Init();
			connectProcessStatus = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ??????
	 */
	public synchronized void close() {
		try {
			if (!isConnected()) {
				return;
			}

			if (cThostFtdcTraderApi != null) {
				cThostFtdcTraderApi.Release();
				cThostFtdcTraderApi.delete();
				connectionStatus = false;
				loginStatus = false;
				connectProcessStatus = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ??????????????????
	 * 
	 * @return
	 */
	public boolean isConnected() {
		return connectionStatus && loginStatus;
	}

	/**
	 * ???????????????
	 * 
	 * @return
	 */
	public String getTradingDayDay() {
		return tradingDayStr;
	}

	/**
	 * ????????????
	 */
	public void queryAccount() {
		try {
			if (cThostFtdcTraderApi == null) {
				log.info("{}???????????????,??????????????????", gatewayLogInfo);
				return;
			}
			CThostFtdcQryTradingAccountField cThostFtdcQryTradingAccountField = new CThostFtdcQryTradingAccountField();
			reqID += 1;
			cThostFtdcTraderApi.ReqQryTradingAccount(cThostFtdcQryTradingAccountField, reqID);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ????????????
	 */
	public void queryPosition() {
		try {
			if (cThostFtdcTraderApi == null) {
				log.info("{}???????????????,??????????????????", gatewayLogInfo);
				return;
			}
			reqID += 1;

			CThostFtdcQryInvestorPositionField cThostFtdcQryInvestorPositionField = new CThostFtdcQryInvestorPositionField();
			// log.info("????????????");
			cThostFtdcQryInvestorPositionField.setBrokerID(brokerID);
			cThostFtdcQryInvestorPositionField.setInvestorID(userID);
			cThostFtdcTraderApi.ReqQryInvestorPosition(cThostFtdcQryInvestorPositionField, reqID);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ??????
	 * 
	 * @param orderReq
	 * @return
	 */
	public String sendOrder(OrderReq orderReq) {
		try {
			if (cThostFtdcTraderApi == null) {
				log.info("{}???????????????,????????????", gatewayLogInfo);
				return null;
			}
			reqID += 1;
			orderRef += 1;
			CThostFtdcInputOrderField cThostFtdcInputOrderField = new CThostFtdcInputOrderField();

			cThostFtdcInputOrderField.setInstrumentID(orderReq.getSymbol());
			cThostFtdcInputOrderField.setLimitPrice(orderReq.getPrice());
			cThostFtdcInputOrderField.setVolumeTotalOriginal(orderReq.getVolume());

			cThostFtdcInputOrderField.setOrderPriceType(
					CtpConstant.priceTypeMap.getOrDefault(orderReq.getPriceType(), Character.valueOf('\0')));
			cThostFtdcInputOrderField.setDirection(
					CtpConstant.directionMap.getOrDefault(orderReq.getDirection(), Character.valueOf('\0')));
			cThostFtdcInputOrderField.setCombOffsetFlag(
					String.valueOf(CtpConstant.offsetMap.getOrDefault(orderReq.getOffset(), Character.valueOf('\0'))));
			cThostFtdcInputOrderField.setOrderRef(orderRef + "");
			cThostFtdcInputOrderField.setInvestorID(userID);
			cThostFtdcInputOrderField.setUserID(userID);
			cThostFtdcInputOrderField.setBrokerID(brokerID);

			cThostFtdcInputOrderField
					.setCombHedgeFlag(String.valueOf(jctpv6v5v1x64apiConstants.THOST_FTDC_HF_Speculation));
			cThostFtdcInputOrderField
					.setContingentCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_CC_Immediately);
			cThostFtdcInputOrderField
					.setForceCloseReason(jctpv6v5v1x64apiConstants.THOST_FTDC_FCC_NotForceClose);
			cThostFtdcInputOrderField.setIsAutoSuspend(0);
			cThostFtdcInputOrderField.setTimeCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_TC_GFD);
			cThostFtdcInputOrderField.setVolumeCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_VC_AV);
			cThostFtdcInputOrderField.setMinVolume(1);

			// ??????FAK FOK?????????
			if (RtConstant.PRICETYPE_FAK.equals(orderReq.getPriceType())) {
				cThostFtdcInputOrderField.setOrderPriceType(jctpv6v5v1x64apiConstants.THOST_FTDC_OPT_LimitPrice);
				cThostFtdcInputOrderField.setTimeCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_TC_IOC);
				cThostFtdcInputOrderField.setVolumeCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_VC_AV);
			} else if (RtConstant.PRICETYPE_FOK.equals(orderReq.getPriceType())) {
				cThostFtdcInputOrderField.setOrderPriceType(jctpv6v5v1x64apiConstants.THOST_FTDC_OPT_LimitPrice);
				cThostFtdcInputOrderField.setTimeCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_TC_IOC);
				cThostFtdcInputOrderField.setVolumeCondition(jctpv6v5v1x64apiConstants.THOST_FTDC_VC_CV);
			}

			// if("IH1805".equals(orderReq.getSymbol())) {
			// System.out.println("T2T-OrderBefore-"+System.nanoTime());
			// }
			cThostFtdcTraderApi.ReqOrderInsert(cThostFtdcInputOrderField, reqID);
			// if("IH1805".equals(orderReq.getSymbol())) {
			// System.out.println("T2T-Order-"+System.nanoTime());
			// }
			String rtOrderID = gatewayID + "." + orderRef;

			return rtOrderID;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// ??????
	public void cancelOrder(CancelOrderReq cancelOrderReq) {
		try {
			if (cThostFtdcTraderApi == null) {
				log.info("{}???????????????,????????????", gatewayLogInfo);
				return;
			}
			reqID += 1;
			CThostFtdcInputOrderActionField cThostFtdcInputOrderActionField = new CThostFtdcInputOrderActionField();

			cThostFtdcInputOrderActionField.setInstrumentID(cancelOrderReq.getSymbol());
			cThostFtdcInputOrderActionField.setExchangeID(cancelOrderReq.getExchange());
			cThostFtdcInputOrderActionField.setOrderRef(cancelOrderReq.getOrderID());
			cThostFtdcInputOrderActionField.setFrontID(frontID);
			cThostFtdcInputOrderActionField.setSessionID(sessionID);

			cThostFtdcInputOrderActionField.setActionFlag(jctpv6v5v1x64apiConstants.THOST_FTDC_AF_Delete);
			cThostFtdcInputOrderActionField.setBrokerID(brokerID);
			cThostFtdcInputOrderActionField.setInvestorID(userID);

			cThostFtdcTraderApi.ReqOrderAction(cThostFtdcInputOrderActionField, reqID);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void login() {
		try {
			if (loginFailed) {
				String logContent = gatewayLogInfo + "?????????????????????????????????,????????????,????????????";
				log.warn(logContent);
				ctpGateway.emitWarnLog(logContent);
			}

			if (StringUtils.isEmpty(brokerID) || StringUtils.isEmpty(userID) || StringUtils.isEmpty(password)) {
				String logContent = gatewayLogInfo + "BrokerID UserID Password???????????????";
				log.error(logContent);
				ctpGateway.emitErrorLog(logContent);
				return;
			}

			if (!StringUtils.isEmpty(autoCode) && !authStatus) {
				// ??????
				CThostFtdcReqAuthenticateField authenticateField = new CThostFtdcReqAuthenticateField();
				authenticateField.setAuthCode(autoCode);
				authenticateField.setUserID(userID);
				authenticateField.setBrokerID(brokerID);
				authenticateField.setUserProductInfo(userProductInfo);
				reqID += 1;
				cThostFtdcTraderApi.ReqAuthenticate(authenticateField, reqID);
			} else {
				// ??????
				CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
				userLoginField.setBrokerID(brokerID);
				userLoginField.setUserID(userID);
				userLoginField.setPassword(password);
				cThostFtdcTraderApi.ReqUserLogin(userLoginField, 0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ?????????????????????
	@Override
	public void OnFrontConnected() {
		try {
			String logContent = gatewayLogInfo + "??????????????????????????????";
			log.info(logContent);
			ctpGateway.emitInfoLog(logContent);
			// ??????????????????????????????true
			connectionStatus = true;
			connectProcessStatus = false;
			login();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ?????????????????????
	@Override
	public void OnFrontDisconnected(int nReason) {
		try {
			String logContent = gatewayLogInfo + "??????????????????????????????,Reason:" + nReason;
			log.info(logContent);
			ctpGateway.emitInfoLog(logContent);
			this.connectionStatus = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ????????????
	@Override
	public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		try {
			if (pRspInfo.getErrorID() == 0) {
				log.info("{}OnRspUserLogin! TradingDay:{},SessionID:{},BrokerID:{},UserID:{}", gatewayLogInfo,
						pRspUserLogin.getTradingDay(), pRspUserLogin.getSessionID(), pRspUserLogin.getBrokerID(),
						pRspUserLogin.getUserID());
				ctpGateway.emitInfoLog(gatewayLogInfo + "????????????????????????");
				this.sessionID = pRspUserLogin.getSessionID();
				this.frontID = pRspUserLogin.getFrontID();
				// ?????????????????????true
				this.loginStatus = true;
				tradingDayStr = pRspUserLogin.getTradingDay();
				log.info("{}????????????????????????????????????{}", gatewayLogInfo, tradingDayStr);

				// ???????????????
				CThostFtdcSettlementInfoConfirmField settlementInfoConfirmField = new CThostFtdcSettlementInfoConfirmField();
				settlementInfoConfirmField.setBrokerID(brokerID);
				settlementInfoConfirmField.setInvestorID(userID);
				reqID += 1;
				cThostFtdcTraderApi.ReqSettlementInfoConfirm(settlementInfoConfirmField, reqID);

			} else {
				log.warn("{}??????????????????????????????! ErrorID:{},ErrorMsg:{}", gatewayLogInfo, pRspInfo.getErrorID(),
						pRspInfo.getErrorMsg());
				loginFailed = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ????????????
	@Override
	public void OnHeartBeatWarning(int nTimeLapse) {
		try {
			String logContent = gatewayLogInfo + "???????????????????????? nTimeLapse:" + nTimeLapse;
			log.warn(logContent);
			ctpGateway.emitWarnLog(logContent);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ????????????
	@Override
	public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		try {
			if (pRspInfo.getErrorID() != 0) {
				log.info("{}OnRspUserLogout!ErrorID:{},ErrorMsg:{}", gatewayLogInfo, pRspInfo.getErrorID(),
						pRspInfo.getErrorMsg());
			} else {
				log.info("{}OnRspUserLogout!BrokerID:{},UserID:{}", gatewayLogInfo, pUserLogout.getBrokerID(),
						pUserLogout.getUserID());

			}
			this.loginStatus = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ????????????
	@Override
	public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		try {
			String logContent = MessageFormat.format("{0}????????????????????????!ErrorID:{1},ErrorMsg:{2},RequestID:{3},isLast{4}",
					gatewayLogInfo, pRspInfo.getErrorID(), pRspInfo.getErrorMsg(), nRequestID, bIsLast);
			ctpGateway.emitErrorLog(logContent);
			log.error(logContent);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ?????????????????????
	@Override
	public void OnRspAuthenticate(CThostFtdcRspAuthenticateField pRspAuthenticateField, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {

		try {
			if (pRspInfo.getErrorID() == 0) {
				authStatus = true;
				String logContent = gatewayLogInfo + "?????????????????????????????????";
				ctpGateway.emitInfoLog(logContent);
				log.info(logContent);

				login();

			} else {
				log.warn("{}?????????????????????????????????! ErrorID:{},ErrorMsg:{}", gatewayLogInfo, pRspInfo.getErrorID(),
						pRspInfo.getErrorMsg());
				String logContent = gatewayLogInfo + "?????????????????????????????????";
				ctpGateway.emitErrorLog(logContent);
				log.info(logContent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void OnRspUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspTradingAccountPasswordUpdate(
			CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	// ????????????????????????
	@Override
	public void OnRspOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {

		try {
			String symbol = pInputOrder.getInstrumentID();
			String exchange = CtpConstant.exchangeMapReverse.get(pInputOrder.getExchangeID());
			String rtSymbol = symbol + "." + exchange;
			String orderID = pInputOrder.getOrderRef();
			String rtOrderID = gatewayID + "." + orderID;
			String direction = CtpConstant.directionMapReverse.getOrDefault(pInputOrder.getDirection(),
					RtConstant.DIRECTION_UNKNOWN);
			String offset = CtpConstant.offsetMapReverse.getOrDefault(pInputOrder.getCombOffsetFlag(),
					RtConstant.OFFSET_UNKNOWN);
			double price = pInputOrder.getLimitPrice();
			int totalVolume = pInputOrder.getVolumeTotalOriginal();
			int tradedVolume = 0;
			String status = RtConstant.STATUS_REJECTED;
			String tradingDay = tradingDayStr;
			String orderDate = null;
			String orderTime = null;
			String cancelTime = null;
			String activeTime = null;
			String updateTime = null;

//			ctpGateway.emitOrder(gatewayID, symbol, exchange, rtSymbol, orderID, rtOrderID, direction, offset, price,
//					totalVolume, tradedVolume, status, tradingDay, orderDate, orderTime, cancelTime, activeTime,
//					updateTime, frontID, sessionID);

			// ??????????????????
			String logContent = MessageFormat.format("{0}??????????????????????????????(??????)! ErrorID:{1},ErrorMsg:{2}", gatewayLogInfo,
					pRspInfo.getErrorID(), pRspInfo.getErrorMsg());
			log.error(logContent);
			ctpGateway.emitErrorLog(logContent);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void OnRspParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	// ??????????????????????????????
	@Override
	public void OnRspOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {

		try {
			String logContent = MessageFormat.format("{0}????????????????????????????????????! ErrorID:{1},ErrorMsg:{2}", gatewayLogInfo,
					pRspInfo.getErrorID(), pRspInfo.getErrorMsg());
			log.error(logContent);

			ctpGateway.emitErrorLog(logContent);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	// ????????????????????????
	@Override
	public void OnRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

		try {
			if (pRspInfo.getErrorID() == 0) {
				String logContent = MessageFormat.format("{0}????????????????????????????????????!", gatewayLogInfo, pRspInfo.getErrorID(),
						pRspInfo.getErrorMsg());
				ctpGateway.emitWarnLog(logContent);
				log.warn(logContent);

			} else {
				String logContent = MessageFormat.format("{0}????????????????????????????????????! ErrorID:{1},ErrorMsg:{2}", gatewayLogInfo,
						pRspInfo.getErrorID(), pRspInfo.getErrorMsg());
				ctpGateway.emitErrorLog(logContent);
				log.error(logContent);
			}

			// ??????????????????
			reqID += 1;
			CThostFtdcQryInstrumentField cThostFtdcQryInstrumentField = new CThostFtdcQryInstrumentField();
			cThostFtdcTraderApi.ReqQryInstrument(cThostFtdcQryInstrumentField, reqID);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void OnRspRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspExecOrderInsert(CThostFtdcInputExecOrderField pInputExecOrder, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspExecOrderAction(CThostFtdcInputExecOrderActionField pInputExecOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspForQuoteInsert(CThostFtdcInputForQuoteField pInputForQuote, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQuoteInsert(CThostFtdcInputQuoteField pInputQuote, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
	}

	@Override
	public void OnRspQuoteAction(CThostFtdcInputQuoteActionField pInputQuoteAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspBatchOrderAction(CThostFtdcInputBatchOrderActionField pInputBatchOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspOptionSelfCloseInsert(CThostFtdcInputOptionSelfCloseField pInputOptionSelfClose,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspOptionSelfCloseAction(CThostFtdcInputOptionSelfCloseActionField pInputOptionSelfCloseAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspCombActionInsert(CThostFtdcInputCombActionField pInputCombAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryOrder(CThostFtdcOrderField pOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
	}

	@Override
	public void OnRspQryTrade(CThostFtdcTradeField pTrade, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
	}

	// ??????????????????
	@Override
	public void OnRspQryInvestorPosition(CThostFtdcInvestorPositionField pInvestorPosition,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {

		try {
			if (pInvestorPosition == null || StringUtils.isEmpty(pInvestorPosition.getInstrumentID())) {
				return;
			}
			String symbol = pInvestorPosition.getInstrumentID();
			String rtSymbol = symbol;
			if (contractExchangeMap.containsKey(symbol)) {
				rtSymbol = symbol + "." + contractExchangeMap.get(symbol);
			}

			// ??????????????????
			String posName = gatewayID + symbol + pInvestorPosition.getPosiDirection();

			Position position;
			if (positionMap.containsKey(posName)) {
				position = positionMap.get(posName);
			} else {
				position = new Position();
				positionMap.put(posName, position);
				position.setGatewayID(gatewayID);
				position.setSymbol(symbol);
				position.setRtSymbol(rtSymbol);
				position.setDirection(
						CtpConstant.posiDirectionMapReverse.getOrDefault(pInvestorPosition.getPosiDirection(), ""));
				position.setRtPositionName(gatewayID + rtSymbol + pInvestorPosition.getPosiDirection());
			}
			// ?????????????????????????????????????????????????????????????????????,??????????????????
			if (pInvestorPosition.getYdPosition() > 0 && pInvestorPosition.getTodayPosition() == 0) {
				position.setYdPosition(pInvestorPosition.getPosition());
			}
			// ????????????
			Integer size = contractSizeMap.get(symbol);
			Double cost = position.getPrice() * position.getPosition() * size;

			// ????????????
			position.setPosition(position.getPosition() + pInvestorPosition.getPosition());
			position.setPositionProfit(position.getPositionProfit() + pInvestorPosition.getPositionProfit());

			// ??????????????????
			if (position.getPosition() != 0 && contractSizeMap.containsKey(symbol)) {
				position.setPrice((cost + pInvestorPosition.getPositionCost()) / (position.getPosition() * size));
			}

			if (RtConstant.DIRECTION_LONG.equals(position.getDirection())) {
				position.setFrozen(pInvestorPosition.getLongFrozen());
			} else {
				position.setFrozen(pInvestorPosition.getShortFrozen());
			}

			// ????????????
			if (bIsLast) {
				for (Position tmpPosition : positionMap.values()) {
					// ??????????????????
					if (lastPosition == null) {
						lastPosition = new Position();
					}
					if (!lastPosition.MyToString().equals(tmpPosition.MyToString())) {
						ctpGateway.emitPositon(tmpPosition);
						lastPosition = tmpPosition;
					}
				}

				// ????????????
				positionMap = new HashMap<>();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ??????????????????
	@Override
	public void OnRspQryTradingAccount(CThostFtdcTradingAccountField pTradingAccount, CThostFtdcRspInfoField pRspInfo,
									   int nRequestID, boolean bIsLast) {

		try {
			Account account = new Account();
			account.setAccountID(pTradingAccount.getAccountID());
			account.setAvailable(pTradingAccount.getAvailable());
			account.setCloseProfit(pTradingAccount.getCloseProfit());
			account.setCommission(pTradingAccount.getCommission());
			account.setGatewayID(gatewayID);
			account.setMargin(pTradingAccount.getCurrMargin());
			account.setPositionProfit(pTradingAccount.getPositionProfit());
			account.setPreBalance(pTradingAccount.getPreBalance());
			account.setRtAccountID(gatewayID + pTradingAccount.getAccountID());

			double balance = pTradingAccount.getPreBalance() - pTradingAccount.getPreCredit()
					- pTradingAccount.getPreMortgage() + pTradingAccount.getMortgage() - pTradingAccount.getWithdraw()
					+ pTradingAccount.getDeposit() + pTradingAccount.getCloseProfit()
					+ pTradingAccount.getPositionProfit() + pTradingAccount.getCashIn()
					- pTradingAccount.getCommission();

			account.setBalance(balance);

			if (lastAccount == null) {
				lastAccount = new Account();
			}
			if (!lastAccount.MyToString().equals(account.MyToString())) {
				ctpGateway.emitAccount(account);
				lastAccount = account;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void OnRspQryInvestor(CThostFtdcInvestorField pInvestor, CThostFtdcRspInfoField pRspInfo, int nRequestID,
								 boolean bIsLast) {
	}

	@Override
	public void OnRspQryTradingCode(CThostFtdcTradingCodeField pTradingCode, CThostFtdcRspInfoField pRspInfo,
									int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInstrumentMarginRate(CThostFtdcInstrumentMarginRateField pInstrumentMarginRate,
											 CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInstrumentCommissionRate(CThostFtdcInstrumentCommissionRateField pInstrumentCommissionRate,
												 CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryExchange(CThostFtdcExchangeField pExchange, CThostFtdcRspInfoField pRspInfo, int nRequestID,
								 boolean bIsLast) {
	}

	@Override
	public void OnRspQryProduct(CThostFtdcProductField pProduct, CThostFtdcRspInfoField pRspInfo, int nRequestID,
								boolean bIsLast) {
	}

	// ??????????????????
	@Override
	public void OnRspQryInstrument(CThostFtdcInstrumentField pInstrument, CThostFtdcRspInfoField pRspInfo,
								   int nRequestID, boolean bIsLast) {

		try {
			Contract contract = new Contract();
			contract.setGatewayID(gatewayID);
			contract.setSymbol(pInstrument.getInstrumentID());
			contract.setExchange(CtpConstant.exchangeMapReverse.get(pInstrument.getExchangeID()));
			contract.setRtSymbol(contract.getSymbol() + "." + contract.getExchange());
			contract.setName(pInstrument.getInstrumentName());

			contract.setSize(pInstrument.getVolumeMultiple());
			contract.setPriceTick(pInstrument.getPriceTick());
			contract.setStrikePrice(pInstrument.getStrikePrice());
			contract.setProductClass(CtpConstant.productClassMapReverse.getOrDefault(pInstrument.getProductClass(),
					RtConstant.PRODUCT_UNKNOWN));
			contract.setExpiryDate(pInstrument.getExpireDate());
			// ??????????????????
			contract.setUnderlyingSymbol(pInstrument.getUnderlyingInstrID());
			// contract.setUnderlyingSymbol(pInstrument.getUnderlyingInstrID()+pInstrument.getExpireDate().substring(2,
			// pInstrument.getExpireDate().length()-2));

			if (RtConstant.PRODUCT_OPTION.equals(contract.getProductClass())) {
				if (pInstrument.getOptionsType() == '1') {
					contract.setOptionType(RtConstant.OPTION_CALL);
				} else if (pInstrument.getOptionsType() == '2') {
					contract.setOptionType(RtConstant.OPTION_PUT);
				}
			}
			contractExchangeMap.put(contract.getSymbol(), contract.getExchange());
			contractSizeMap.put(contract.getSymbol(), contract.getSize());

			ctpGateway.emitContract(contract);

			if (bIsLast) {
				String logContent = gatewayLogInfo + "????????????????????????????????????";
				log.info(logContent);
				ctpGateway.emitInfoLog(logContent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void OnRspQryDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData,
										CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQrySettlementInfo(CThostFtdcSettlementInfoField pSettlementInfo, CThostFtdcRspInfoField pRspInfo,
									   int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryTransferBank(CThostFtdcTransferBankField pTransferBank, CThostFtdcRspInfoField pRspInfo,
									 int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInvestorPositionDetail(CThostFtdcInvestorPositionDetailField pInvestorPositionDetail,
											   CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryNotice(CThostFtdcNoticeField pNotice, CThostFtdcRspInfoField pRspInfo, int nRequestID,
							   boolean bIsLast) {
	}

	@Override
	public void OnRspQrySettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
											  CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInvestorPositionCombineDetail(
			CThostFtdcInvestorPositionCombineDetailField pInvestorPositionCombineDetail,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryCFMMCTradingAccountKey(CThostFtdcCFMMCTradingAccountKeyField pCFMMCTradingAccountKey,
											   CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryEWarrantOffset(CThostFtdcEWarrantOffsetField pEWarrantOffset, CThostFtdcRspInfoField pRspInfo,
									   int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInvestorProductGroupMargin(
			CThostFtdcInvestorProductGroupMarginField pInvestorProductGroupMargin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryExchangeMarginRate(CThostFtdcExchangeMarginRateField pExchangeMarginRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryExchangeMarginRateAdjust(CThostFtdcExchangeMarginRateAdjustField pExchangeMarginRateAdjust,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryExchangeRate(CThostFtdcExchangeRateField pExchangeRate, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQrySecAgentACIDMap(CThostFtdcSecAgentACIDMapField pSecAgentACIDMap,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryProductExchRate(CThostFtdcProductExchRateField pProductExchRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryProductGroup(CThostFtdcProductGroupField pProductGroup, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryMMInstrumentCommissionRate(
			CThostFtdcMMInstrumentCommissionRateField pMMInstrumentCommissionRate, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryMMOptionInstrCommRate(CThostFtdcMMOptionInstrCommRateField pMMOptionInstrCommRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInstrumentOrderCommRate(CThostFtdcInstrumentOrderCommRateField pInstrumentOrderCommRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQrySecAgentTradingAccount(CThostFtdcTradingAccountField pTradingAccount,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQrySecAgentCheckMode(CThostFtdcSecAgentCheckModeField pSecAgentCheckMode,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryOptionInstrTradeCost(CThostFtdcOptionInstrTradeCostField pOptionInstrTradeCost,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryOptionInstrCommRate(CThostFtdcOptionInstrCommRateField pOptionInstrCommRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryExecOrder(CThostFtdcExecOrderField pExecOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
	}

	@Override
	public void OnRspQryForQuote(CThostFtdcForQuoteField pForQuote, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
	}

	@Override
	public void OnRspQryQuote(CThostFtdcQuoteField pQuote, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
	}

	@Override
	public void OnRspQryOptionSelfClose(CThostFtdcOptionSelfCloseField pOptionSelfClose,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryInvestUnit(CThostFtdcInvestUnitField pInvestUnit, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryCombInstrumentGuard(CThostFtdcCombInstrumentGuardField pCombInstrumentGuard,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryCombAction(CThostFtdcCombActionField pCombAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryTransferSerial(CThostFtdcTransferSerialField pTransferSerial, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryAccountregister(CThostFtdcAccountregisterField pAccountregister,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	// ????????????
	@Override
	public void OnRtnOrder(CThostFtdcOrderField pOrder) {

		try {
			String newRef = pOrder.getOrderRef();
			// ????????????????????????
			orderRef = Math.max(orderRef, Integer.valueOf(newRef));

			String symbol = pOrder.getInstrumentID();
			String exchange = CtpConstant.exchangeMapReverse.get(pOrder.getExchangeID());
			String rtSymbol = symbol + "." + exchange;
			/*
			 * CTP???????????????????????????????????????frontID, sessionID, orderID????????????
			 * ????????????????????????,???????????????CTP???OrderRef????????????,???????????? ??????????????????OrderRef?????????????????????????????????????????????????????????????????????????????????
			 */
			String orderID = pOrder.getOrderRef();
			String rtOrderID = gatewayID + "." + orderID;
			String direction = CtpConstant.directionMapReverse.get(pOrder.getDirection());
			String offset = CtpConstant.offsetMapReverse.get(pOrder.getCombOffsetFlag().toCharArray()[0]);
			double price = pOrder.getLimitPrice();
			int totalVolume = pOrder.getVolumeTotalOriginal();
			int tradedVolume = pOrder.getVolumeTraded();
			String status = CtpConstant.statusMapReverse.get(pOrder.getOrderStatus());
			String tradingDay = tradingDayStr;
			String orderDate = pOrder.getInsertDate();
			String orderTime = pOrder.getInsertTime();
			String cancelTime = pOrder.getCancelTime();
			String activeTime = pOrder.getActiveTime();
			String updateTime = pOrder.getUpdateTime();
			Order order=new Order();
			order.setAllValue(newRef, symbol, exchange, rtSymbol, orderID, rtOrderID, direction, offset, 
					price, totalVolume, tradedVolume, status, tradingDay, orderDate, orderTime, cancelTime, 
					activeTime, updateTime, totalVolume, tradedVolume);
			if(lastOrder==null) {
				lastOrder=new Order();
			}
			if(!lastOrder.MyToString().equals(order.MyToString())) {
				log.info("aaa->{},{},{}",gatewayID, symbol, exchange);
				lastOrder=order;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	// ????????????
	@Override
	public void OnRtnTrade(CThostFtdcTradeField pTrade) {

		try {
			Trade trade = new Trade();
			trade.setGatewayID(gatewayID);
			trade.setSymbol(pTrade.getInstrumentID());
			trade.setExchange(CtpConstant.exchangeMapReverse.get(pTrade.getExchangeID()));
			trade.setRtSymbol(trade.getSymbol() + "." + trade.getExchange());

			trade.setTradeID(pTrade.getTradeID());
			trade.setRtTradeID(gatewayID + "." + trade.getTradeID());

			trade.setOrderID(pTrade.getOrderRef());
			trade.setRtOrderID(gatewayID + "." + pTrade.getOrderRef());

			// ??????
			trade.setDirection(CtpConstant.directionMapReverse.getOrDefault(pTrade.getDirection(), ""));

			// ??????
			trade.setOffset(CtpConstant.offsetMapReverse.getOrDefault(pTrade.getOffsetFlag(), ""));

			trade.setPrice(pTrade.getPrice());
			trade.setVolume(pTrade.getVolume());
			trade.setTradeTime(pTrade.getTradeTime());
			trade.setTradeDate(pTrade.getTradeDate());

			String symbol = pTrade.getInstrumentID();
			String exchange = CtpConstant.exchangeMapReverse.get(pTrade.getExchangeID());
			String rtSymbol = trade.getSymbol() + "." + trade.getExchange();
			String tradeID = pTrade.getTradeID();
			String rtTradeID = gatewayID + "." + trade.getTradeID();
			String orderID = pTrade.getOrderRef();
			String rtOrderID = gatewayID + "." + pTrade.getOrderRef();
			String direction = CtpConstant.directionMapReverse.getOrDefault(pTrade.getDirection(), "");
			String offset = CtpConstant.offsetMapReverse.getOrDefault(pTrade.getOffsetFlag(), "");
			double price = pTrade.getPrice();
			int volume = pTrade.getVolume();
			String tradingDay = tradingDayStr;
			String tradeDate = pTrade.getTradeDate();
			String tradeTime = pTrade.getTradeTime();
			DateTime dateTime = null;
			Trade trade2=new Trade();
			trade.setAllValue(tradeTime, symbol, exchange, rtSymbol, tradeID, rtTradeID, orderID, rtOrderID, 
					direction, offset, price, volume, tradingDay, tradeDate, tradeTime, dateTime);
			if(lastTrade==null) {
				lastTrade=new Trade();
			}
			if(!lastTrade.MyToString().equals(trade2.MyToString())) {
//				ctpGateway.emitTrade(gatewayID, symbol, exchange, rtSymbol, tradeID, rtTradeID, orderID, rtOrderID,
//						direction, offset, price, volume, tradingDay, tradeDate, tradeTime, dateTime);
				lastTrade=trade2;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ?????????????????????????????????
	@Override
	public void OnErrRtnOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo) {

		try {
			String symbol = pInputOrder.getInstrumentID();
			String exchange = CtpConstant.exchangeMapReverse.get(pInputOrder.getExchangeID());
			String rtSymbol = symbol + "." + exchange;
			String orderID = pInputOrder.getOrderRef();
			String rtOrderID = gatewayID + "." + orderID;
			String direction = CtpConstant.directionMapReverse.get(pInputOrder.getDirection());
			String offset = CtpConstant.offsetMapReverse.get(pInputOrder.getCombOffsetFlag().toCharArray()[0]);
			double price = pInputOrder.getLimitPrice();
			int totalVolume = pInputOrder.getVolumeTotalOriginal();
			int tradedVolume = 0;
			String status = RtConstant.STATUS_REJECTED;
			String tradingDay = tradingDayStr;
			String orderDate = null;
			String orderTime = null;
			String cancelTime = null;
			String activeTime = null;
			String updateTime = null;

//			ctpGateway.emitOrder(gatewayID, symbol, exchange, rtSymbol, orderID, rtOrderID, direction, offset, price,
//					totalVolume, tradedVolume, status, tradingDay, orderDate, orderTime, cancelTime, activeTime,
//					updateTime, frontID, sessionID);
			String logContent = MessageFormat.format("{0}?????????????????????????????????????????????! ErrorID:{1},ErrorMsg:{2}", gatewayLogInfo,
					pRspInfo.getErrorID(), pRspInfo.getErrorMsg());
			log.error(logContent);
			ctpGateway.emitErrorLog(logContent);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ?????????????????????????????????
	@Override
	public void OnErrRtnOrderAction(CThostFtdcOrderActionField pOrderAction, CThostFtdcRspInfoField pRspInfo) {

		try {
			String logContent = MessageFormat.format("{0}?????????????????????????????????????????????! ErrorID:{1},ErrorMsg:{2}", gatewayLogInfo,
					pRspInfo.getErrorID(), pRspInfo.getErrorMsg());
			log.error(logContent);
			ctpGateway.emitErrorLog(logContent);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void OnRtnInstrumentStatus(CThostFtdcInstrumentStatusField pInstrumentStatus) {
	}

	@Override
	public void OnRtnBulletin(CThostFtdcBulletinField pBulletin) {
	}

	@Override
	public void OnRtnTradingNotice(CThostFtdcTradingNoticeInfoField pTradingNoticeInfo) {
	}

	@Override
	public void OnRtnErrorConditionalOrder(CThostFtdcErrorConditionalOrderField pErrorConditionalOrder) {
	}

	@Override
	public void OnRtnExecOrder(CThostFtdcExecOrderField pExecOrder) {
	}

	@Override
	public void OnErrRtnExecOrderInsert(CThostFtdcInputExecOrderField pInputExecOrder,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnExecOrderAction(CThostFtdcExecOrderActionField pExecOrderAction,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnForQuoteInsert(CThostFtdcInputForQuoteField pInputForQuote, CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnRtnQuote(CThostFtdcQuoteField pQuote) {
	}

	@Override
	public void OnErrRtnQuoteInsert(CThostFtdcInputQuoteField pInputQuote, CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnQuoteAction(CThostFtdcQuoteActionField pQuoteAction, CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
	}

	@Override
	public void OnRtnCFMMCTradingAccountToken(CThostFtdcCFMMCTradingAccountTokenField pCFMMCTradingAccountToken) {
	}

	@Override
	public void OnErrRtnBatchOrderAction(CThostFtdcBatchOrderActionField pBatchOrderAction,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnRtnOptionSelfClose(CThostFtdcOptionSelfCloseField pOptionSelfClose) {
	}

	@Override
	public void OnErrRtnOptionSelfCloseInsert(CThostFtdcInputOptionSelfCloseField pInputOptionSelfClose,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnOptionSelfCloseAction(CThostFtdcOptionSelfCloseActionField pOptionSelfCloseAction,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnRtnCombAction(CThostFtdcCombActionField pCombAction) {
	}

	@Override
	public void OnErrRtnCombActionInsert(CThostFtdcInputCombActionField pInputCombAction,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnRspQryContractBank(CThostFtdcContractBankField pContractBank, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryParkedOrder(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryTradingNotice(CThostFtdcTradingNoticeField pTradingNotice, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryBrokerTradingParams(CThostFtdcBrokerTradingParamsField pBrokerTradingParams,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQryBrokerTradingAlgos(CThostFtdcBrokerTradingAlgosField pBrokerTradingAlgos,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQueryCFMMCTradingAccountToken(
			CThostFtdcQueryCFMMCTradingAccountTokenField pQueryCFMMCTradingAccountToken,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRtnFromBankToFutureByBank(CThostFtdcRspTransferField pRspTransfer) {
	}

	@Override
	public void OnRtnFromFutureToBankByBank(CThostFtdcRspTransferField pRspTransfer) {
	}

	@Override
	public void OnRtnRepealFromBankToFutureByBank(CThostFtdcRspRepealField pRspRepeal) {
	}

	@Override
	public void OnRtnRepealFromFutureToBankByBank(CThostFtdcRspRepealField pRspRepeal) {
	}

	@Override
	public void OnRtnFromBankToFutureByFuture(CThostFtdcRspTransferField pRspTransfer) {
	}

	@Override
	public void OnRtnFromFutureToBankByFuture(CThostFtdcRspTransferField pRspTransfer) {
	}

	@Override
	public void OnRtnRepealFromBankToFutureByFutureManual(CThostFtdcRspRepealField pRspRepeal) {
	}

	@Override
	public void OnRtnRepealFromFutureToBankByFutureManual(CThostFtdcRspRepealField pRspRepeal) {
	}

	@Override
	public void OnRtnQueryBankBalanceByFuture(CThostFtdcNotifyQueryAccountField pNotifyQueryAccount) {
	}

	@Override
	public void OnErrRtnBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnRepealBankToFutureByFutureManual(CThostFtdcReqRepealField pReqRepeal,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnRepealFutureToBankByFutureManual(CThostFtdcReqRepealField pReqRepeal,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnErrRtnQueryBankBalanceByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount,
			CThostFtdcRspInfoField pRspInfo) {
	}

	@Override
	public void OnRtnRepealFromBankToFutureByFuture(CThostFtdcRspRepealField pRspRepeal) {
	}

	@Override
	public void OnRtnRepealFromFutureToBankByFuture(CThostFtdcRspRepealField pRspRepeal) {
	}

	@Override
	public void OnRspFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRspQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}

	@Override
	public void OnRtnOpenAccountByBank(CThostFtdcOpenAccountField pOpenAccount) {
	}

	@Override
	public void OnRtnCancelAccountByBank(CThostFtdcCancelAccountField pCancelAccount) {
	}

	@Override
	public void OnRtnChangeAccountByBank(CThostFtdcChangeAccountField pChangeAccount) {
	}
}