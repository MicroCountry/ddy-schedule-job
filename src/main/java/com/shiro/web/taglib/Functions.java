package com.shiro.web.taglib;

import org.springframework.util.CollectionUtils;

import com.ddy.schedule.po.ScheduleJobGroup;
import com.ddy.schedule.service.ScheduleJobGroupService;
import com.ddy.schedule.util.SpringUtils;

import java.util.Collection;



@SuppressWarnings("all")
public class Functions {

    /**
     * 根据分组ID显示分组名称
     * @param scheduleJobGroupId
     * @return
     */
    public static String scheduleJobGroupName(Long scheduleJobGroupId){
    	ScheduleJobGroup scheduleJobGroup = getScheduleJobGroupService().getScheduleJobGroup(scheduleJobGroupId);
        if(scheduleJobGroup == null) {
            return "";
        }
        return scheduleJobGroup.getScheduleJobGroupName();
    }
    
    private static ScheduleJobGroupService scheduleJobGroupService;
    
    public static ScheduleJobGroupService getScheduleJobGroupService() {
        if(scheduleJobGroupService == null) {
        	scheduleJobGroupService = SpringUtils.getBean(ScheduleJobGroupService.class);
        }
        return scheduleJobGroupService;
    }
    
}
