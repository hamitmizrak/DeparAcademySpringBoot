package com.hamitmizrak.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("backend")
public class BackendProfile implements IProfileChooise{

    @Override
    public String message(String name) {
        return "Backend data "+name;
    }
}
