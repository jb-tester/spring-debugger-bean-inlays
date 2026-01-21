package com.mytests.spring.springdebuggerbeaninlays.conditionalTesting;

import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.MyConfProp;
import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.NoProfilesService;
import com.mytests.spring.springdebuggerbeaninlays.profilesTesting.Bean1;
import com.mytests.spring.springdebuggerbeaninlays.profilesTesting.MyService;
import com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting.Bean2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/conditional")
public class ControllerWithConditionalInjectionCtor {

    // bean inlays are not shown for the conditional components in the non-suspended mode
    // they are ok for the conditional beans however

    private final Bean3 bean3;
    private final ConditionalService conditionalService;

    public ControllerWithConditionalInjectionCtor(Bean3 bean3, ConditionalService conditionalService) {
        this.bean3 = bean3;
        this.conditionalService = conditionalService;
    }

    @GetMapping
    public String testPropertiesAndServices() {
        String results= "Beans: " + bean3.getId() + "\n";
        results += "Conditional service: " + conditionalService.getId() ;
        return results;
    }
}
