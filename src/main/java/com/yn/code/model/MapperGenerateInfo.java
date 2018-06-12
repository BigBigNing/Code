package com.yn.code.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 这里是类描述
 *
 * @author : yangning
 * @date: 2018-6-11
 **/
@Getter
@Setter
public class MapperGenerateInfo {
    private String basePackage;
    private String modelPath;
    private String modelNameUpperCamel;
    private String tableComment;
    private String tableName;
    private String author;
    private String date;
    private String modelNameLowerCamel;
    private String primaryKeyJavaType;
    private String primaryKeyJavaTypeName;
    private String primaryKeyJdbcType;
    private String primaryKey;
    private String primaryKeyCamel;
    private List<MapperGenerateColumnInfo> columnList;
}
