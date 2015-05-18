package ru.lenoblgis.trenning.agrocultural.presentationTier.cinfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import ru.lenoblgis.trenning.agrocultural.buisnessTier.services.EventService;
import ru.lenoblgis.trenning.agrocultural.buisnessTier.services.OwnerService;
import ru.lenoblgis.trenning.agrocultural.buisnessTier.services.PassportService;

@Configuration
@EnableWebMvc
@ComponentScan("ru.lenoblgis.trenning.agrocultural.presentationTier.controllers")
public class WebAppConfig extends WebMvcConfigurerAdapter {
 
    // ��������� ������ ��� ������� � ����� pages, ����� ��� ��������, ����� � �.�.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/views/**").addResourceLocations("/views/");
    }
 
    // � ���� ��� �������������� View ������ �������
    // ����� ��� �� �� ������ � mvc-dispatcher-servlet.xml
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
 
        return resolver;
    }
    
    /**
     * ��������� ���� ������� ������ � �������������
     * @return - ������ ������ � �������������
     */
    @Bean
    OwnerService getOwnerService() {
        return new OwnerService();
    }
    
    /**
     * ��������� ���� ������� ������ � ���������� �����
     * @return - ����� ������ � ���������� �����
     */
    @Bean
    PassportService getPassportService(){
    	return new PassportService();
    }
    
    /**
     * ��������� ���� ������� ������ � �������� �������
     * @return - ����� ������ � �������� �������
     */
    @Bean
    EventService getEventService(){
    	return new EventService();
    }
 
}
