package com.example.typeconvertor.converter;

import com.example.typeconvertor.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import static org.assertj.core.api.Assertions.*;

class ConversionServiceTest {

    @Test
    void conversionServiceTest() {
        // 등록
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new StringToIntegerConverter());
        conversionService.addConverter(new IntegerToStringConverter());
        conversionService.addConverter(new IpPortToStringConverter());
        conversionService.addConverter(new StringToIpPortConverter());

        // 사용 -> input : (convert source, result class type)
        // String to Integer : StringToIntegerConverter
        Integer resultInteger = conversionService.convert("100", Integer.class);
        assertThat(resultInteger).isEqualTo(100);

        // Integer to String : IntegerToStringConverter
        String resultString = conversionService.convert(100, String.class);
        assertThat(resultString).isEqualTo("100");

        // String to IpPort : StringToIpPortConverter
        IpPort resultIpPort = conversionService.convert("192.168.10.99:8080", IpPort.class);
        assertThat(resultIpPort).isEqualTo(new IpPort("192.168.10.99", 8080));

        // IpPort to String : IpPortToStringConverter
        String resultStringIpPort = conversionService.convert(new IpPort("192.168.10.99", 8080), String.class);
        assertThat(resultStringIpPort).isEqualTo("192.168.10.99:8080");
    }
}
