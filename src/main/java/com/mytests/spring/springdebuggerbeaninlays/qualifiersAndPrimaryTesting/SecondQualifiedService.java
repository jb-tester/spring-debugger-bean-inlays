package com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting;

import org.springframework.stereotype.Service;

@Service
public class SecondQualifiedService implements QualifiedService {

    @Override
    public String getId() {
        return "QualifiedService_2";
    }
}