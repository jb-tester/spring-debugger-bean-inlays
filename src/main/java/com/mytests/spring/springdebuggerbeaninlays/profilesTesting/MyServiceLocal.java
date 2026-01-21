package com.mytests.spring.springdebuggerbeaninlays.profilesTesting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("local")
@Service
public class MyServiceLocal implements MyService {
    @Override
    public String getId() {
        return "local";}}