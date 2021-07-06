package cn.nwafu.cet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public interface MailService {
    public  void sendMail(String subject,String toMail,String content);
}
