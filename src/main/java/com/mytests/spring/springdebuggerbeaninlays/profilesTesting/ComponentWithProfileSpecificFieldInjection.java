package com.mytests.spring.springdebuggerbeaninlays.profilesTesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponentWithProfileSpecificFieldInjection {
    @Autowired
    MyService myService;
    @Autowired
    Bean1 bean1;
}
