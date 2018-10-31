package Dao;

import java.util.List;

import enity.BookType;

public interface BookTypeDao {
	
	public void addType(BookType b);
	public List<BookType> listType();
	public void delete(BookType b);
	public BookType select(int id);
	public void update(BookType b);
}

