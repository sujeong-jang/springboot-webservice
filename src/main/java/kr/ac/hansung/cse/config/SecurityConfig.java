package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//class를 사용하여 security 설정
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // 요청에 대해서
                .anyRequest() // 어떤 게스트던 상관없이
                .permitAll() // 접근 허용
                .and()
                .csrf().disable(); // csrf 비활성화
    }
}
