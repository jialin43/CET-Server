package cn.nwafu.cet.service.impl;

import cn.nwafu.cet.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    JavaMailSender javaMailSender;

    @Override
    public void sendMail(String subject, String toMail, String content) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject(subject);
        mailMessage.setTo(toMail);
        mailMessage.setText(content);
        mailMessage.setFrom("cet@nies.org");
        javaMailSender.send(mailMessage);
    }
}
