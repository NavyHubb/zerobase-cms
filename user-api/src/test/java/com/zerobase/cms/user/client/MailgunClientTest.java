package com.zerobase.cms.user.client;

import com.zerobase.cms.user.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MailgunClientTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    void EmailTest() {
        //given
        ResponseEntity<String> responseEntity =
                mailgunClient.sendEmail(SendMailForm.builder()
                        .from("abc@gmail.com")
                        .to("seongjae972@gmail.com")
                        .subject("This is test")
                        .text("It isn, in fact.")
                        .build());

        //then
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}