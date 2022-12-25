package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.Myproperties;
import com.fastcampus.springbootpractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.event.EventListener;

@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    private final Myproperties myproperties;
    private final StudentService studentService;


    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
//        System.out.println("[configurationProps] " + myproperties.getHeight());
        studentService.printStudent("jack");
        studentService.printStudent("cassie");
        studentService.printStudent("fred");
    }

}
