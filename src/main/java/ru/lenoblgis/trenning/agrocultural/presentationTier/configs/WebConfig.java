package ru.lenoblgis.trenning.agrocultural.presentationTier.configs;

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
@ComponentScan(basePackages = "ru.lenoblgis.trenning.agrocultural.buisnessTier.services")
public class WebConfig extends WebMvcConfigurerAdapter{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/views/**").addResourceLocations("/views/");
    }

    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/src/main/webapp/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }
	
    @Bean
    OwnerService getOwnerService() {
        return new OwnerService();
    }
    
    @Bean
    PassportService getPassportService(){
    	return new PassportService();
    }
    
    @Bean
    EventService getEventService(){
    	return new EventService();
    }
    
}
