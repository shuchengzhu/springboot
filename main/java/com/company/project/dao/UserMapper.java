package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface UserMapper extends Mapper<User> {
    public List<User> UserByPage(@Param("page") Integer page,@Param("num")  Integer num);

    List<User> JqByPage(@Param("e_text") String e_text,@Param("start") Integer start, @Param("length") Integer length);
}
