package xyz.redtorch.api.jctp;

import xyz.redtorch.trader.base.RtConstant;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author sun0x00@gmail.com
 */
public class CtpConstant {
	public static Map<String,Character> priceTypeMap = new HashMap<>();
	public static Map<Character,String> priceTypeMapReverse = new HashMap<>();
	
	public static Map<String,Character> directionMap = new HashMap<>();
	public static Map<Character,String> directionMapReverse = new HashMap<>();
	
	public static Map<String,Character> offsetMap = new HashMap<>();
	public static Map<Character,String> offsetMapReverse = new HashMap<>();
	
	public static Map<String,String> exchangeMap = new HashMap<>();
	public static Map<String,String> exchangeMapReverse = new HashMap<>();
	

	public static Map<String,Character> posiDirectionMap = new HashMap<>();
	public static Map<Character,String> posiDirectionMapReverse = new HashMap<>();
	
	public static Map<String,Character> productClassMap = new HashMap<>();
	public static Map<Character,String> productClassMapReverse = new HashMap<>();
	

	public static Map<String,Character> statusMap = new HashMap<>();
	public static Map<Character,String> statusMapReverse = new HashMap<>();
	
	static {
		
		// 价格类型映射
		priceTypeMap.put(RtConstant.PRICETYPE_LIMITPRICE, jctpv6v5v1x64apiConstants.THOST_FTDC_OPT_LimitPrice);
		priceTypeMap.put(RtConstant.PRICETYPE_MARKETPRICE, jctpv6v5v1x64apiConstants.THOST_FTDC_OPT_AnyPrice);
		priceTypeMapReverse = priceTypeMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		
		// 方向类型映射
		directionMap.put(RtConstant.DIRECTION_LONG, jctpv6v5v1x64apiConstants.THOST_FTDC_D_Buy);
		directionMap.put(RtConstant.DIRECTION_SHORT, jctpv6v5v1x64apiConstants.THOST_FTDC_D_Sell);
		directionMapReverse = directionMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		
		// 开平类型映射
		offsetMap.put(RtConstant.OFFSET_OPEN, jctpv6v5v1x64apiConstants.THOST_FTDC_OF_Open);
		offsetMap.put(RtConstant.OFFSET_CLOSE, jctpv6v5v1x64apiConstants.THOST_FTDC_OF_Close);
		offsetMap.put(RtConstant.OFFSET_CLOSETODAY, jctpv6v5v1x64apiConstants.THOST_FTDC_OF_CloseToday);
		offsetMap.put(RtConstant.OFFSET_CLOSEYESTERDAY, jctpv6v5v1x64apiConstants.THOST_FTDC_OF_CloseYesterday);
		offsetMapReverse = offsetMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		
		// 交易所映射
		exchangeMap.put(RtConstant.EXCHANGE_CFFEX, "CFFEX");
		exchangeMap.put(RtConstant.EXCHANGE_SHFE, "SHFE");
		exchangeMap.put(RtConstant.EXCHANGE_CZCE, "CZCE");
		exchangeMap.put(RtConstant.EXCHANGE_DCE, "DCE");
		exchangeMap.put(RtConstant.EXCHANGE_SSE, "SSE");
		exchangeMap.put(RtConstant.EXCHANGE_SZSE, "SZSE");
		exchangeMap.put(RtConstant.EXCHANGE_INE, "INE");
		exchangeMap.put(RtConstant.EXCHANGE_UNKNOWN, "");
		exchangeMapReverse = exchangeMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		
		//持仓类型映射
		posiDirectionMap.put(RtConstant.DIRECTION_NET, jctpv6v5v1x64apiConstants.THOST_FTDC_PD_Net);
		posiDirectionMap.put(RtConstant.DIRECTION_LONG, jctpv6v5v1x64apiConstants.THOST_FTDC_PD_Long);
		posiDirectionMap.put(RtConstant.DIRECTION_SHORT, jctpv6v5v1x64apiConstants.THOST_FTDC_PD_Short);
		posiDirectionMapReverse = posiDirectionMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		

		// 产品类型映射
		productClassMap.put(RtConstant.PRODUCT_FUTURES, jctpv6v5v1x64apiConstants.THOST_FTDC_PC_Futures);
		productClassMap.put(RtConstant.PRODUCT_OPTION, jctpv6v5v1x64apiConstants.THOST_FTDC_PC_Options);
		productClassMap.put(RtConstant.PRODUCT_COMBINATION, jctpv6v5v1x64apiConstants.THOST_FTDC_PC_Combination);
		productClassMapReverse = productClassMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
//		v6.3.11不支持个股期权
//		productClassMapReverse.put(jctpv6v5v1x64apiConstants.THOST_FTDC_PC_ETFOption, RtConstant.PRODUCT_OPTION);
//		productClassMapReverse.put(jctpv6v5v1x64apiConstants.THOST_FTDC_PC_S, RtConstant.PRODUCT_EQUITY);
		
		// 委托状态映射
		statusMap.put(RtConstant.STATUS_ALLTRADED, jctpv6v5v1x64apiConstants.THOST_FTDC_OST_AllTraded);
		statusMap.put(RtConstant.STATUS_PARTTRADED, jctpv6v5v1x64apiConstants.THOST_FTDC_OST_PartTradedQueueing);
		statusMap.put(RtConstant.STATUS_NOTTRADED, jctpv6v5v1x64apiConstants.THOST_FTDC_OST_NoTradeQueueing);
		statusMap.put(RtConstant.STATUS_CANCELLED, jctpv6v5v1x64apiConstants.THOST_FTDC_OST_Canceled);
		statusMap.put(RtConstant.STATUS_UNKNOWN, jctpv6v5v1x64apiConstants.THOST_FTDC_OST_Unknown);
		statusMapReverse = statusMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		
		
		
	}
}
