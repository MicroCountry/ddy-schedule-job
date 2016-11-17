package com.ddy.schedule.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestScheduleJob {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	public void method1(){
		logger.info("任务执行1中...");
	}
	
	public void method2(){
		logger.info("任务执行2中...");
	}
	
	public void method3(){
		logger.info("任务执行3中...");
	}
	
	public void method4(){
		logger.info("任务执行4中...");
	}
	
	public void method5(){
		logger.info("任务执行5中...");
	}
}
