package com.hamitmizrak.controller.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailSendController {

    @Autowired
    private JavaMailSender mailSender;

    //http://localhost:4444/mail/send
    @GetMapping("/mail/send")
    @ResponseBody
    public String showContactForm() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("denememalatya4444@gmail.com"); //frontentten gelen mail adres
        message.setFrom("denememalatya4444@gmail.com"); //serverdan
        String mailSubject = "fullname" + " gönderdi";
        message.setSubject(mailSubject);
        String mailContent = "Hamit Mızrak" + "\n" + "<h4>Merhabalar</h4>" + "\n" + " mail:" + "deneme@gmail.com";
        message.setText(mailContent);
        mailSender.send(message);
        return "mail gönderildi";
    }

}
