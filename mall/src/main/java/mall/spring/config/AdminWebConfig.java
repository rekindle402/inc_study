package mall.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*Spring의 고전적 설정을 담당하는 xml을 대신하는 JAVA Class*/

@Configuration
@ComponentScan(basePackages = {"mall.admin.controller"})
public class AdminWebConfig {
	
}
