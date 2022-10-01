package cn.tedu.csmall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class CsmallProductApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DataSource dataSource;

    @Test
    void testConnection() throws SQLException {
        dataSource.getConnection();
        System.out.println("连接数据库成功!-------------------------------------");
    }
}
