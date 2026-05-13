package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// https://youtrack.jetbrains.com/issue/IDEA-388968
@Component
public class ComponentWithNotArrangedOrderCtors {



    private final NoProfilesService noProfilesService;

    public NoProfilesService getNoProfilesService() {
        return noProfilesService;
    }

    public MyDataRepository getMyDataRepository() {
        return myDataRepository;
    }

    private final MyDataRepository myDataRepository;

    @Autowired
    ComponentWithNotArrangedOrderCtors(NoProfilesService noProfilesService, MyDataRepository myDataRepository) {
        this.noProfilesService = noProfilesService;
        this.myDataRepository = myDataRepository;
    }
}
