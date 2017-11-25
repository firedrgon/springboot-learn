package com.didispace;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.List;

@SpringBootApplication
public class Chapter4Application
//		extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter
{

	/**
	 * 第一种FastJson
	 * @param converters
     */
//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		super.configureMessageConverters(converters);
//
//		/**
//		 * 1.需要先定义一个convert转换消息的对象
//		 * 2.添加fastJson的配置信息，比如:是否要格式化返回的json数据;
//		 * 3.convert中添加配置信息
//		 * 4.将convert添加converters中
//		 */
//		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		converter.setFastJsonConfig(fastJsonConfig);
//		converters.add(converter);
//	}

	/**
	 * 第二种添加FastJson解析的方式
	 * @return
     */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig jsonConfig = new FastJsonConfig();
		jsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setFastJsonConfig(jsonConfig);
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(Chapter4Application.class, args);
	}
}





















