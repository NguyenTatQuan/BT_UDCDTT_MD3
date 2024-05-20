package org.example.bt_udcdtt_md3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam("rate") double rate,
                          @RequestParam("amount") double amount,
                          Model model) {
        double result = rate * amount;
        model.addAttribute("result", result);
        return "result";
    }
}

