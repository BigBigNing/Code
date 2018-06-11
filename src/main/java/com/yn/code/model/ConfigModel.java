package com.yn.code.model;

import lombok.*;
/**
 * 这里是类描述
 *
 * @author : yangning
 * @date: 2018-6-11
 **/
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigModel {
    private String jdbcHost;
    private String jdbcDatabase;
    private String jdbcUserName;
    private String jdbcPassword;

    private String tableName;

    private String author;
    private String modelPath;
    private String mapperJavaPath;
    private String mapperXmlPath;


}
