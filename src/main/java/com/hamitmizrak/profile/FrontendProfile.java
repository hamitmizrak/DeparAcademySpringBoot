package com.hamitmizrak.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("frontend")
public class FrontendProfile implements IProfileChooise{

    @Override
    public String message(String name) {
        return "Frontend data "+name;
    }
}
