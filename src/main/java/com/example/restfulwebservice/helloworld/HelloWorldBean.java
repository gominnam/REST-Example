package com.example.restfulwebservice.helloworld;
// lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // setter, getter 등
@AllArgsConstructor // 생성자
@NoArgsConstructor // 매개변수가 없는 디폴트 생성자
public class HelloWorldBean {
    private String message;

}
