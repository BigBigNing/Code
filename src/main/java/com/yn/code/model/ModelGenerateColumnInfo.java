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
public class ModelGenerateColumnInfo {
    private String columnComment;
    private String columnJavaTypeName;
    private String columnJdbcType;
    private String columnName;
    private String columnCamelName;
}
