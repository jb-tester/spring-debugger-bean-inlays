package com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class PrimaryBeansConfiguration {
    @Bean()
    @Primary
    public Bean2 bean2Prim() {
        return new Bean2("primary bean2");
    }
    @Bean()
    public Bean2 bean2Sec() {
        return new Bean2("secondary bean2");
    }
}
