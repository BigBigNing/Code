package com.yn.code;

import com.yn.code.util.DataTypeEnum;


public class Main {
    public static void main(String[] args) {
//        String host = "127.0.0.1:3306";
//        String user = "root";
//        String pwd = "123456";
//        String database = "test";
//        TableUtil tableUtil = new TableUtil(host,database,user,pwd);
//        List<String> allDatabase = tableUtil.getAllDatabase();
//        allDatabase.forEach(System.out::println);


        System.out.println(DataTypeEnum.getJavaTypeNameByDataType("timestamp"));
    }
}
