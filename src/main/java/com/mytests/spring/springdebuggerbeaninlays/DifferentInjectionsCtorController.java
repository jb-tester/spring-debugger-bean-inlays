package com.mytests.spring.springdebuggerbeaninlays;

import com.mytests.spring.springdebuggerbeaninlays.conditionalTesting.ConditionalService;
import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.MyConfProp;
import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.NoProfilesService;
import com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting.Bean2;
import com.mytests.spring.springdebuggerbeaninlays.profilesTesting.Bean1;
import com.mytests.spring.springdebuggerbeaninlays.profilesTesting.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DifferentInjectionsCtorController {


    private final MyConfProp myConfProp;
    private final MyService myService;
    private final Bean1 bean1;
    private final Bean2 bean2;
    private final NoProfilesService noProfilesService;
    private final ConditionalService conditionalService;

    public DifferentInjectionsCtorController(MyConfProp myConfProp,
                                             MyService myService,
                                             Bean1 bean1,
                                             Bean2 bean2,
                                             NoProfilesService noProfilesService, ConditionalService conditionalService) {
        this.myConfProp = myConfProp;
        this.myService = myService;
        this.bean1 = bean1;
        this.bean2 = bean2;
        this.noProfilesService = noProfilesService;
        this.conditionalService = conditionalService;
    }

    @GetMapping
    public String testPropertiesAndServices() {
        String results = "Properties: prop1 = " + myConfProp.getProp1() + ", prop2 = " + myConfProp.getProp2() + ", condition = " + myConfProp.getCondition() + "\n";
        results += "Profile-specific Service: " + myService.getId() + "\n";
        results += "Profile-specific Beans: " + bean1.getId() + "\n";
        results += "Non-profile beans: " + bean2.getId() + "\n";
        results += "Non-profile service: " + noProfilesService.getId() + "\n";
        results += "Conditional service: " + conditionalService.getId() ;
        return results;
    }
}
