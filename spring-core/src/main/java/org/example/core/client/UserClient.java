package org.example.core.client;

import org.example.core.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class UserClient {
    private final NotificationService notificationService;

    public UserClient(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.send("Welcome to Spring Core!");
    }
}
