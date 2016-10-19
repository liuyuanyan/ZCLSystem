package com.bjsxt.util;

import java.util.Scanner;

import com.bjsxt.dao.ScheduleDao;
import com.bjsxt.dao.UserDao;
import com.bjsxt.vo.Schedule;
import com.bjsxt.vo.User;

public class Test {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		User user = new User();
		ScheduleDao scheduleDao = new ScheduleDao();
		System.out.println("-------欢迎登录（老师让做的登陆）-----");
		System.out.println("请输入用户名和密码（刘媛媛  1086）：");
		//用户名  刘媛媛  密码 1086
		Scanner scanner = new Scanner(System.in);
		user.setUname(scanner.next());
		user.setPwd(scanner.next());
		boolean flag = userDao.doUserLogin(user);
		if (flag) {
			System.out.println("登陆成功");
			int num = printManu();
			switch (num) {
			case 1:
				System.out.println("请输入主队id");
				int hostTeamId = scanner.nextInt();
				scheduleDao.doScheduleQuery(hostTeamId);
				break;
			case 2:
                Schedule schedule=new Schedule();
				System.out.println("请输入场次：");
				schedule.setId(scanner.nextInt());
				System.out.println("请输入主队ID：");
				schedule.setHostTeamId(scanner.nextInt());
				System.out.println("请输入客队ID：");
				schedule.setAwayTeamId(scanner.nextInt());
				System.out.println("请输入比赛场地：");
				schedule.setCompetitionPosition(scanner.next());
				System.out.println("请输入最终比分：");
				schedule.setScore(scanner.next());
				System.out.println("请输入录入人：");
				schedule.setEntryPerson(scanner.next());
				scheduleDao.doScheduleAdd(schedule); 
				System.out.println("添加成功");
				break;
				
			case 3:
				System.out.println("请输入要删除的赛程号");
				int id = scanner.nextInt();
				scheduleDao.doScheduleDelete(id);
				System.out.println("删除成功");
				break;
			case 0:
				System.out.println("退出成功");
				break;

			default:
				break;
			}

		} else {
			System.out.println("用户名或密码错误");
		}

	}

	private static int printManu() {
		System.out.println("------------------2016年中超联赛管理系统-------------");
		System.out.println("-----------------1.赛程查询-----------------");
		System.out.println("-----------------2.赛程添加-----------------");
		System.out.println("-----------------3.赛程删除-----------------");
		System.out.println("-----------------0.退出--------------------");
		Scanner scanner2 = new Scanner(System.in);
		int num = scanner2.nextInt();
		return num;
	}

}
