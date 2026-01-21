package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

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


    public ControllerWithNonAmbiguousCtorInjection(NoProfilesService noProfilesService, MyConfProp myConfProp, MyDataRepoCtorInjection myDataRepoCtorInjection, MyDataRepository myDataRepository) {
        this.noProfilesService = noProfilesService;
        this.myConfProp = myConfProp;
        this.myDataRepoCtorInjection = myDataRepoCtorInjection;
        this.myDataRepository = myDataRepository;
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
