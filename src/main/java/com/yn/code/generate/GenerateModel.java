package com.yn.code.generate;

import com.yn.code.config.BaseConfig;
import com.yn.code.model.ModelGenerateColumnInfo;
import com.yn.code.model.ModelGenerateInfo;
import com.yn.code.model.TableColumn;
import com.yn.code.model.TableInfo;
import com.yn.code.util.CommonUtil;
import com.yn.code.util.DataTypeEnum;
import com.yn.code.util.FreeMarkUtil;

import java.text.SimpleDateFormat;
import java.util.*;

public class GenerateModel extends BaseConfig {

    public static void generate(TableInfo tableInfo) {
        ModelGenerateInfo modelGenerateInfo = new ModelGenerateInfo();
        modelGenerateInfo.setAuthor("yn");
        modelGenerateInfo.setBasePackage("a");
        modelGenerateInfo.setDate(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date()));
        modelGenerateInfo.setModelNameUpperCamel(CommonUtil.getNameUpperCamel(tableInfo.getTableName()));
        modelGenerateInfo.setSign("a");
        modelGenerateInfo.setTableComment(tableInfo.getTableComment());
        modelGenerateInfo.setTableName(tableInfo.getTableName());
        List<ModelGenerateColumnInfo> modelGenerateColumnInfos = new ArrayList<>();
        List<String> importList = new ArrayList<>();
        for (TableColumn tableColumn : tableInfo.getTableColumns()) {
            ModelGenerateColumnInfo modelGenerateColumnInfo = new ModelGenerateColumnInfo();
            modelGenerateColumnInfo.setColumnComment(tableColumn.getColumnComment());
            modelGenerateColumnInfo.setColumnJavaTypeName(DataTypeEnum.getJavaTypeNameByDataType(tableColumn.getDataType()));
            modelGenerateColumnInfo.setColumnName(CommonUtil.getNameLowerCamel(tableColumn.getColumnName()));
            modelGenerateColumnInfos.add(modelGenerateColumnInfo);
            if(CommonUtil.isNeedImport(modelGenerateColumnInfo.getColumnJavaTypeName())){
                importList.add(DataTypeEnum.getJavaTypeByDataType(tableColumn.getDataType()));
            }
        }
        modelGenerateInfo.setColumnList(modelGenerateColumnInfos);
        modelGenerateInfo.setImportList(importList);
        Map<String, Object> root = new HashMap<>();
        root.put("modelGenerateInfo",modelGenerateInfo);
        String fileName = CommonUtil.getNameUpperCamel(tableInfo.getTableName()) + ".java";
        try {
            FreeMarkUtil.generateFile(root,"model.ftl",System.getProperty("user.dir")+"/src/main/java/com/yn/code/modelgenerated/",fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
