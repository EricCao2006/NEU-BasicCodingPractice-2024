package com.nep.data;

import com.nep.entity.Supervisor;
import com.nep.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class SupervisorData {
    public static void main(String[] args) {
        //管理员账号初始化
        Supervisor s1 = new Supervisor("13812345678","123","张三","男");
        Supervisor s2 = new Supervisor("13811111111","123","李四","女");
        Supervisor s3 = new Supervisor("13812341234","123","王五","男");

        List<Supervisor> alist = new ArrayList<Supervisor>();
        alist.add(s1);
        alist.add(s2);
        alist.add(s3);
        String ProPaht = System.getProperty("user.dir") + "/demo/src/main/resources/NepDatas/ObjectData/";
        FileUtil.writeObject(ProPaht+"supervisor.txt", alist);
    }
}
