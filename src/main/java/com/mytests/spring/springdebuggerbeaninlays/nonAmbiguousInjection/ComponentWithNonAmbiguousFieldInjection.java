package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class ComponentWithNonAmbiguousFieldInjection {

    @Autowired
    Environment environment;

    @Autowired
    private MyDataRepoFieldInjection myDataRepoFieldInjection;


    @Autowired
    private NoProfilesService noProfilesService;
}
