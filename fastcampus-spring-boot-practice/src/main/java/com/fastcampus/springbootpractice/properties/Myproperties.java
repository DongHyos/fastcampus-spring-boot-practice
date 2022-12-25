package com.fastcampus.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("my")
public class Myproperties {

    private final Integer height;

    public Myproperties(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

}
