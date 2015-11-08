package pl.java.scalatech.placeholder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
@Configuration
@ComponentScan(basePackageClasses={PcBean2.class})
public class PlaceholderConverConfig {
    @Bean
    public ConversionService conversionService(){
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new DataConverter());
        return conversionService;
    }
}
