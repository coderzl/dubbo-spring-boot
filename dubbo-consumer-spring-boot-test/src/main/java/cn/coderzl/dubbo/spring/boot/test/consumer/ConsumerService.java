package cn.coderzl.dubbo.spring.boot.test.consumer;

import cn.coderzl.dubbo.api.spring.boot.test.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * <p>  </p>
 *
 * @author coderzl
 * @Title ConsumerService
 * @date 2017/12/4 19:05
 * @package cn.coderzl.dubbo.spring.boot.test.consumer
 */
@Service
public class ConsumerService {

    @Reference(version = "1.0")
    HelloService helloService;

    public String hello(String name){
        String result = helloService.hello(name);
        System.out.println("dubbo返回："+result);
        return result;
    }
}
