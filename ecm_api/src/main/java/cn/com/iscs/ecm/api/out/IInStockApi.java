package cn.com.iscs.ecm.api.out;

import java.util.List;

/**
 * Created by xuchun on 16/2/19.
 */
public interface IInStockApi {
    /**
     * 查询订单
     * @param tid
     * @return
     */
    Object fetchTrades(String tid);

    /**
     * 查询订单
     * @param dateType  1 修改时间  2 创建时间  3 付款时间
     * @param startDate
     * @param endDate
     * @return
     */
    List fetchTrades(int dateType,String startDate,String endDate);

    /**
     * 入库回传
     * @param tid
     * @param status
     * @return
     */
    String updateTradeStatus(String tid,String status);
}
