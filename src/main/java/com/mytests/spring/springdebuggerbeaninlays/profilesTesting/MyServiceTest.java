package com.mytests.spring.springdebuggerbeaninlays.profilesTesting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("test")
@Service
public class MyServiceTest implements MyService {
    @Override
    public String getId() {
        return "test";
    }
}
