package cn.com.iscs.ecm.api.controller;

import cn.com.iscs.base.controller.BasicController;
import cn.com.iscs.ecm.dubbo.sale.IHellowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
* @ClassName: TestController
* @Description: test
* @author: suxl
* @date:2015-01-19 16:40:14
*/
@Controller
@RequestMapping("/test")
public class TestController extends BasicController {
    @Resource
    IHellowService hellowService;

    @RequestMapping(value = "/")
    public ModelAndView list(HttpServletRequest request) throws Exception {
        String str = hellowService.hellow("fdsa");
        ModelAndView mv = new ModelAndView("/");
        mv.addObject("str",str);
        return mv;
    }
}
