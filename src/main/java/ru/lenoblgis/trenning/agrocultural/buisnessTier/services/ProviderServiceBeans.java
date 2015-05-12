package ru.lenoblgis.trenning.agrocultural.buisnessTier.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.lenoblgis.trenning.agrocultural.buisnessTier.services")
public class ProviderServiceBeans {
	 
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
