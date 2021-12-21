package edu.iit.cs425.test;

import edu.iit.cs425.bean.Document;
import edu.iit.cs425.dao.DocumentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Connection;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-05
 * @version: 1.0
 **/
public class ConnectionMethod {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");

    @Test
    public void testConnection() throws Exception {
        // 1. load configuration file
        InputStream is = ConnectionMethod.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties info = new Properties();
        info.load(is);

        // 2. get configuration information
        String url = info.getProperty("jdbc.url");
        String user = info.getProperty("jdbc.username");
        String password = info.getProperty("jdbc.password");
        String driverClass = info.getProperty("jdbc.driverClass");

        // 3.get connection
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }

    @Test
    public void testConnection2() throws Exception {
        // 1. load configuration file
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testSqlSessionFactory(){
        SqlSessionFactory sqlSessionFactory = context.getBean(SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DocumentMapper mapper = sqlSession.getMapper(DocumentMapper.class);
        System.out.println(mapper);
    }
}
