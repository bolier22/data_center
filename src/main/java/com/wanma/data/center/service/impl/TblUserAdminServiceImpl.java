package com.wanma.data.center.service.impl;

import com.wanma.data.center.ds.DataSourceAspectService;
import com.wanma.data.center.ds.DynamicDataSource;
import com.wanma.data.center.entity.TblUserAdmin;
import com.wanma.data.center.mapper.TblUserAdminMapper;
import com.wanma.data.center.service.TblUserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TblUserAdminServiceImpl implements TblUserAdminService {

    @Autowired
    private TblUserAdminMapper tblUserAdminMapper;

    @DataSourceAspectService(dataSourceName = "ds2")
    @Override
    public List<TblUserAdmin> getList(int start, int count) {
        List<TblUserAdmin> getList = tblUserAdminMapper.getList(start, count);
        return getList;
    }

    @DataSourceAspectService(dataSourceName = "ds1")
    @Override
    public List<TblUserAdmin> getList2(int start, int count) {
        return tblUserAdminMapper.getList2(start, count);
    }

    @DataSourceAspectService(dataSourceName = "ds2")
    @Override
    public List<TblUserAdmin> getList3(int start, int count) {
        return tblUserAdminMapper.getList3(start, count);
    }

    @DataSourceAspectService(dataSourceName = "ds2")
    @Override
    public void update1() {
        tblUserAdminMapper.update1();
    }

    @Override
    public void update2() {
        tblUserAdminMapper.update2();
    }

    @DataSourceAspectService(dataSourceName = "ds2")
    @Override
    public void update3() {
        tblUserAdminMapper.update3();
    }

//    @DataSourceAspectService(dataSourceName = "ds1")
    @Override
    @Transactional
    public void totle(int start, int count) {

//        List<TblUserAdmin> getList = this.getList(start, count);
//
//        DynamicDataSource.setDataSource("ds1");
//        this.getList(1,1);
//
//        DynamicDataSource.setDataSource("ds2");
//        this.getList2(1,1);
//
//        DynamicDataSource.setDataSource("ds2");
//        this.getList3(1,1);
//
//        getList = this.getList2(start, count);
//        getList = this.getList3(start, count);

        DynamicDataSource.setDataSource("ds1");
        this.update1();
        DynamicDataSource.setDataSource("ds2");
        this.update2();
        DynamicDataSource.setDataSource("");
        this.update3();

        int i = 0/2;
//        getList = this.getList(start, count);
//        getList = this.getList2(start, count);
//        getList = this.getList3(start, count);
    }
}
