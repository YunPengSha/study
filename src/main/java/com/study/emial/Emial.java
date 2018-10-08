package com.study.emial;

import java.util.Properties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Emial {

  public static void main(String[] args) {
    JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
    senderImpl.setHost("smtp.163.com");
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setTo("");
    mailMessage.setFrom(" 18848971713@163.com ");
    mailMessage.setSubject(" 激活邮件 ");
    mailMessage.setText("");

    senderImpl.setUsername("");
    senderImpl.setPassword("");

    Properties prop = new Properties();
    prop.put(" mail.smtp.auth ", " true ");
    prop.put(" mail.smtp.timeout ", " 25000 ");
    senderImpl.setJavaMailProperties(prop);

    senderImpl.send(mailMessage);
  }

}
