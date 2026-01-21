package com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstQualifiedService implements QualifiedService {

    @Override
    public String getId() {
        return "QualifiedService_1";
    }
}


    