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
 * ��װ�˻�����CRUD�ķ����ṩ��������̳�ʹ��
 * @author 37046
 *
 *��ǰDAOֱ���ڷ����л�ȡ���ݿ����ӣ�
 *����DAO��ȡDBUtile�������
 * @param <T>:��ǰDAO�����ʵ�����������ʲô
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
	 * ����ĳһ���ֶε�ֵ�����緵��ĳһ����¼��customerName���򷵻����ݱ����ж�������¼
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
			System.out.println("get���ݿ����");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	/**
	 * ����T����Ӧ��List
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
			System.out.println("get���ݿ����");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
		
	}
	/**
	 * ���ض�Ӧ��T��һ��ʵ����
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
			System.out.println("get���ݿ����");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	/**
	 * �÷�����װ��INSERT,DELETE,UPDATE����
	 * 
	 * @param sql��sql���
	 * @param args�����sql����ռλ��
	 */
	public int update(String sql,Object ...args) {
		Connection connection=null;
		int n=0;
		try {
			connection=JdbcUtils.getConnection();
			n=queryRunner.update(connection, sql, args);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("update���ݿ����");
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
