package ua.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("DoMyInit");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doMyDestroy");
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
