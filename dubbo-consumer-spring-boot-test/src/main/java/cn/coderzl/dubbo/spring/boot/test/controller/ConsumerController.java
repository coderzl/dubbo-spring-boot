package cn.coderzl.dubbo.spring.boot.test.controller;

import cn.coderzl.dubbo.spring.boot.test.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>  </p>
 *
 * @author coderzl
 * @Title ConsumerController
 * @date 2017/12/5 11:02
 * @package cn.coderzl.dubbo.spring.boot.test.controller
 */
@Controller
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        String name ="你怕不是个傻子";
        return consumerService.hello(name) + "TM:"+System.currentTimeMillis();
    }
}
