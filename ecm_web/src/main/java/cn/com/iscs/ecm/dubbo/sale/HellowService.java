package cn.com.iscs.ecm.dubbo.sale;

/**
 * Created by xuchun on 16/2/25.
 */
public class HellowService implements IHellowService {
    @Override
    public String hellow(String ss) throws Exception {
        return ss+333;
    }
}
