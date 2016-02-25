package mq;

import cn.com.iscs.ecm.sale.dao.ITestDao;
import cn.com.iscs.ecm.sale.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xuchun on 16/2/15.
 * 测试CRUD继承 是否能正常运行。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class testServiceExp {
    @Resource
    private ITestDao testDao;
    @Resource
    private ITestService testService;
    @Test
    public void saveTest() throws Exception {
       System.out.println(testDao);
       System.out.println(testDao.getAll());
       System.out.println(testService);
       System.out.println("sss");
    }
}

