package com.study.id;

import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * 自定义主键id
 */
public class MyGenerateId implements ShardingKeyGenerator {
    private SnowflakeShardingKeyGenerator snow = new SnowflakeShardingKeyGenerator();

    //id生成策略算法
    @Override
    public Comparable<?> generateKey() {
        System.out.println("执行了自定义id生成策略!");
        return snow.generateKey();
    }

    //自定义id名称，配置到配置文件中
    @Override
    public String getType() {
        return "MyGenerate";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
