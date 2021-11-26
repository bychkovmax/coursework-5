package com.example.shop.extraservices;

import com.example.shop.models.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
@Transactional
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Async
    public void sendEmail(Users user) {

        SimpleMailMessage message = new SimpleMailMessage();
        // Необходимо указать адрес электронной почты отправителя
         // message.setFrom("microsoftcraft@mail.ru");
         message.setFrom(user.getEmail());

        // Необходимо указать адрес электронной почты получателя
        message.setTo("microsoftcraft@mail.ru");

        // Установить тему: поле заголовка
        message.setSubject(user.getName());

        //  сообщение
        message.setText(user.getMessage());
        javaMailSender.send(message);

        System.out.println("Message commit");

    }
}