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
public class TableColumn {
    /**
     * 字段名
     */
    private String columnName;

    /**
     * 描述
     */
    private String columnComment;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 是否是主键
     */
    private boolean isPrimaryKey;

}
