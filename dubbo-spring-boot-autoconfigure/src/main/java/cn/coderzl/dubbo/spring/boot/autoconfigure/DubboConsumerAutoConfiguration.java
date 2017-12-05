package cn.coderzl.dubbo.spring.boot.autoconfigure;

import com.alibaba.dubbo.config.ConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p> dubbo消费者自动配置 </p>
 *
 * @author coderzl
 * @Title DubboConsumerAutoConfiguration
 * @date 2017/12/4 10:26
 * @package cn.coderzl.dubbo.spring.boot.autoconfigure
 */
@Configuration
@EnableConfigurationProperties(DubboProperties.class)
@AutoConfigureAfter(DubboAutoConfiguration.class)
public class DubboConsumerAutoConfiguration {

    @Autowired
    private DubboProperties dubboProperties;

    @Bean
    @ConditionalOnMissingBean
    public ConsumerConfig getConsumerConfig(){
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setRetries(dubboProperties.getRetries());
        consumerConfig.setTimeout(dubboProperties.getTimeout());
        consumerConfig.setCheck(dubboProperties.isConsumerCheck());
        consumerConfig.setGroup(dubboProperties.getGroup());
        return consumerConfig;
    }
}
