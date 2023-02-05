package com.example.userservice.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
<<<<<<< HEAD
@MapperScan(basePackages= {"com.example.userservice.mapper"})
=======
@MapperScan(basePackages= {"com.example.userservice.mappers"})
>>>>>>> 2506750201c95b15db76515d886f3c770619dc10
@EnableTransactionManagement
public class MybatisConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
<<<<<<< HEAD
        sessionFactory.setMapperLocations(resolver.getResources("classpath:com/example/userservice/mapper/*.xml"));
=======
        sessionFactory.setMapperLocations(resolver.getResources("classpath:com/example/userservice/mappers/*.xml"));
>>>>>>> 2506750201c95b15db76515d886f3c770619dc10
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory )  throws Exception {
        final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSessionTemplate;
    }
}
