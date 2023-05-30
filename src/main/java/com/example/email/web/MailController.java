package com.example.email.web;

import com.example.email.service.EmailService;
import com.example.email.web.request.MailReq;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    private EmailService emailService;
    @GetMapping("/sendMail")
    public void sendMail(@RequestBody MailReq request) throws MessagingException{
        emailService.sendMail(request);
    }
}
