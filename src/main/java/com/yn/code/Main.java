package com.yn.code;

import com.yn.code.generate.GenerateModel;
import com.yn.code.model.TableInfo;
import com.yn.code.util.DataTypeEnum;
import com.yn.code.util.TableUtil;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        String host = "127.0.0.1:3306";
        String user = "root";
        String pwd = "123456";
        String database = "test";
        TableUtil tableUtil = new TableUtil(host,database,user,pwd);
//        List<String> allDatabase = tableUtil.getAllDatabase();
//        allDatabase.forEach(System.out::println);
        TableInfo tableInfo = tableUtil.getTableInfo("t_account");
        GenerateModel.generate(tableInfo);

    }
}
