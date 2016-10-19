package com.bjsxt.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import com.bjsxt.util.ResultUtil;
import com.bjsxt.vo.Schedule;

public class ScheduleDao implements ScheduleDaoInterface {
	String className = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	String user = "scott";
	String password = "tiger";

	@Override
	public void doScheduleQuery(Integer hostTeamId) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Schedule schedule = null;
		try {
			Class.forName(className);
             System.out.println("ScheduleDao.doScheduleQuery()"+hostTeamId);
			// 获取数据库连接
			connection = DriverManager.getConnection(url, user, password);
			// 发送sql语句
			statement = connection.createStatement();
			// 返回指定的结果集
			String sql = "SELECT * FROM ScheduleInfo where hostTeamId="+hostTeamId+"";
			resultSet = statement.executeQuery(sql);
			System.out.println(resultSet);
			schedule = ResultUtil.resultSetToBean(resultSet, Schedule.class);
			System.out.println(schedule);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭连接，释放资源
			try {
				//resultSet.close();
				//statement.close();
				//connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void doScheduleAdd(Schedule schedule) {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(className);

			// 获取数据库连接
			connection = DriverManager.getConnection(url, user, password);
			String sql = "insert into ScheduleInfo values(?,?,?,?,?,?,?,?,?)";
			// 发送sql语句
			statement = connection.prepareStatement(sql);
			statement.setInt(1, schedule.getId());
			statement.setInt(2, 2);
			statement.setInt(3, schedule.getHostTeamId());
			statement.setInt(4, schedule.getAwayTeamId());
			statement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			statement.setString(6, schedule.getCompetitionPosition());
			statement.setString(7, schedule.getScore());
			statement.setString(8, schedule.getEntryPerson());
			statement.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
			
			statement.executeUpdate();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭连接，释放资源
			try {
				
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	
		

	}

	@Override
	public void doScheduleDelete(Integer id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(className);

			// 获取数据库连接
			connection = DriverManager.getConnection(url, user, password);
			// 发送sql语句
			statement = connection.createStatement();
			// 返回指定的结果集
			String sql = "delete FROM ScheduleInfo where id='"+id+"'";
			statement.executeUpdate(sql);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭连接，释放资源
			try {
				
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
