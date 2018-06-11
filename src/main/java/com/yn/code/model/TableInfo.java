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
public class TableInfo {
    /**
     * 表名
     */
    private String tableName;

    /**
     * 表注释
     */
    private String tableComment;

    /**
     * 表字段
     */
    private List<TableColumn> tableColumns;
}
