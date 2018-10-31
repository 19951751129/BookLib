package service;

import java.util.List;

import Dao.BookTypeDao;
import Dao.BookTypeDaoImp;
import enity.BookType;

public class BookTypeServiceImpl implements BookTypeService{

	@Override
	public void addType(BookType b) {
		BookTypeDao btd=new BookTypeDaoImp();
		btd.addType(b);
	}

	@Override
	public List<BookType> listType() {
		BookTypeDao btd=new BookTypeDaoImp();
		List<BookType> list = btd.listType();
		return list;
	}

	@Override
	public void delete(BookType b) {
		System.out.println("service");
		BookTypeDao btd=new BookTypeDaoImp();
		btd.delete(b);
	}

	@Override
	public BookType select(int id) {
		BookTypeDao btd=new BookTypeDaoImp();
		BookType bt = btd.select(id);
		return bt;
	}

	@Override
	public void update(BookType b) {
		System.out.println("service");
		BookTypeDao btd=new BookTypeDaoImp();
		btd.update(b);
	}

}
