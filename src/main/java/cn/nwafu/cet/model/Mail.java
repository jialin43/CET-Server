package cn.nwafu.cet.model;

import lombok.Data;

@Data
public class Mail {
    private String toEmail;
    private String title;
    private String content;
}
