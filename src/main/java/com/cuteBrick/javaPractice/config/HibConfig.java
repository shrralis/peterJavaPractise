/*
package com.cuteBrick.javaPractice.config;

import com.cuteBrick.javaPractice.entity.*;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

//@Configuration
@EnableTransactionManagement
@ComponentScan({"com.cuteBrick.javaPractice.config"})
@PropertySource(value = { "classpath:app.properties" })
public class HibConfig {

    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.driver}")
    private String dbDriver;
    @Value("${db.login}")
    private String dbLogin;
    @Value("${db.password}")
    private String dbPassword;
    @Value("${db.hibDialect}")
    private String hibDialect;
    @Value("${db.hibShowSQL}")
    private String showSQL;
    @Value("${db.hibFormatSQL}")
    private String formatSQL;

   */
/* @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[]{"com.cuteBrick.javaPractice.entity"});
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }*//*


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbLogin);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+hibDialect);
        properties.put("hibernate.dialect", hibDialect);
        properties.put("hibernate.show_sql", showSQL);
        properties.put("hibernate.format_sql", formatSQL);
        return properties;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
        HibernateTransactionManager txmanager = new HibernateTransactionManager();
        txmanager.setSessionFactory(s);
        return txmanager;
    }

    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

    @Bean
    public SessionFactory getSessionFactory() {
        return new LocalSessionFactoryBuilder(getDataSource())
                .addAnnotatedClasses(Categories.class)
                .addAnnotatedClasses(Items.class)
                .addAnnotatedClasses(ItemOrders.class)
                .addAnnotatedClasses(Orders.class)
                .addAnnotatedClasses(Units.class)
                .addAnnotatedClasses(Users.class)
                .buildSessionFactory();
    }

    @Bean
    public HibernateTemplate getHibernateTemplate() {
        return new HibernateTemplate(getSessionFactory());
    }

    @Bean
    public HibernateTransactionManager getHibernateTransManager() {
        return new HibernateTransactionManager(getSessionFactory());
    }


}
*/
