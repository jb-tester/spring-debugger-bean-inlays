package com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/qualified")
public class ControllerWithQualifiedCtorInjection {

    // Incorrect runtime beans inlays are shown for the qualified injections both
    // in the non-suspended and suspended mode:
    // the primary bean is shown always
    private final Bean2 bean2;
    private final Bean2 bean2Sec;

    private final QualifiedService qualifiedServicePrimary;
    private final QualifiedService third;
    private final QualifiedService secondQualifiedService;

    public ControllerWithQualifiedCtorInjection(Bean2 bean2,
                                                @Qualifier("bean2Sec") Bean2 bean2Sec,
                                                QualifiedService qualifiedServicePrimary,
                                                @Qualifier("third") QualifiedService third,
                                                SecondQualifiedService secondQualifiedService) {
        this.bean2 = bean2;
        this.qualifiedServicePrimary = qualifiedServicePrimary;
        this.third = third;
        this.secondQualifiedService = secondQualifiedService;
        this.bean2Sec = bean2Sec;
    }

    @GetMapping
    public String beansWithQualifiers() {
        return "Service: by primary " + qualifiedServicePrimary.getId() + ", by @Qualifier: " + third.getId() + ", by specific type: " + secondQualifiedService.getId() + "\n"
               + "Beans: by primary:" + bean2.getId() + ", by @Qualifier: " + bean2Sec.getId();
    }
}
