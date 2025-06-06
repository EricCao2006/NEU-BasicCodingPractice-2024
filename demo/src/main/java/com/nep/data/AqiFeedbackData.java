package com.nep.data;

import com.nep.entity.AqiFeedback;
import com.nep.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class AqiFeedbackData {
    public static void main(String[] args) {
        List<AqiFeedback> afList = new ArrayList<AqiFeedback>();

        String ProPaht = System.getProperty("user.dir") + "/demo/src/main/resources/NepDatas/ObjectData/";
        FileUtil.writeObject(ProPaht+"aqifeedback.txt", afList);

    }
}

