package com.example.email.service;

import com.example.email.web.request.MailReq;
import jakarta.mail.MessagingException;

public interface EmailService {
    void sendMail (MailReq request) throws MessagingException;
}
