package xyz.redtorch.trader.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

import xyz.redtorch.trader.base.RtConstant;

/**
 * @author sun0x00@gmail.com
 */
public class LocalPositionDetail implements Serializable{
	
	private static final long serialVersionUID = 3912578572233290138L;
	
	private HashSet<String> WORKING_STATUS = new HashSet<String>() {
		private static final long serialVersionUID = -2273398861717690036L;
		{
			add(RtConstant.STATUS_UNKNOWN);
			add(RtConstant.STATUS_NOTTRADED);
			add(RtConstant.STATUS_PARTTRADED);
		}
	};
	public LocalPositionDetail(String gatewayID,String gatewayDisplayName, String exchange, String rtSymbol, String symbol, String contractName,int contractSize){
		this.rtSymbol = rtSymbol;
		this.gatewayID = gatewayID;
		this.gatewayDisplayName = gatewayDisplayName;
		this.contractName = contractName;
		this.contractSize = contractSize;
		this.exchange = exchange;
		this.symbol = symbol;
	}
	public LocalPositionDetail() {}
	
	private String rtSymbol;
	private String gatewayID;
	private String gatewayDisplayName;

	private String symbol;
	private String contractName;
	private int contractSize;
	private String exchange;

	private int longPos;
	private int longYd;
	private int longTd;
	private int longPosFrozen;
	private int longYdFrozen;
	private int longTdFrozen;
	private double longPnl;
	private double longPrice;

	private int shortPos;
	private int shortYd;
	private int shortTd;
	private int shortPosFrozen;
	private int shortYdFrozen;
	private int shortTdFrozen;
	private double shortPnl;
	private double shortPrice;

	private double lastPrice;
	
	private HashMap<String, Order> workingOrderMap = new HashMap<>();

	public String getRtSymbol() {
		return rtSymbol;
	}
	public void setRtSymbol(String rtSymbol) {
		this.rtSymbol = rtSymbol;
	}
	public String getGatewayID() {
		return gatewayID;
	}
	public void setGatewayID(String gatewayID) {
		this.gatewayID = gatewayID;
	}
	public String getGatewayDisplayName() {
		return gatewayDisplayName;
	}
	public void setGatewayDisplayName(String gatewayDisplayName) {
		this.gatewayDisplayName = gatewayDisplayName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public int getContractSize() {
		return contractSize;
	}
	public void setContractSize(int contractSize) {
		this.contractSize = contractSize;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public int getLongPos() {
		return longPos;
	}
	public void setLongPos(int longPos) {
		this.longPos = longPos;
	}
	public int getLongYd() {
		return longYd;
	}
	public void setLongYd(int longYd) {
		this.longYd = longYd;
	}
	public int getLongTd() {
		return longTd;
	}
	public void setLongTd(int longTd) {
		this.longTd = longTd;
	}
	public int getLongPosFrozen() {
		return longPosFrozen;
	}
	public void setLongPosFrozen(int longPosFrozen) {
		this.longPosFrozen = longPosFrozen;
	}
	public int getLongYdFrozen() {
		return longYdFrozen;
	}
	public void setLongYdFrozen(int longYdFrozen) {
		this.longYdFrozen = longYdFrozen;
	}
	public int getLongTdFrozen() {
		return longTdFrozen;
	}
	public void setLongTdFrozen(int longTdFrozen) {
		this.longTdFrozen = longTdFrozen;
	}
	public double getLongPnl() {
		return longPnl;
	}
	public void setLongPnl(double longPnl) {
		this.longPnl = longPnl;
	}
	public double getLongPrice() {
		return longPrice;
	}
	public void setLongPrice(double longPrice) {
		this.longPrice = longPrice;
	}
	public int getShortPos() {
		return shortPos;
	}
	public void setShortPos(int shortPos) {
		this.shortPos = shortPos;
	}
	public int getShortYd() {
		return shortYd;
	}
	public void setShortYd(int shortYd) {
		this.shortYd = shortYd;
	}
	public int getShortTd() {
		return shortTd;
	}
	public void setShortTd(int shortTd) {
		this.shortTd = shortTd;
	}
	public int getShortPosFrozen() {
		return shortPosFrozen;
	}
	public void setShortPosFrozen(int shortPosFrozen) {
		this.shortPosFrozen = shortPosFrozen;
	}
	public int getShortYdFrozen() {
		return shortYdFrozen;
	}
	public void setShortYdFrozen(int shortYdFrozen) {
		this.shortYdFrozen = shortYdFrozen;
	}
	public int getShortTdFrozen() {
		return shortTdFrozen;
	}
	public void setShortTdFrozen(int shortTdFrozen) {
		this.shortTdFrozen = shortTdFrozen;
	}
	public double getShortPnl() {
		return shortPnl;
	}
	public void setShortPnl(double shortPnl) {
		this.shortPnl = shortPnl;
	}
	public double getShortPrice() {
		return shortPrice;
	}
	public void setShortPrice(double shortPrice) {
		this.shortPrice = shortPrice;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	/**
	 * ????????????
	 * 
	 * @param trade
	 */
	public void updateTrade(Trade trade) {

		if (RtConstant.DIRECTION_LONG.equals(trade.getDirection())) {// ??????
			if (RtConstant.OFFSET_OPEN.equals(trade.getOffset())) {// ??????
				longTd += trade.getVolume();
			}else if (RtConstant.OFFSET_CLOSETODAY.equals(trade.getOffset())) {// ??????
				shortTd -= trade.getVolume();
			} else if (RtConstant.OFFSET_CLOSEYESTERDAY.equals(trade.getOffset())) {// ??????
				shortYd -= trade.getVolume();
			} else if (RtConstant.OFFSET_CLOSE.equals(trade.getOffset())) {// ??????
				if (RtConstant.EXCHANGE_SHFE.equals(exchange)) {// ????????????????????????
					shortYd -= trade.getVolume();
				} else {
					// ????????????,????????????
					shortTd -= trade.getVolume();
					if (shortTd < 0) {
						shortYd += shortTd;
						shortTd = 0;
					}
				}
			}

		} else if (RtConstant.DIRECTION_SHORT.equals(trade.getDirection())) { // ??????
			// ??????
			if (RtConstant.OFFSET_OPEN.equals(trade.getOffset())) {
				shortTd += trade.getVolume();
			}else if (RtConstant.OFFSET_CLOSETODAY.equals(trade.getOffset())) {// ??????
				longTd -= trade.getVolume();
			} else if (RtConstant.OFFSET_CLOSEYESTERDAY.equals(trade.getOffset())) {// ??????
				longYd -= trade.getVolume();
			} else if (RtConstant.OFFSET_CLOSE.equals(trade.getOffset())) {// ??????
				if (RtConstant.EXCHANGE_SHFE.equals(exchange)) {// ????????????????????????
					longYd -= trade.getVolume();
				} else {// ????????????,????????????
					longTd -= trade.getVolume();
					if (longTd < 0) {
						longYd += longTd;
						longTd = 0;
					}
				}
			}
		}
		// ????????????
		calculatePrice(trade);
		calculatePosition();
		calculatePnl();
	}

	/**
	 * ????????????
	 * 
	 * @param order
	 */
	public void updateOrder(Order order) {
		// ???????????????????????????
		if (WORKING_STATUS.contains(order.getStatus())) {
			workingOrderMap.put(order.getRtOrderID(), order);

			// ????????????????????????????????????
		} else {
			if (workingOrderMap.containsKey(order.getRtOrderID())) {
				workingOrderMap.remove(order.getRtOrderID());
			}
		}

		// ????????????
		calculateFrozen();
	}

	/**
	 * ????????????
	 * 
	 * @param orderReq
	 */
	public void updateOrderReq(OrderReq orderReq, String rtOrderID) {
		// ??????????????????????????????
		Order order = new Order();
		order.setRtSymbol(orderReq.getRtSymbol());
		order.setSymbol(orderReq.getSymbol());
		order.setExchange(orderReq.getExchange());
		order.setOffset(orderReq.getOffset());
		order.setDirection(orderReq.getDirection());
		order.setTotalVolume(orderReq.getVolume());
		order.setStatus(RtConstant.STATUS_UNKNOWN);
		order.setGatewayID(orderReq.getGatewayID());
		order.setRtOrderID(rtOrderID);

		workingOrderMap.put(rtOrderID, order);

		calculateFrozen();

	}
	
	/**
	 * ????????????
	 * @param lastPrice
	 */
	public void updateLastPrice(double lastPrice) {
    	this.lastPrice = lastPrice;
    	calculatePnl();
    }
	
	/**
	 * ??????????????????
	 */
    public void calculatePnl() {
        longPnl = longPos * (lastPrice - longPrice) * contractSize;
        shortPnl = shortPos * (shortPrice - lastPrice) * contractSize;
    }
	
	/**
	 * ??????????????????????????????????????????
	 * @param trade
	 */
	public void calculatePrice(Trade trade) {
        // ?????????????????????????????????
        if(RtConstant.OFFSET_OPEN.equals(trade.getOffset())) {
        	double cost = 0;
        	int newPos = 0;
            if(RtConstant.DIRECTION_LONG.equals(trade.getDirection())) {
            	cost =  longPrice *  longPos;
                cost += trade.getVolume() * trade.getPrice();
                newPos = longPos + trade.getVolume();
                if(newPos>0) {
                    longPrice = cost / newPos;
                } else {
                    longPrice = 0;
                }
            }else {
                cost = shortPrice * shortPos;
                cost += trade.getVolume() * trade.getPrice();
                newPos = shortPos + trade.getVolume();
                if(newPos>0) {
                    shortPrice = cost / newPos;
                } else {
                	shortPrice = 0;
                }
            }
        }

	}
	

	public void calculatePosition() {
		longPos = longTd + longYd;
		shortPos = shortTd + shortYd;
	}
	/**
	 * ????????????
	 */
	public void calculateFrozen() {
		// ??????????????????
		longPosFrozen = 0;
		longYdFrozen = 0;
		longTdFrozen = 0;
		shortPosFrozen = 0;
		shortYdFrozen = 0;
		shortTdFrozen = 0;

		int frozenVolume = 0;

		// ????????????
		for (Order order : workingOrderMap.values()) {
			// ?????????????????????
			frozenVolume = order.getTotalVolume() - order.getTradedVolume();
			if (RtConstant.DIRECTION_LONG.equals(order.getDirection())) {// ????????????
				if (RtConstant.OFFSET_CLOSETODAY.equals(order.getOffset())) {// ??????
					shortTdFrozen += frozenVolume;
				} else if (RtConstant.OFFSET_CLOSEYESTERDAY.equals(order.getOffset())) {// ??????
					shortYdFrozen += frozenVolume;
				} else if (RtConstant.OFFSET_CLOSE.equals(order.getOffset())) {// ??????
					shortTdFrozen += frozenVolume;
					if (shortTdFrozen > shortTd) {
						shortYdFrozen += (shortTdFrozen - shortTd);
						shortTdFrozen = shortTd;
					}
				}
			} else if (RtConstant.DIRECTION_SHORT.equals(order.getDirection())) {// ????????????
				if (RtConstant.OFFSET_CLOSETODAY.equals(order.getOffset())) { // ??????
					longTdFrozen += frozenVolume;
				} else if (RtConstant.OFFSET_CLOSEYESTERDAY.equals(order.getOffset())) { // ??????
					longYdFrozen += frozenVolume;
				} else if (RtConstant.OFFSET_CLOSE.equals(order.getOffset())) {// ??????
					longTdFrozen += frozenVolume;
					if (longTdFrozen > longTd) {
						longYdFrozen += (longTdFrozen - longTd);
						longTdFrozen = longTd;
					}
				}
			}
			// ??????????????????
			longPosFrozen = longYdFrozen + longTdFrozen;
			shortPosFrozen = shortYdFrozen + shortTdFrozen;
		}

	}
	
	/**
	 * ??????Position????????????
	 * @param position
	 */
	public void updatePosition(Position position) {
		
		if(RtConstant.DIRECTION_LONG.equals(position.getDirection())) {
            longPos = position.getPosition();
            longYd = position.getYdPosition();
            longTd = longPos - longYd;
            longPnl = position.getPositionProfit();
            longPrice = position.getPrice();
			
		}else if(RtConstant.DIRECTION_SHORT.equals(position.getDirection())){
            shortPos = position.getPosition();
            shortYd = position.getYdPosition();
            shortTd = shortPos - shortYd;
            shortPnl = position.getPositionProfit();
            shortPrice = position.getPrice();
		}

		
	}

}
