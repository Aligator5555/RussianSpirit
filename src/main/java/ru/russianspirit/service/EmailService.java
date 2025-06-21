package ru.russianspirit.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    public void sendEmail(String to, String name, Long number) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("oleg_novak_98@mail.ru");
        message.setTo(to);
        message.setSubject("Имя клиента: " + name);
        message.setText("Номер телефона: " + number);
        javaMailSender.send(message);

    }
}
