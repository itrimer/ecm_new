package cn.com.iscs.ecm.api.controller;

/**
 * Created by xuchun on 16/2/22.
 */

public class BaseApiController {
//    //获取来源，判断是属于哪个平台，ERP，api过来的。
//
//    public void templateMethod() {
//        Map<String, String> paramMap = new HashMap<String, String>();
//
//        AuthEntity auth = getAuthEntity(paramMap);
//
//
//        String msgResult = validMsg(auth, paramMap);
//        if (!"OK".equals(msgResult)) {
//            writeData(paramMap, "3");
//            return;
//        }
//
//        String method = getMethod(paramMap);
//        if ("saleOrder".equals(method)) {
//            List<SeOrder> orderList = parseOrder(paramMap);
//            String str = saveOrder(orderList);
//            writeData(paramMap, str);
//            return;
//        }
//        if ("purchaseOrder".equals(method)) {
//            return;
//        }
//    }
//
//    // //记录日志，进行response
//    private void writeData(Map<String, String> paramMap, String s) {
//        //记录日志
//    }
//
//    private String saveOrder(List<SeOrder> orderList) {
//        return null;
//    }
//
//    //需要覆盖重写
//    private List<SeOrder> parseOrder(Map<String, String> paramMap) {
//        return null;
//    }
//
//
//    //需要覆盖重写
//    public AuthEntity getAuthEntity(Map<String, String> paramMap) {
//        return null;
//    }
//
//
//    //判断notify_id，是否是发送过的请求。如果是，就直接反馈true
//    public String validMsg(AuthEntity auth, Map<String, String> paramMap) {
//
//
//        return "OK";
//    }
//
//    //解析访问具体的逻辑
//    public String getMethod(Map<String, String> paramMap) {
//
//        return "OK";
//    }
//
//    //


}
