package com.atguigu.config;

import java.util.Arrays;

import javax.servlet.Filter;

import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.filter.MyFilter;
import com.atguigu.listener.MyListener;
import com.atguigu.servlet.MyServlet;

/**
 * 配置容器三大组件
* @ClassName: MyServletConfig  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 沈远平 
* @date 2018年6月3日  
*
 */
@Configuration
public class MyServletConfig {
	@Bean
	ServletRegistrationBean myServlet() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
		registrationBean.setLoadOnStartup(1);
		return registrationBean;	
	}
	@Bean
	FilterRegistrationBean myFilter() {
		FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new MyFilter());
		registrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
		return registrationBean;
	}
	@Bean
	ServletListenerRegistrationBean myListener() {
		ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
		return registrationBean;
	}
	

}














