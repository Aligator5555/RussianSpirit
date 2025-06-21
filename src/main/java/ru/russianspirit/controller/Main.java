package ru.russianspirit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping("/")
    public String main() {
        return "main";
    }
    @GetMapping("/zakazphone")
    public String zakazphone() {
        return "zakazphone";
    }
    @GetMapping("/phone")
    public String phone() {
        return "phone";
    }
}
