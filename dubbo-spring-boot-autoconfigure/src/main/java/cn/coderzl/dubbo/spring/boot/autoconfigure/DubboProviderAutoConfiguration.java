package cn.coderzl.dubbo.spring.boot.autoconfigure;

import com.alibaba.dubbo.config.ProviderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p> dubbo提供者自动配置 </p>
 *
 * @author coderzl
 * @Title DubboProviderAutoConfiguration
 * @date 2017/12/4 10:27
 * @package cn.coderzl.dubbo.spring.boot.autoconfigure
 */
@Configuration
@EnableConfigurationProperties(DubboProperties.class)
@AutoConfigureAfter(DubboAutoConfiguration.class)
public class DubboProviderAutoConfiguration {

    @Autowired
    private DubboProperties dubboProperties;

    @Bean
    @ConditionalOnMissingBean
    public ProviderConfig getProviderConfig(){
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setRetries(dubboProperties.getRetries());
        providerConfig.setFilter(dubboProperties.getConsumerFilter());
        providerConfig.setTimeout(dubboProperties.getTimeout());
        providerConfig.setGroup(dubboProperties.getGroup());
        return providerConfig;
    }
}
