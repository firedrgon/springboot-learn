package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.atguigu.component.LoginHandlerInterceptor;
import com.atguigu.component.MyLocaleResolver;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// super.addViewControllers(registry);
		// 浏览器发送 /atguigu 请求来到 success
		registry.addViewController("/atguigu").setViewName("success");
	}

	// 所有的WebMvcConfigurerAdapter
	@Bean // 将组件注册在容器
	public WebMvcConfigurer webMvcConfigurerAdapter() {
		WebMvcConfigurer adapter = new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/index.html").setViewName("login");
				registry.addViewController("/main.html").setViewName("dashboard");
			}

//			@Override
//			public void addInterceptors(InterceptorRegistry registry) {
//				registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/",
//						"/index.html", "/user/login","/webjars/**");
//			}
		};

		return adapter;
	}

	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocaleResolver();
	}
}
