package com.yn.code;

import com.yn.code.generate.CodeGenerate;
import com.yn.code.model.ConfigModel;


public class Main {
    public static void main(String[] args) {
        String host = "127.0.0.1:3306";
        String user = "root";
        String pwd = "123456";
        String database = "test";
        String tableName = "seller_product";
        ConfigModel configModel = ConfigModel.builder()
                .jdbcHost(host)
                .jdbcDatabase(database)
                .jdbcUserName(user)
                .jdbcPassword(pwd)
                .tableName(tableName)
                .author("yn")
                .modelPath(System.getProperty("user.dir")+"/src/main/java/com/yn/code/modelgenerated/")
                .mapperJavaPath(System.getProperty("user.dir")+"/src/main/java/com/yn/code/modelgenerated/")
                .mapperXmlPath(System.getProperty("user.dir")+"/src/main/java/com/yn/code/modelgenerated/")
                .build();
        new CodeGenerate().generate(configModel);

    }
}
