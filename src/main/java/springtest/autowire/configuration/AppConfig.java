package springtest.autowire.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"springtest.autowire.beans"})

public class AppConfig {

}
