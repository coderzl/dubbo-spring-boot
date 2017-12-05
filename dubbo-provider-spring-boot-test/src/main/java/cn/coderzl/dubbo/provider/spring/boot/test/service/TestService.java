package cn.coderzl.dubbo.provider.spring.boot.test.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * <p>  </p>
 *
 * @author coderzl
 * @Title TestService
 * @date 2017/12/4 19:29
 * @package cn.coderzl.dubbo.provider.spring.boot.test.service
 */
@Service
public class TestService {
    @PostConstruct
    void init(){
        System.out.println("Test");
    }
}
