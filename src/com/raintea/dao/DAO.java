package com.raintea.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.raintea.db.JdbcUtils;

/**
 * 封装了基本的CRUD的方法提供，以子类继承使用
 * @author 37046
 *
 *当前DAO直接在方法中获取数据库连接，
 *整个DAO采取DBUtile解决方案
 * @param <T>:当前DAO处理的实体类的类型是什么
 */
public class DAO<T> {
	public QueryRunner queryRunner=new QueryRunner();
	
	private Class<T> clazz;
	
	public DAO() {
		Type superClass=getClass().getGenericSuperclass();
		if(superClass instanceof ParameterizedType) {
			ParameterizedType parameterizedType=(ParameterizedType) superClass;
			Type [] typeArgs=parameterizedType.getActualTypeArguments();
			if(typeArgs!=null&&typeArgs.length>0) {
				if(typeArgs[0] instanceof Class) {
					clazz=(Class<T>) typeArgs[0];
				}
			}
		}
	}
	/**
	 * 返回某一个字段的值：例如返回某一条记录的customerName，或返回数据表中有多少条记录
	 * @param sql
	 * @param args
	 * @return
	 */
	public <E> E getForValue(String sql,Object ...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return (E) queryRunner.query(connection, sql, new ScalarHandler(), args);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	/**
	 * 返回T所对应的List
	 * @param sql
	 * @param args
	 * @return
	 */
	public List<T> getForList(String sql,Object ...args){
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
		
	}
	/**
	 * 返回对应的T的一个实体类
	 * @param sql:
	 * @param args:
	 * @return
	 */
	public T get(String sql,Object ...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanHandler<>(clazz), args);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	/**
	 * 该方法封装了INSERT,DELETE,UPDATE操作
	 * 
	 * @param sql：sql语句
	 * @param args：填充sql语句的占位符
	 */
	public int update(String sql,Object ...args) {
		Connection connection=null;
		int n=0;
		try {
			connection=JdbcUtils.getConnection();
			n=queryRunner.update(connection, sql, args);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("update数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return n;
	}
	
	public List<String> getStrList(String sql,String column,Object ...args){
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return (List<String>) queryRunner.query(connection, sql, new ColumnListHandler(column), args);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("getError");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}

	
}
