package com.mytests.spring.springdebuggerbeaninlays.qualifiersAndPrimaryTesting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("third")
public class ThirdQualifiedService implements QualifiedService {

    @Override
    public String getId() {
        return "QualifiedService_3";
    }
}