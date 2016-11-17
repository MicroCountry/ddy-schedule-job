# ddy-schedule-job
动态调度系统 （dynamic schedule system）

访问路径 : http://localhost:port/ddy-schedule-job/job/1   定时任务列表


数据库表
CREATE TABLE `sys_schedulejob` (
  `scheduleJobId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号主键',
  `scheduleJobName` varchar(250) NOT NULL DEFAULT '0' COMMENT '定时任务名称',
  `scheduleJobGroupId` bigint(20) NOT NULL DEFAULT '0' COMMENT '任务组ID',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态 0-运行 1-停止',
  `scheduleJobDescription` varchar(250) DEFAULT '0' COMMENT '描述',
  `createTime` bigint(20) NOT NULL COMMENT '任务创建时间',
  `scheduleJobCronExpression` varchar(250) NOT NULL DEFAULT '0' COMMENT '时间表达式',
  `scheduleJobMethod` varchar(250) NOT NULL COMMENT '执行的方法',
  `scheduleJobClass` varchar(250) NOT NULL COMMENT '执行的类',
  PRIMARY KEY (`scheduleJobId`),
  UNIQUE KEY `scheduleJobName` (`scheduleJobName`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

CREATE TABLE `sys_schedulejob_group` (
  `scheduleJobGroupId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号主键',
  `scheduleJobGroupName` varchar(250) NOT NULL DEFAULT '0' COMMENT '任务组名称',
  `scheduleJobGroupDescription` varchar(250) DEFAULT '0' COMMENT '任务组描述',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '状态 0-运行  1冻结',
  `createTime` bigint(20) NOT NULL COMMENT '任务组创建时间',
  PRIMARY KEY (`scheduleJobGroupId`),
  UNIQUE KEY `scheduleJobGroupName` (`scheduleJobGroupName`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
