package com.mytests.spring.springdebuggerbeaninlays.profilesTesting;

import com.mytests.spring.springdebuggerbeaninlays.conditionalTesting.ConditionalService;
import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.NoProfilesService;
import com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting.Bean2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/profiles")
public class ControllerWIthProfileSpecificCtorInjection {


    private final MyService myService;
    private final Bean1 bean1;

    public ControllerWIthProfileSpecificCtorInjection(MyService myService,
                                                      Bean1 bean1) {
        this.myService = myService;
        this.bean1 = bean1;
    }

    @GetMapping("/")
    public String testPropertiesAndServices() {
        String results =  "Profile-specific Service: " + myService.getId() + "\n";
        results += "Profile-specific Beans: " + bean1.getId();
        return results;
    }
}
