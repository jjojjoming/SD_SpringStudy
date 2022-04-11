package kr.co.soft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kr.co.soft.advisor","kr.co.soft.beans"})
@EnableAspectJAutoProxy
public class BeanConfigClass {

}
