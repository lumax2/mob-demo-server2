package com.mob.test.sqlparser;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.util.JdbcConstants;

import java.util.List;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/8/17:11:28
 */
public class MysqlParseTest {
    public static void main(String[] args) {
         String sql = "update t set name = ‘x‘ where id < 100 limit 10";
        // String sql = "SELECT ID, NAME, AGE FROM USER WHERE ID = ? limit 2";
        // String sql = "select * from tablename limit 10";

//        String sql = "select a,count(1),b from some_table where a>1 and b<2";
        String dbType = JdbcConstants.MYSQL;

        //格式化输出
        String result = SQLUtils.format(sql, dbType);
        System.out.println(result); // 缺省大写格式
        List<SQLStatement> stmtList = SQLUtils.parseStatements(sql, dbType);

        //解析出的独立语句的个数
        System.out.println("size is:" + stmtList.size());
        for (int i = 0; i < stmtList.size(); i++) {

            SQLStatement stmt = stmtList.get(i);
            MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
            stmt.accept(visitor);



            //获取表名称
            System.out.println("Tables : " + visitor.getCurrentTable());
            //获取操作方法名称
            System.out.println("Tables : " + visitor.getTables());
            //获取字段名称
            System.out.println("fields : " + visitor.getColumns());


//            获取条件
            System.out.println(visitor.getConditions().get(0).getColumn());

        }

    }
}
