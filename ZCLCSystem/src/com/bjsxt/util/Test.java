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
		System.out.println("-------��ӭ��¼����ʦ�����ĵ�½��-----");
		System.out.println("�������û��������루������  1086����");
		//�û���  ������  ���� 1086
		Scanner scanner = new Scanner(System.in);
		user.setUname(scanner.next());
		user.setPwd(scanner.next());
		boolean flag = userDao.doUserLogin(user);
		if (flag) {
			System.out.println("��½�ɹ�");
			int num = printManu();
			switch (num) {
			case 1:
				System.out.println("����������id");
				int hostTeamId = scanner.nextInt();
				scheduleDao.doScheduleQuery(hostTeamId);
				break;
			case 2:
                Schedule schedule=new Schedule();
				System.out.println("�����볡�Σ�");
				schedule.setId(scanner.nextInt());
				System.out.println("����������ID��");
				schedule.setHostTeamId(scanner.nextInt());
				System.out.println("������Ͷ�ID��");
				schedule.setAwayTeamId(scanner.nextInt());
				System.out.println("������������أ�");
				schedule.setCompetitionPosition(scanner.next());
				System.out.println("���������ձȷ֣�");
				schedule.setScore(scanner.next());
				System.out.println("������¼���ˣ�");
				schedule.setEntryPerson(scanner.next());
				scheduleDao.doScheduleAdd(schedule); 
				System.out.println("��ӳɹ�");
				break;
				
			case 3:
				System.out.println("������Ҫɾ�������̺�");
				int id = scanner.nextInt();
				scheduleDao.doScheduleDelete(id);
				System.out.println("ɾ���ɹ�");
				break;
			case 0:
				System.out.println("�˳��ɹ�");
				break;

			default:
				break;
			}

		} else {
			System.out.println("�û������������");
		}

	}

	private static int printManu() {
		System.out.println("------------------2016���г���������ϵͳ-------------");
		System.out.println("-----------------1.���̲�ѯ-----------------");
		System.out.println("-----------------2.�������-----------------");
		System.out.println("-----------------3.����ɾ��-----------------");
		System.out.println("-----------------0.�˳�--------------------");
		Scanner scanner2 = new Scanner(System.in);
		int num = scanner2.nextInt();
		return num;
	}

}
