package com.zerobase.domain.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aes256UtilTest {
    @Test
    void encrypt() {
        //given
        String encrypt = Aes256Util.encrypt("Hello world!");

        //then
        assertEquals(Aes256Util.decrypted(encrypt), "Hello world!");
    }

}