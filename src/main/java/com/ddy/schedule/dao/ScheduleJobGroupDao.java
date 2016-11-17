package com.ddy.schedule.dao;

import java.util.List;

import com.ddy.schedule.po.ScheduleJobGroup;


public interface ScheduleJobGroupDao {
	/**
	 * 根据组名得到对象（组名唯一）
	 * 
	 * @param scheduleJobGroupName
	 * @return
	 */
	public ScheduleJobGroup getScheduleJobGroup(String scheduleJobGroupName);

	/**
	 * 根据ID得到对象
	 * 
	 * @param scheduleJobGroupId
	 * @return
	 */
	public ScheduleJobGroup getScheduleJobGroup(Long scheduleJobGroupId);

	/**
	 * 组列表
	 * 
	 * @return
	 */
	public List<ScheduleJobGroup> getScheduleJobGroups();

	/**
	 * 添加
	 * 
	 * @param scheduleJobGroup
	 */
	public ScheduleJobGroup insert(ScheduleJobGroup scheduleJobGroup);

	/**
	 * 更新
	 * 
	 * @param scheduleJobGroup
	 */
	public void update(ScheduleJobGroup scheduleJobGroup);

	/**
	 * 删除
	 * 
	 * @param scheduleJobGroup
	 */
	public void delete(ScheduleJobGroup scheduleJobGroup);
	
}
