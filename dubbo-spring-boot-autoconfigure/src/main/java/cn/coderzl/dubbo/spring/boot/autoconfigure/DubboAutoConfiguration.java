package cn.coderzl.dubbo.spring.boot.autoconfigure;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;

/**
 * <p>  </p>
 *
 * @author coderzl
 * @Title DubboAutoConfiguration
 * @date 2017/12/2 17:43
 * @package cn.coderzl.dubbo.spring.boot.autoconfigure
 */
@Configuration
@EnableConfigurationProperties(DubboProperties.class)
public class DubboAutoConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(DubboAutoConfiguration.class);

    @Autowired
    private DubboProperties dubboProperties;

    @PostConstruct
    public void checkConfigFileExists(){
        if (!StringUtils.hasText(dubboProperties.getRegistryAddress()) || !StringUtils.hasText(dubboProperties.getApplicationName())){
            throw new IllegalArgumentException("RegistryAddress or ApplicationName is null");
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public ApplicationConfig getApplicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubboProperties.getApplicationName());
        return applicationConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public RegistryConfig getRegistryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboProperties.getRegistryAddress());
        registryConfig.setCheck(dubboProperties.isRegistryCheck());
        return registryConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public ProtocolConfig getProtocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName(dubboProperties.getProtocol());
        protocolConfig.setHost(dubboProperties.getHost());
        protocolConfig.setPort(dubboProperties.getPort());
        return protocolConfig;
    }

}
