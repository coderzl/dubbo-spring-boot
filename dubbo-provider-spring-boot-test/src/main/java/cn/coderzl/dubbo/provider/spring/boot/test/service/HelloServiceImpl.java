package cn.coderzl.dubbo.provider.spring.boot.test.service;

import cn.coderzl.dubbo.api.spring.boot.test.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.PostConstruct;

/**
 * <p> dubbo接口实现 </p>
 *
 * @author coderzl
 * @Title HelloServiceImpl
 * @date 2017/12/4 18:52
 * @package cn.coderzl.dubbo.provider.spring.boot.test.service
 */
@Service(version="1.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        System.out.println("dubbo 请求进入：" + name);
        return name + ": Hello!";
    }

    @PostConstruct
    private void init(){
        System.err.println("dubbo实现被初始化");
    }
}
