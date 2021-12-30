package com.example.demo.transaction.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;


/**
 * @author: zenghai.li
 * @Date: 2021/12/30
 * @Description:
 */
public class MyTransactionTemplate {

    /**
     * 数据源加入事务管理
     * @param masterDataSource
     * @return
     */
    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager masterDataSourceTransactionManager(@Qualifier("masterDataSource") DataSource masterDataSource) {
        final DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(masterDataSource);
        return dataSourceTransactionManager;
    }

    @Bean(name = "transactionTemplate")
    @Primary
    public TransactionTemplate masterTransactionTemplate (@Qualifier("transactionManager") DataSourceTransactionManager transactionManager) {
        final TransactionTemplate transactionTemplate = new TransactionTemplate();
        transactionTemplate.setTransactionManager(transactionManager);
        transactionTemplate.setIsolationLevelName("ISOLATION_DEFAULT");
        transactionTemplate.setPropagationBehaviorName("PROPAGATION_REQUIRED");
        return transactionTemplate;
    }
}
