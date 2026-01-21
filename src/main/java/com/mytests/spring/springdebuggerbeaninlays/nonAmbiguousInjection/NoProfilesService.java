package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.stereotype.Service;

@Service
public class NoProfilesService {
    public String getId() {
        return "always available service";
    }
}
