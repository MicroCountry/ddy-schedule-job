package com.ddy.schedule.dao;

import java.util.List;

import com.ddy.schedule.po.ScheduleJob;
public interface ScheduleJobDao {

	/**
	 * 添加定时器
	 * 
	 * @param scheduleJob
	 */
	public ScheduleJob insert(ScheduleJob scheduleJob);

	/**
	 * 修改定时器信息
	 * 
	 * @param scheduleJob 定时任务
	 * @param is_update 是否纯粹的更新功能
	 * @return
	 */
	public ScheduleJob update(ScheduleJob scheduleJob, boolean is_update);

	/**
	 * 删除定时器信息
	 * 
	 * @param scheduleJob
	 */
	public void delete(ScheduleJob scheduleJob);

	/**
	 * 根据ID返回定时器对象
	 * 
	 * @param scheduleJobId
	 * @return
	 */
	public ScheduleJob getScheduleJob(Long scheduleJobId);

	/**
	 * 定时器列表
	 * 
	 * @return
	 */
	public List<ScheduleJob> findAll();

	/**
	 * 得到定时器组下的定时任务
	 * 
	 * @param scheduleJobGroupId
	 * @return
	 */
	public List<ScheduleJob> findScheduleJobByGroupId(Long scheduleJobGroupId);

}
