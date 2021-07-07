package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value={"password", "ssn"}) //json 값을 전달하지 않는 어노테이션 2
@NoArgsConstructor
//@JsonFilter("UserInfo") //json 값을 전달하지 않는 어노테이션 3 [adminUserController 사용]
public class User {
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;

    @Past
    private Date joinDate;

    //@JsonIgnore //json 값을 전달하지 않는 어노테이션 1
    private String password;

    private String ssn;
}
