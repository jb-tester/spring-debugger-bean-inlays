package com.mytests.spring.springdebuggerbeaninlays.conditionalTesting;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "foo.bar.condition", havingValue = "3")
public class ThirdCondition implements ConditionalService {

    @Override
    public String getId() {
        return "Conditional Service 3";
    }
}