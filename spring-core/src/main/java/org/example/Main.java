package org.example;

import org.example.core.client.UserClient;
import org.example.core.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserClient client = context.getBean(UserClient.class);
        client.notifyUser();

        context.close();
    }
}