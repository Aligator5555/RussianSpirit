package ru.russianspirit.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.russianspirit.service.EmailService;

@Controller
public class EmailController {

    private final EmailService emailService;

    public EmailController(JavaMailSender mailSender, EmailService emailService) {
        this.emailService = emailService;

    }

    @PostMapping("/mailGo")
    public String goMain(@RequestParam("name") String name,
                         @RequestParam("number") Long number,
                         Model model) {
        emailService.sendEmail("oleg_novak_98@mail.ru", name, number);

        return "redirect:/";

    }
}
