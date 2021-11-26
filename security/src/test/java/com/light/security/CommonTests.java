package com.light.security;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CommonTests {
    @Test
    public void testBCrpyt(){
        /**
         * 每次加密密码都不同，因为salt不同，但是如何验证密码是否正确呢，实际加密后的密码包含了加密时的salt在里面，因此可以
         * 自校验成功
         */ 
        String pwd = "122";
        String encode = new BCryptPasswordEncoder().encode(pwd);
        System.out.println(encode);
        //salt: $2a$10$tWKW7SgmP3Ep7h/RxOGA/e
        //real_salt: tWKW7SgmP3Ep7h/RxOGA/e
        //encode:$2a$10$tWKW7SgmP3Ep7h/RxOGA/eca0tqkCc/f92YGUQtcGI4WdWtJoF36S
        boolean matches = new BCryptPasswordEncoder().matches(pwd, encode);
        System.out.println(matches);
    }
}
