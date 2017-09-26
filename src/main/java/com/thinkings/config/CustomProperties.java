package com.thinkings.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomProperties {
    @Value("${attritbuteA}")
    public String attritbuteA;

    public String getAttritbuteA() {
        return attritbuteA;
    }

    public void setAttritbuteA(String attritbuteA) {
        this.attritbuteA = attritbuteA;
    }
}
