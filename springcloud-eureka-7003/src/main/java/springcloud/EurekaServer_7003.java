package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主入口
 * @author lee
 * @date 2020/10/6 - 2:27 下午
 */
//启动之后访问7003端口
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 服务的主启动类 可以接受其他服务注册进来
public class EurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class,args);
    }
}
