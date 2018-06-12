package com.yn.code.generate;

import com.yn.code.model.ConfigModel;
import com.yn.code.model.TableInfo;
import com.yn.code.util.TableUtil;
/**
 * 这里是类描述
 *
 * @author : yangning
 * @date: 2018-6-11
 **/
public class CodeGenerate {
    public void generate(ConfigModel configModel){
        TableUtil tableUtil = new TableUtil(configModel.getJdbcHost(),
                configModel.getJdbcDatabase(),
                configModel.getJdbcUserName(),
                configModel.getJdbcPassword());
        TableInfo tableInfo = tableUtil.getTableInfo(configModel.getTableName());
        new ModelGenerate(configModel,tableInfo).generate();
        new MapperGenerate(configModel,tableInfo).generate();
    }
}
