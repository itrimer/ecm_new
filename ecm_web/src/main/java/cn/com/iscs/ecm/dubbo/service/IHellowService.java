package cn.com.iscs.ecm.dubbo.service;

import java.util.List;

/**
 * Created by xuchun on 16/2/24.
 */
public interface IHellowService {
    String sayHello(String name);

    public List getUsers();
}
