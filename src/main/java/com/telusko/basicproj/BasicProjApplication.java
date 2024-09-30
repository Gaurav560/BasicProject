package com.telusko.basicproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicProjApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BasicProjApplication.class, args);
        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);


        s1.setName("Abhi");
        s1.setMarks(100);
        s1.setRollnp(100);

        s2.setName("devi");
        s2.setMarks(10);
        s2.setRollnp(200);

        s3.setName("swathi");
        s3.setMarks(11);
        s3.setRollnp(300);

        repo.save(s1);
        repo.save(s2);
        repo.save(s3);

        System.out.println(repo.findAll());
        System.out.println(repo.findByName("Abhi"));
        System.out.println(repo.findByMarksGreaterThan(10));
    }
}
