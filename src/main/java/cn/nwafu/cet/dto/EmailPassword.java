package cn.nwafu.cet.dto;

import lombok.Data;

@Data
public class EmailPassword {
    private String email;
    private String verifyCode;
    private String newPassword;
    private String confirmPassword;
}
