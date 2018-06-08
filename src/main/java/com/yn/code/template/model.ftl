package ${modelInfo.basePackage}.model.${modelInfo.sign};

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
/**
 * ${modelInfo.tableComment}
 * 表：  ${modelInfo.table}
 * @author  ${modelInfo.author}
 * @date ${modelInfo.date}
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("${modelInfo.tableComment}")
public class ${modelInfo.modelNameUpperCamel} {

    <#list modelInfo.columnList as column>
    @ApiModelProperty(value = "${column.columnComment}")
    private ${column.columnJavaType} ${column.columnName};
    </#list>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        <#list modelInfo.columnList as column>
        sb.append(", ${column.columnName}=").append(${column.columnName});
        </#list>
        sb.append("]");
        return sb.toString();
    }
}