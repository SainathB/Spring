package org.example.core.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("📧 Email sent: " + message);
    }
}
