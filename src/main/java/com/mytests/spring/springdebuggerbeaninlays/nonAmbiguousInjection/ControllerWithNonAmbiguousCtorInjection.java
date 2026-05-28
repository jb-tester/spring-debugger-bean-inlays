package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/nonambiguous")
public class ControllerWithNonAmbiguousCtorInjection {

    private final NoProfilesService noProfilesService;
    private final MyConfProp myConfProp;
    private final MyDataRepoCtorInjection myDataRepoCtorInjection;
    private final MyDataRepository myDataRepository;
    private final ApplicationEventPublisher applicationEventPublisher;


    public ControllerWithNonAmbiguousCtorInjection(NoProfilesService noProfilesService, MyConfProp myConfProp, MyDataRepoCtorInjection myDataRepoCtorInjection, MyDataRepository myDataRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.noProfilesService = noProfilesService;
        this.myConfProp = myConfProp;
        this.myDataRepoCtorInjection = myDataRepoCtorInjection;
        this.myDataRepository = myDataRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @GetMapping
    public String extra(){
        return "properties: prop1 = " + myConfProp.getProp1() + ", prop2 = " + myConfProp.getProp2() + ", service: " + noProfilesService.getId();
    }

    @GetMapping("/data")
    public List<String> data() {

        return myDataRepoCtorInjection.getData();
    }
}
