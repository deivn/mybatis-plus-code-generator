package com.fengwenyi.code_generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.fengwenyi.code_generator.util.CommonUtils;

/**
 * MySQL 数据库代码生成类
 * @author Erwin Feng
 * @since 2019-04-17 10:33
 */
public class MySQL8CodeGenerator {

    public static void main(String[] args) {
        DbType dbType = DbType.MYSQL;
        String dbUrl = "jdbc:mysql://hadoop103:3306/test";
        String username = "root";
        String password = "123456";
        String driver = "com.mysql.cj.jdbc.Driver";
        // 表前缀，生成的实体类，不含前缀
        String [] tablePrefixes = {"sss"};
        // 表名，为空，生成所有的表
        String [] tableNames = {"student"};
        // 字段前缀
        String [] fieldPrefixes = {};
        // 基础包名
        String packageName = "com.time.example";
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes);
    }

}
