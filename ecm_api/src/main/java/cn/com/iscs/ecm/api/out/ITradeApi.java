package cn.com.iscs.ecm.api.out;

import java.util.List;

public interface ITradeApi {
    /**
     * 查询订单
     * @param tid
     * @return
     */
    Object fetchTrades(String tid);

    /**
     * 查询订单
     *
     * @param dateType  1 修改时间  2 创建时间  3 付款时间
     * @param startDate
     * @param endDate
     * @return
     */
    List fetchTrades(int dateType,String startDate,String endDate);

    /**
     * 更新订单备注
     * @param tid
     * @param memo
     * @return
     */
    String updateTradeMemo(String tid,String memo);

    /**
     * 更新订单状态
     * @param tid
     * @param status
     * @return
     */
    String updateTradeStatus(String tid,String status);


    /**
     * 线上发货通知
     * @param tid
     * @param transportCode
     * @param transportName
     * @param outSid
     * @return
     */
    String shipNotic(String tid,String transportCode,String transportName,String outSid);

    /**
     * 货到付款发货通知
     */
}
