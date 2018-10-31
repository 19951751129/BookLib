package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.JdbcUtil;

import enity.BookType;

public class BookTypeDaoImp implements BookTypeDao {

	@Override
	public void addType(BookType b) {
		String sql = "insert into bmanager.book_type(type_name,des) values(?,?)";

		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pre = JdbcUtil.getPreparedStatement(conn, sql);
		try {
			pre.setString(1, b.getTypeName());
			pre.setString(2, b.getDes());

			pre.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcUtil.close(null, pre, conn);
	}

	@Override
	public List<BookType> listType() {
		
		String sql = "select * from bmanager.book_type";
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pre = JdbcUtil.getPreparedStatement(conn, sql);
	
		ResultSet set =null;
		List<BookType> list=new ArrayList<BookType>();
		try {
			 set= pre.executeQuery();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(set.next()) {
				BookType bt=new BookType(); 
				bt.setId(set.getInt(1));
				bt.setTypeName(set.getString(2));
				bt.setDes(set.getString(3));
				list.add(bt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcUtil.close(null, pre, conn);
		return list;
		
	}

	@Override
	public void delete(BookType b) {
		System.out.println("dao");
		String sql = "delete from bmanager.book_type where id=?";

		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pre = JdbcUtil.getPreparedStatement(conn, sql);
		try {
			pre.setInt(1, b.getId());
			pre.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcUtil.close(null, pre, conn);
	}

	@Override
	public BookType select(int id) {
		String sql = "select * from bmanager.book_type where id=?";

		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pre = JdbcUtil.getPreparedStatement(conn, sql);
		ResultSet set=null;
		 BookType bt=null;
		try {
			pre.setInt(1, id);
			set = pre.executeQuery();
	if(set.next()) {
		      bt = new BookType();
		bt.setId(set.getInt(1));
			bt.setTypeName(set.getString(2));
			bt.setDes(set.getString(3));
	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcUtil.close(null, pre, conn);
		return bt;
	}

	@Override
	public void update(BookType b) {
		System.out.println("dao");
		String sql = "update bmanager.book_type set  type_name=?, des=? where id=?";
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pre = JdbcUtil.getPreparedStatement(conn, sql);
		try {
			pre.setString(1, b.getTypeName());
			pre.setString(2, b.getDes());
			pre.setInt(3, b.getId());
			pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcUtil.close(null, pre, conn);
	}

}
