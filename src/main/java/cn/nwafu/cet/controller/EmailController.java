package cn.nwafu.cet.controller;

import cn.nwafu.cet.common.HttpResult;
import cn.nwafu.cet.model.Mail;
import cn.nwafu.cet.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contract")
public class EmailController {
    @Autowired
    private MailService mailService;
    @PostMapping(value = "sendemail")
    public HttpResult sendEmail(@RequestBody Mail mail) {
        if(mail.getToEmail()!=null) {
            mailService.sendMail(mail.getTitle(),mail.getToEmail(),mail.getContent());
            System.out.println("邮件发送:"+mail.toString());
            return HttpResult.ok("邮件发送成功");
        }
        return HttpResult.error("邮件发送失败");
    }
}
