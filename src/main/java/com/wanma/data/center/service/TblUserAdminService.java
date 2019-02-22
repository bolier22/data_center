package com.wanma.data.center.service;

import com.wanma.data.center.entity.TblUserAdmin;

import java.util.List;

public interface TblUserAdminService {

    //使用ds的值作为key
    List<TblUserAdmin> getList(int start, int count);
    //使用“ds2”作为key
    List<TblUserAdmin> getList2(int start, int count);

    //使用“ds1”作为key
    List<TblUserAdmin> getList3(int start, int count);


    void update1();
    void update2();
    void update3();

    void totle(int start, int count);
}
