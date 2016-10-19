package com.bjsxt.dao;

import com.bjsxt.vo.Schedule;
import com.bjsxt.vo.User;

public interface ScheduleDaoInterface {
	/**
	 * 赛程查询
	 * @param schedule
	 */
	
	public void doScheduleQuery(Integer hostTeamId);
	/**
	 * 赛程添加
	 * @param schedule
	 */
	
	public void doScheduleAdd(Schedule schedule);
	/**
	 * 赛程删除
	 * @param schedule
	 */
	
	public void doScheduleDelete(Integer id);
	

}
