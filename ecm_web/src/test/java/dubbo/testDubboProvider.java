package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xuchun on 16/2/15.
 * 测试依赖是否可以正常进行。crud
 */
public class testDubboProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "spring-dubbo-provider.xml"
        });
        context.start();
        while (1 ==1 ) {

        }
    }
}

