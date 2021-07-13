package com.example.restfulwebservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {//Security Username Password 설정
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
        throws Exception{
        auth.inMemoryAuthentication()
                .withUser("ko")
                .password("{noop}test1234") // noop은 인코딩 안하고 사용 [서비스할 때는 인코딩 알고리즘을 덧붙여 사용해야함]
                .roles("USER");
    }
}
