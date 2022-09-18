package com.example.typeconvertor.config;

import com.example.typeconvertor.converter.IntegerToStringConverter;
import com.example.typeconvertor.converter.IpPortToStringConverter;
import com.example.typeconvertor.converter.StringToIntegerConverter;
import com.example.typeconvertor.converter.StringToIpPortConverter;
import com.example.typeconvertor.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 주석처리 우선순위
        // registry.addConverter(new StringToIntegerConverter());
        // registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new IpPortToStringConverter());
        registry.addConverter(new StringToIpPortConverter());

        // 포멧터 추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
