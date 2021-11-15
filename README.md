# moreDataSource
springboot+mybatis+hikari 多数据源配置




two数据源需增加：
 // 自定义mybatis配置
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setLogImpl(org.apache.ibatis.logging.stdout.StdOutImpl.class);
        config.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(config);//  
        
        
  不然结果序列化会有问题

 CREATE TABLE `log` (
  `log_id` varchar(32) NOT NULL,
  `log_user` varchar(32) DEFAULT NULL,
  `log_time` datetime DEFAULT NULL,
  `log_ip` varchar(15) DEFAULT NULL,
  `log_action` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

