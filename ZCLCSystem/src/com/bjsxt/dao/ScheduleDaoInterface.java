package com.bjsxt.dao;

import com.bjsxt.vo.Schedule;
import com.bjsxt.vo.User;

public interface ScheduleDaoInterface {
	/**
	 * ���̲�ѯ
	 * @param schedule
	 */
	
	public void doScheduleQuery(Integer hostTeamId);
	/**
	 * �������
	 * @param schedule
	 */
	
	public void doScheduleAdd(Schedule schedule);
	/**
	 * ����ɾ��
	 * @param schedule
	 */
	
	public void doScheduleDelete(Integer id);
	

}
