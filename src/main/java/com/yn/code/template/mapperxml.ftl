<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${mapperGenerateInfo.mapperPackage}.${mapperGenerateInfo.modelNameUpperCamel}Mapper">
    <resultMap id="BaseResultMap" type="${mapperGenerateInfo.modelPath}.${mapperGenerateInfo.modelNameUpperCamel}">
        <#list mapperGenerateInfo.columnList as column>
            <#if mapperGenerateInfo.primaryKey == column.columnName>
        <id column="${column.columnName}" jdbcType="${column.columnJdbcType}" property="${column.columnCamelName}" />
            <#else>
        <result column="${column.columnName}" jdbcType="${column.columnJdbcType}" property="${column.columnCamelName}" />
            </#if>
        </#list>
    </resultMap>

    <sql id="Base_Column_List">
    <#list mapperGenerateInfo.columnList as column><#if column_has_next>${column.columnName},<#else>${column.columnName}</#if></#list>
    </sql>

    <select id="selectByPrimaryKey" parameterType="${mapperGenerateInfo.primaryKeyJavaTypeName}" resultMap="BaseResultMap">
        select 
        <include refid="Base_Column_List" />
        from ${mapperGenerateInfo.tableName}
        where ${mapperGenerateInfo.primaryKey} = ${"#\{"}${mapperGenerateInfo.primaryKeyCamel},jdbcType=${primaryKeyJdbcType}${"}"}
    </select>

    <insert id="insert" parameterType="${mapperGenerateInfo.modelPath}.${mapperGenerateInfo.modelNameUpperCamel}" keyProperty="${mapperGenerateInfo.primaryKey}" useGeneratedKeys="true">
        insert into ${mapperGenerateInfo.tableName}
        (<#list mapperGenerateInfo.columnList as column><#if mapperGenerateInfo.primaryKey != column.columnName><#if column_has_next>${column.columnName},<#else>${column.columnName}</#if></#if></#list>)
        values (
        <#list mapperGenerateInfo.columnList as column>
            <#if mapperGenerateInfo.primaryKey != column.columnName>
                <#if column_has_next>
            ${"#\{"}${column.columnCamelName},jdbcType=${column.columnJdbcType}${"}"},
                <#else>
            ${"#\{"}${column.columnCamelName},jdbcType=${column.columnJdbcType}${"}"}
                </#if>
            </#if>
        </#list>
        )
    </insert>

    <insert id="insertSelective" parameterType="${mapperGenerateInfo.modelPath}.${mapperGenerateInfo.modelNameUpperCamel}">
        insert into t_account
        <trim prefix="(" suffix=")" suffixOverrides=",">
            <if test="userName != null">
                user_name,
            </if>
            <if test="pwd != null">
                pwd,
            </if>
            <if test="createTime != null">
                create_time,
            </if>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides=",">
            <if test="userName != null">
                #{userName,jdbcType=VARCHAR},
            </if>
            <if test="pwd != null">
                #{pwd,jdbcType=VARCHAR},
            </if>
            <if test="createTime != null">
                #{createTime,jdbcType=TIMESTAMP},
            </if>
        </trim>
    </insert>

    <update id="updateByPrimaryKeySelective" parameterType="${mapperGenerateInfo.modelPath}.${mapperGenerateInfo.modelNameUpperCamel}">
        update t_account
        <set>
            <if test="userName != null">
                user_name = #{userName,jdbcType=VARCHAR},
            </if>
            <if test="pwd != null">
                pwd = #{pwd,jdbcType=VARCHAR},
            </if>
            <if test="createTime != null">
                create_time = #{createTime,jdbcType=TIMESTAMP},
            </if>
        </set>
        where id = #{id,jdbcType=BIGINT}
    </update>
</mapper>