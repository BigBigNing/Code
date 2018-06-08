package ${basePackage}.dao.${sign};

import ${basePackage}.model.${sign}.${modelNameUpperCamel};

/**
 * ${tableComment}
 * 表：  ${table}
 * @author  ${author}
 * @date ${date}
 */
public interface ${modelNameUpperCamel}Mapper {
    /**
     * 全字段新增
     * @param ${modelNameLowerCamel}
     * @return 新增条数
     */
    int insert(${modelNameUpperCamel} ${modelNameLowerCamel});

    /**
     * 动态字段新增
     * @param ${modelNameLowerCamel}
     * @return 新增条数
     */
    int insertSelective(${modelNameUpperCamel} ${modelNameLowerCamel});

    /**
     * 根据指定主键获取一条数据库记录
     * @param id
     * @return ${modelNameUpperCamel}
     */
    ${modelNameUpperCamel} selectByPrimaryKey(${primaryKeyType} ${primaryKey});

    /**
     * 根据主键动态修改表数据
     * @param ${modelNameLowerCamel}
     * @return 修改条数
     */
    int updateByPrimaryKeySelective(${modelNameUpperCamel} ${modelNameLowerCamel});

}