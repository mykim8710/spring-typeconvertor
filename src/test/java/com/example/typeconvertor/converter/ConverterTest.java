package com.example.typeconvertor.converter;


import com.example.typeconvertor.type.IpPort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// given : ~이 주어지고
// when : ~을 실행했을때
// then : 결과가 ~이렇게 나와야 한다.

class ConverterTest {
    @Test
    @DisplayName("String to Integer 테스트")
    void stringToIntegerConverterTest() {
        // given : ~이 주어지고
        StringToIntegerConverter converter = new StringToIntegerConverter();
        String convertSource = "100";

        // when : ~을 실행했을때
        Integer convertedInteger = converter.convert(convertSource);

        // then : 결과가 ~이렇게 나와야 한다.
        assertThat(convertedInteger).isEqualTo(100);
    }

    @Test
    @DisplayName("Integer to String 테스트")
    void integerToStringConverterTest() {
        // given : ~이 주어지고
        IntegerToStringConverter converter = new IntegerToStringConverter();
        int convertSource = 100;

        // when : ~을 실행했을때
        String convertedString = converter.convert(convertSource);

        // then : 결과가 ~이렇게 나와야 한다.
        assertThat(convertedString).isEqualTo("100");
    }


    @Test
    @DisplayName("String To IpPort 테스트")
    void stringToIpPortConverterTest() {
        // given : ~이 주어지고
        StringToIpPortConverter converter = new StringToIpPortConverter();
        String source = "192.168.10.199:8080";

        // when : ~을 실행했을때
        IpPort result = converter.convert(source);
        System.out.println("result = " + result);

        // then : 결과가 ~이렇게 나와야 한다.
        assertThat(result).isEqualTo(new IpPort("192.168.10.199", 8080));
    }

    @Test
    @DisplayName("IpPort to String 테스트")
    void ipPortToStringConverterTest() {
        // given : ~이 주어지고
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new IpPort("192.168.10.99", 8080);

        // when : ~을 실행했을때
        String result = converter.convert(source);

        // then : 결과가 ~이렇게 나와야 한다.
        assertThat(result).isEqualTo("192.168.10.99:8080");
    }
}