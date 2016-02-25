package cn.com.iscs.ecm.dubbo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuchun on 16/2/24.
 */
@Service
public class HellowService implements  IHellowService{
    @Override
    public String sayHello(String name) {
        return "hellow dubbo";
    }

    @Override
    public List getUsers() {
        List<String> list = new ArrayList<String>();
        list.add("hellow dubbo1");
        list.add("hellow dubbo2");
        return list;
    }
}
