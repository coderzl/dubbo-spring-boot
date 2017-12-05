package cn.coderzl.dubbo.spring.boot.test;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("cn.coderzl")
public class DubboSpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringBootTestApplication.class, args);
	}
}
