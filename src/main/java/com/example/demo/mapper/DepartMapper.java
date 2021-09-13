package com.example.demo.mapper;

import com.example.demo.bean.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface DepartMapper {
    @Select({
            "select",
            "C_ID,T_ID,C_Name,ScorePoint",
            "from courses"
    })
    List<Depart> selectAll();
}
