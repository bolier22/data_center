package com.wanma.data.center;

import com.wanma.data.center.config.SystemParams;
import com.wanma.data.center.entity.TblUserAdmin;
import com.wanma.data.center.service.TblUserAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataCenterApplicationTests {

    @Autowired
    TblUserAdminService tblUserAdminService;

    @Test
    public void contextLoads() {
        System.out.println("--contextLoads--");
    }

    @Autowired
    SystemParams systemParams;

    @Test
    public void testParam(){
        System.out.println("----"+systemParams.getImageUri());
        System.out.println("----"+systemParams.getImageName());
    }

    @Test
    public void getList3(){
        List<TblUserAdmin> getList3 = tblUserAdminService.getList3(1,1);
        System.out.println(getList3.toString());
    }
}
