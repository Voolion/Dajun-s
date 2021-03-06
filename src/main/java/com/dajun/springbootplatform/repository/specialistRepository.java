package com.dajun.springbootplatform.repository;

import com.dajun.springbootplatform.entities.Specialist;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface specialistRepository {
    //查询专家名称
    String findName(String phone);
    //通过手机号查询专家
    Specialist findByAccount(String phone);
    //通过手机号查询ID
    int findIdByPhone(String phone);
}
