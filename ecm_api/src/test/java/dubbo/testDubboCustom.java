package dubbo;

import cn.com.iscs.base.util.HttpUtil;
import cn.com.iscs.ecm.api.controller.TestController;
import cn.com.iscs.ecm.dubbo.sale.IHellowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xuchun on 16/2/15.
 * 测试依赖是否可以正常进行。crud
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
//@ContextConfiguration(locations = "classpath:spring-dubbo-consumer.xml")
public class testDubboCustom {
    @Resource
    IHellowService hellowService;
    @Resource
    TestController testController;
    @Test
    public void saveTest() throws Exception {
        String sss = hellowService.hellow("fdsafdsafdsa");
        testController.list(null);
        System.out.println(sss);
    }

    @Test
    public void testUrlGet() throws  Exception {
        String str = HttpUtil.sendGet("http://localhost:8089/test/","utf-8");
        System.out.println(str);
    }

}

