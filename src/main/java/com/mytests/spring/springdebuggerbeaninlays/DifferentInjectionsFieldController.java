package com.mytests.spring.springdebuggerbeaninlays;

import com.mytests.spring.springdebuggerbeaninlays.conditionalTesting.ConditionalService;
import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.MyConfProp;
import com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection.NoProfilesService;
import com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting.Bean2;
import com.mytests.spring.springdebuggerbeaninlays.profilesTesting.Bean1;
import com.mytests.spring.springdebuggerbeaninlays.profilesTesting.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aaa")
public class DifferentInjectionsFieldController {


    @Autowired
    private MyConfProp myConfProp;
    @Autowired
    private MyService myService;
    @Autowired
    private Bean1 bean1;
    @Autowired
    private Bean2 bean2;
    @Autowired
    private NoProfilesService noProfilesService;
    @Autowired
    private ConditionalService conditionalService;

    

    @GetMapping("/")
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
