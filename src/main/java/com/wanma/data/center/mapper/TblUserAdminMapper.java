package com.wanma.data.center.mapper;

import com.wanma.data.center.entity.TblUserAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TblUserAdminMapper {

    //使用ds的值作为key
    List<TblUserAdmin> getList(@Param("start") int start, @Param("count") int count);

    //使用“ds2”作为key
    List<TblUserAdmin> getList2(@Param("start") int start, @Param("count") int count);
    
    //使用“ds1”作为key
    List<TblUserAdmin> getList3(@Param("start") int start, @Param("count") int count);


    void update1();
    void update2();
    void update3();
}