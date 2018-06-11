package com.yn.code.model;

import lombok.*;

import java.util.List;
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
public class ModelGenerateInfo {
    private String basePackage;
    private String tableComment;
    private String tableName;
    private String author;
    private String date;
    private String modelNameUpperCamel;
    private List<ModelGenerateColumnInfo> columnList;
    private List<String> importList;
}
