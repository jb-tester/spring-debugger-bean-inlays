package com.mytests.spring.springdebuggerbeaninlays.profilesTesting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("remote")
@Service
public class MyServiceRemote implements MyService {
    @Override
    public String getId() {
        return "remote";
    }
}
