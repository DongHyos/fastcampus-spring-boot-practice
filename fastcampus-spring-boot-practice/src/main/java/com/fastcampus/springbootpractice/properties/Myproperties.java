package com.fastcampus.springbootpractice.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConstructorBinding
@ConfigurationProperties("my")
public class Myproperties {

    /** 제 키에요 */
    private final Integer height;

    public Myproperties(Integer height) {
        this.height = height;
    }

}
