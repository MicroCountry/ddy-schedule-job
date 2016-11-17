package com.ddy.schedule.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddy.schedule.dao.ScheduleJobGroupDao;
import com.ddy.schedule.po.ScheduleJobGroup;
import com.ddy.schedule.service.ScheduleJobGroupService;


@Service
public class ScheduleJobGroupServiceImpl implements ScheduleJobGroupService {

	@Resource
	private ScheduleJobGroupDao scheduleJobGroupDao;
	
	@Override
	public ScheduleJobGroup getScheduleJobGroup(String scheduleJobGroupName) {
		return scheduleJobGroupDao.getScheduleJobGroup(scheduleJobGroupName);
	}

	@Override
	public ScheduleJobGroup getScheduleJobGroup(Long scheduleJobGroupId) {
		return scheduleJobGroupDao.getScheduleJobGroup(scheduleJobGroupId);
	}

	@Override
	public List<ScheduleJobGroup> getScheduleJobGroups() {
		return scheduleJobGroupDao.getScheduleJobGroups();
	}

	@Override
	public ScheduleJobGroup insert(ScheduleJobGroup scheduleJobGroup) {
		return scheduleJobGroupDao.insert(scheduleJobGroup);
	}

	@Override
	public void update(ScheduleJobGroup scheduleJobGroup) {
		scheduleJobGroupDao.update(scheduleJobGroup);
	}

	@Override
	public void delete(ScheduleJobGroup scheduleJobGroup) {
		scheduleJobGroupDao.delete(scheduleJobGroup);
	}
}
