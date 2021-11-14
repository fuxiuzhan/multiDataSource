package com.hxh.more.dao.one;

import com.hxh.more.pojo.Log;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LogMapperOne {


    @Select("select * from log")
    List<Log> selectLogs();
}
