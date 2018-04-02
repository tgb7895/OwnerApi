package com.raintea.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.alibaba.fastjson.JSON;
import com.raintea.bean.index.Banner;
import com.raintea.bean.index.Data;
import com.raintea.bean.index.Index;
import com.raintea.bean.index.Notice;
import com.raintea.bean.index.Order;
import com.raintea.dao.DAO;
import com.raintea.dao.IndexDAO;
import com.raintea.db.JdbcUtils;

public class IndexDAOJdbcImpl extends DAO<Data> implements IndexDAO{



	@Override
	public Index getall(int community_id, int owner_id) {
		Index index=null;
		try {
			index = new Index();
			index.setErrCode("0001");
			index.setErrMsg("");
			index.setRetCode("");
			Data data = new Data();
			String sqlBannerB = "SELECT id," + "title," + "pic ," + "(1)'type'" + "FROM " + "tenement_banner "
					+ "WHERE " + "community_id=?;";
			List<Banner> bannerListB = getBannerList(sqlBannerB, community_id);
			String sqlBannnerA = "SELECT id," + "NAME " + "title," + "pic," + "(2)'type' " + "FROM "
					+ "tenement_activity " + "WHERE community_id=?;";
			List<Banner> bannerListA = getBannerList(sqlBannnerA, community_id);
			bannerListA.addAll(bannerListB);
			data.setBanner(bannerListA);
			data.setMessage_num(bannerListA.size());
			String sqlOrder = "SELECT " + "tenement_repair.id order_id," + "username worker_name,"
					+ "telephone worker_phone," + "receive_order_time " + "FROM " + "tenement_repair,"
					+ "tenement_community_workperson " + "WHERE "
					+ "tenement_repair.`worker_id`=`tenement_community_workperson`.`id`"
					+ " AND tenement_repair.`owner_id`=? " + "AND tenement_repair.`community_id`=?;";
			List<Order> orderList = getOrderList(sqlOrder, owner_id, community_id);
			data.setOrder(orderList);
			String sqlNot = "SELECT id," + "('title') title," + "content," + "community_id," + "trans_time " + "from "
					+ "tenement_notice " + "where " + "community_id=?;";
			Notice notice = getNotice(sqlNot, community_id);
			data.setNotice(notice);
			index.setData(data);
		} catch (Exception e) {
			index.setErrCode("0000");
			index.setErrMsg("获取信息失败");
			index.setRetCode("0000");
		}
		return index;
		
	}
	
	public List<Banner> getBannerList(String sql,Object ...args){
		Connection connection=null;

		try {
			connection=JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(Banner.class), args);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
		
	}
	public List<Order> getOrderList(String sql,Object ...args){
		Connection connection=null;

		try {
			connection=JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(Order.class), args);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
		
	}
	public Notice getNotice(String sql,Object ...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanHandler<>(Notice.class), args);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("get数据库错误");
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}

}
