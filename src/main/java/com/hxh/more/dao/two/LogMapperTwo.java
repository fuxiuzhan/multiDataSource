package com.hxh.more.dao.two;

import com.hxh.more.pojo.Log;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LogMapperTwo {


    @Select("select * from log")
    List<Log> selectLogs();
}
