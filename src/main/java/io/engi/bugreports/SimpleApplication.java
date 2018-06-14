package io.engi.bugreports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication extends SpringApplication {
    public SimpleApplication() {
        super(SimpleApplication.class);
    }

    public static void main(String[] args) {
        new SimpleApplication().run(args);
    }
}
