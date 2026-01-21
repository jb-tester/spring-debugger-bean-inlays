package com.mytests.spring.springdebuggerbeaninlays.conditionalTesting;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConditionalBeansConfiguration {

    @Bean
    @ConditionalOnProperty(name = "foo.bar.condition", havingValue = "1", matchIfMissing = true)
    public Bean3 bean31() {
        return new Bean3("bean3_1");
    }
    @Bean
    @ConditionalOnProperty(name = "foo.bar.condition", havingValue = "2", matchIfMissing = false)
    public Bean3 bean32() {
        return new Bean3("bean3_2");
    }
    @Bean
    @ConditionalOnProperty(name = "foo.bar.condition", havingValue = "3", matchIfMissing = false)
    public Bean3 bean33() {
        return new Bean3("bean3_3");
    }
}
