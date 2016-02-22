package cn.com.iscs.ecm.api.out;

import java.util.List;

public interface IRefundApi {
    /**
     * 查询订单
     * @param tid
     * @return
     */
    Object fetchRefunds(String tid);

    /**
     * 查询订单
     *
     * @param dateType  1 修改时间  2 创建时间  3 付款时间
     * @param startDate
     * @param endDate
     * @return
     */
    List fetchRefunds(int dateType,String startDate,String endDate);


    /**
     * 更新订单状态
     * @param tid
     * @param status
     * @return
     */
    String updateRefundStatus(String tid,String status);

}
