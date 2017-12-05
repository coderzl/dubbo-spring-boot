package cn.coderzl.dubbo.provider.spring.boot.test;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "cn.coderzl")
public class DubboProviderSpringBootTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(DubboProviderSpringBootTestApplication.class, args);
	}
}
