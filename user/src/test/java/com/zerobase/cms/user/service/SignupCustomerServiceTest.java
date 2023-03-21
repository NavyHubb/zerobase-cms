package com.zerobase.cms.user.service;

import com.zerobase.cms.user.domain.SignUpForm;
import com.zerobase.cms.user.domain.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SignupCustomerServiceTest {

    @Autowired
    private SignupCustomerService service;

    @Test
    void signUp() {
        //given
        SignUpForm signUpForm = SignUpForm.builder()
                .email("abc@naver.com")
                .name("KayG")
                .password("3633")
                .birth(LocalDate.now())
                .phone("01011112222")
                .build();

        Customer customer = service.signUp(signUpForm);

        //when
        //then
        assertNotNull(customer);
        assertNotNull(customer.getCreatedAt());  // 객체 내 각 필드에 대한 테스트도 수행
    }
}