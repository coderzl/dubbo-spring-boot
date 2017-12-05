package cn.coderzl.dubbo.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p> dubbo配置属性 </p>
 *
 * @author coderzl
 * @Title DubboProperties
 * @date 2017/12/2 17:42
 * @package cn.coderzl.dubbo.spring.boot.autoconfigure
 */
@ConfigurationProperties(prefix = DubboProperties.DUBBO_PREFIX)
public class DubboProperties {
    public static final String DUBBO_PREFIX = "dubbo";

    /** 消费者配置开关 默认关闭 */
    private boolean consumerTrigger;
    /** 生产者配置开关 默认关闭 */
    private boolean providerTrigger;
    /** applicationName */
    private String applicationName;
    /** 注册中心地址 */
    private String registryAddress;
    /** 启动时是否检查注册中心 */
    private boolean registryCheck =  false;
    /** 协议 默认：dubbo */
    private String protocol = "dubbo";
    /** 端口 默认 20800 */
    private int port = 20800;
    /** HOST */
    private String host;
    /** dubbo 线程数, 默认 200  */
    private int threads = 200;
    /** 重试次数 默认不重试 */
    private int retries = 0;
    /** consumerCheck 默认不检查 */
    private boolean consumerCheck = false;
    /** 消费者过滤器 多个用,隔开 */
    private String consumerFilter;
    /** 提供者者过滤器 多个用,隔开 */
    private String providerFilter;
    /** providerCheck 默认不检查 */
    private boolean providerCheck = false;
    /** group */
    private String group;
    /** 超时时间 */
    private int timeout;


    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getRegistryAddress() {
        return registryAddress;
    }

    public void setRegistryAddress(String registryAddress) {
        this.registryAddress = registryAddress;
    }

    public boolean isRegistryCheck() {
        return registryCheck;
    }

    public void setRegistryCheck(boolean registryCheck) {
        this.registryCheck = registryCheck;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public boolean isConsumerCheck() {
        return consumerCheck;
    }

    public void setConsumerCheck(boolean consumerCheck) {
        this.consumerCheck = consumerCheck;
    }

    public String getConsumerFilter() {
        return consumerFilter;
    }

    public void setConsumerFilter(String consumerFilter) {
        this.consumerFilter = consumerFilter;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isConsumerTrigger() {
        return consumerTrigger;
    }

    public void setConsumerTrigger(boolean consumerTrigger) {
        this.consumerTrigger = consumerTrigger;
    }

    public boolean isProviderTrigger() {
        return providerTrigger;
    }

    public void setProviderTrigger(boolean providerTrigger) {
        this.providerTrigger = providerTrigger;
    }

    public String getProviderFilter() {
        return providerFilter;
    }

    public void setProviderFilter(String providerFilter) {
        this.providerFilter = providerFilter;
    }

    public boolean isProviderCheck() {
        return providerCheck;
    }

    public void setProviderCheck(boolean providerCheck) {
        this.providerCheck = providerCheck;
    }
}
