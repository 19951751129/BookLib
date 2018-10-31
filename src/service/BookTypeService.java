package service;

import java.util.List;

import enity.BookType;

public interface BookTypeService {
	public void addType(BookType b);
	public List<BookType> listType();
	public void delete(BookType b);
	public BookType select(int id);
	public void update(BookType b);
}
