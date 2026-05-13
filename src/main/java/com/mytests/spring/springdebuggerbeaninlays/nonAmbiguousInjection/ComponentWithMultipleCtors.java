package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// https://youtrack.jetbrains.com/issue/IDEA-389376/Spring-Debugger-inlays-are-not-shown-in-case-of-multiple-constructors
@Component
public class ComponentWithMultipleCtors {

    private final NoProfilesService noProfilesService;
    private final MyDataRepository myDataRepository;
    private String foo;

    public ComponentWithMultipleCtors(NoProfilesService noProfilesService,
                                      MyDataRepository myDataRepository,
                                      String foo) {
        this.noProfilesService = noProfilesService;
        this.myDataRepository = myDataRepository;
        this.foo = foo;
    }

    @Autowired
    public ComponentWithMultipleCtors(NoProfilesService noProfilesService,
                                      MyDataRepository myDataRepository) {
        this.noProfilesService = noProfilesService;
        this.myDataRepository = myDataRepository;
    }

    public NoProfilesService getNoProfilesService() {
        return noProfilesService;
    }

    public MyDataRepository getMyDataRepository() {
        return myDataRepository;
    }

    public String getFoo() {
        return foo;
    }
}
