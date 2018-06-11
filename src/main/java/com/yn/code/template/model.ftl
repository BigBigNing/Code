package ${modelGenerateInfo.basePackage}.model.${modelGenerateInfo.sign};

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
/**
 * ${modelGenerateInfo.tableComment}
 * 表：  ${modelGenerateInfo.tableName}
 * @author  ${modelGenerateInfo.author}
 * @date ${modelGenerateInfo.date}
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("${modelGenerateInfo.tableComment}")
public class ${modelGenerateInfo.modelNameUpperCamel} {

    <#list modelGenerateInfo.columnList as column>
    @ApiModelProperty(value = "${column.columnComment}")
    private ${column.columnJavaTypeName} ${column.columnName};
    </#list>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        <#list modelGenerateInfo.columnList as column>
        sb.append(", ${column.columnName}=").append(${column.columnName});
        </#list>
        sb.append("]");
        return sb.toString();
    }
}