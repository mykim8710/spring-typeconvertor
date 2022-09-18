# Spring - TypeConverter Study Project

## Project Spec
- 프로젝트 선택
    - Project: Gradle Project
    - Spring Boot: 2.7.3
    - Language: Java
    - Packaging: Jar
    - Java: 11
- Project Metadata
    - Group: com.example
    - Artifact: type-convertor
    - Name: spring-typeconvertor
    - Package name: com.example.typeconvertor
- Dependencies: **Spring Web**, **Lombok** , **Thymeleaf**


## Spring - typeConverter
- 컨버터 인터페이스 구현 및 testCode
  - IntegerToStringConverter
  - StringToIntegerConverter
  - IpPortToStringConverter
  - StringToIpPortConverter
- ConversionService
  - 구현한 컨버터 빈 등록 
- Spring 적용
- 뷰템플릿(Thymeleaf)에 컨버터 적용
- Formatter
  - Formatter<?> 인터페이스 구현 및 testCode
  - 컨버전 서비스에 등록 후 사용
- 스프링이 제공하는 기본 포맷터
  - @NumberFormat
  - @DateTimeFormat