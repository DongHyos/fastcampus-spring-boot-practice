package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.Myproperties;
import com.fastcampus.springbootpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.event.EventListener;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    private final Myproperties myproperties;
    private final StudentService studentService;
    private final String username;
    private final String password;

    public FastcampusSpringBootPracticeApplication(
            Myproperties myproperties,
            StudentService studentService,
            @Value("${spring.datasource.username}") String username,
            @Value("${spring.datasource.password}") String password) {
        this.myproperties = myproperties;
        this.studentService = studentService;
        this.username = username;
        this.password = password;
    }


    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
//        System.out.println("[configurationProps] " + myproperties.getHeight());
//        studentService.printStudent("jack");
//        studentService.printStudent("cassie");
//        studentService.printStudent("fred");
        System.out.println("id " + username);
        System.out.println("pw " + password);
    }

}
