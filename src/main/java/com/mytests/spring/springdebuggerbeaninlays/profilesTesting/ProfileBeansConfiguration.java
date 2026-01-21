package com.mytests.spring.springdebuggerbeaninlays.profilesTesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class ProfileBeansConfiguration {

    @Bean()
    @Profile({"local"})
    public Bean1 bean11() {
        return new Bean1("local bean1");
   }
    @Bean()
    @Profile({"remote"})
    public Bean1 bean12() {
        return new Bean1("remote bean1");
   }
    @Bean()
    @Profile({"test"})
    public Bean1 bean13() {
        return new Bean1("test bean1");
   }


}
