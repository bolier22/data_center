package com.wanma.data.center.controller;//package com.wanma.demoes.controller;

import com.wanma.data.center.entity.TblUserAdmin;
import com.wanma.data.center.service.TblUserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 登录
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    TblUserAdminService tblUserAdminService;

    @RequestMapping("/login")
    public String sendCallLogRecording(){
        System.out.println("-------222-345-------");

        return "12344555555888888888888";
    }

    @RequestMapping("/query/list/{id}")
    public List<TblUserAdmin> queryList(@PathVariable("id")Integer id){
        tblUserAdminService.totle(1,1);

//        if(id == 1){
//            return tblUserAdminService.getList(1,1);
//        }else if(id == 2){
//            return tblUserAdminService.getList2(1,1);
//        }else{
//            return tblUserAdminService.getList3(1,1);
//        }
        return tblUserAdminService.getList3(1,1);

    }

}
