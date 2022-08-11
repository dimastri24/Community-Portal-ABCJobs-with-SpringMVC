package com.wdf.springmvc.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.wdf.springmvc")
@PropertySource("classpath:email.properties")
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Autowired
	private Environment env;
	
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
//	@Bean(name="static")
//	public void addResourceHandlers(ResourceHandlerRegistration resources) {
//        resources.addResourceLocations("/static/**");
//    }
	
//	 @Override
//	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	        registry
//	        .addResourceHandler("/static/**")
//	        .addResourceLocations("/static/");
//	        
//	 }     
//	        @Override
//	        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//	        /* if (!registry.hasMappingForPattern("/mytest/**")) {
//	        System.out.println("/////////////////// Resources Handlers //////////////////");
//	        registry.addResourceHandler("/**").addResourceLocations("classpath:/mytest/");
//	        }*/
//
//
//
//	        if (!registry.hasMappingForPattern("/resources/static/**")) {
//	        System.out.println("/////////////////// Resources Handlers 2 //////////////////");
//	        registry.addResourceHandler(
//	        "/resources/images/**",
//	        "/resources/scripts/**",
//	        "/resources/styles/**")
//	        .addResourceLocations(
//	        "classpath:/resources/static/images/",
//	        "classpath:/resources/static/scripts/",
//	        "classpath:/resources/static/styles/");
//
//	        }
//	        }
	        
	 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	
    	/* if (!registry.hasMappingForPattern("/mytest/**")) {
    		 System.out.println("/////////////////// Resources Handlers //////////////////");
    		 registry.addResourceHandler("/**").addResourceLocations("classpath:/mytest/");
    	 }*/
    	
        if (!registry.hasMappingForPattern("/static/**")) {
        	System.out.println("/////////////////// Resources Handlers 2 //////////////////");
        	registry.addResourceHandler(
                    "/img/**",
                    "/css/**",
                    "/script/**")
                    .addResourceLocations(
                            "classpath:/static/img/",
                            "classpath:/static/css/",
                            "classpath:/static/script/");
        }
    }
    
    @Bean
    public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		
		javaMailSenderImpl.setHost(env.getProperty("mail.Host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.Username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.Password"));
		javaMailSenderImpl.setPort(getIntProperty("mail.Port"));
		
		javaMailSenderImpl.setJavaMailProperties(getMailProperty());
		
		return javaMailSenderImpl;
    }
    
	private Properties getMailProperty() {
		
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); 
		
		return mailProperties;
	}
	
	int getIntProperty(String key) {
		
		String property = env.getProperty(key);
		
		return Integer.parseInt(property);
	}
	 
}