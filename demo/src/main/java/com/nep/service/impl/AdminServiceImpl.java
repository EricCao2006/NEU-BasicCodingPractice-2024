package com.nep.service.impl;

import com.nep.entity.Admin;
import com.nep.util.FileUtil;
import com.nep.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public boolean login(String loginCode, String password) {
        // TODO Auto-generated method stub
        String ProPaht = System.getProperty("user.dir") + "/demo/src/main/resources/NepDatas/ObjectData/";
        List<Admin> alist =(List<Admin>) FileUtil.readObject(ProPaht+"admin.txt");
        for(Admin a : alist){
            if(a.getLoginCode().equals(loginCode) && a.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
