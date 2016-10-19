package com.bjsxt.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import ognl.Ognl;

public class ResultUtil {
	

	public static <T> T resultSetToBean(ResultSet resultSet,Class<T> clazz) {
		List<T> list=resultSetToList(resultSet, clazz);
		if(list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
		
		
	}
	/**
	 * 将结果集中的数据转存入list集合中
	 * 
	 * @param resultSet
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> resultSetToList(ResultSet resultSet,Class<T> clazz){
		//申明一个容器存放ResultSet中的数据
		List<T> list=new ArrayList<>();
		try {
			//获取本次查询的列
			ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
			while(resultSet.next()){
				T bean=clazz.getConstructor().newInstance();
				
				for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
					String fieldName=resultSetMetaData.getColumnLabel(i + 1 );
					Field field= clazz.getDeclaredField(fieldName);
					Ognl.setValue(fieldName,bean, resultSet.getObject(fieldName) );
				
				}
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

}
