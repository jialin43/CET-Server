package cn.nwafu.cet;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("cn.nwafu.cet.dao")
public class CetApplication {
    public static void main(String[] args) {
        SpringApplication.run(CetApplication.class, args);
    }

}
