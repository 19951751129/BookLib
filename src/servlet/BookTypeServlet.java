package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.BookTypeDao;
import Dao.BookTypeDaoImp;
import enity.BookType;
import service.BookTypeService;
import service.BookTypeServiceImpl;

public class BookTypeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	public void add(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		String typename = req.getParameter("TypeName");
		String typedes = req.getParameter("TypeDes");
		BookType bt = new BookType(typename, typedes);
		BookTypeService bts = new BookTypeServiceImpl();
		bts.addType(bt);
	}

	public void list(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		BookType bt = new BookType();
		BookTypeService bts = new BookTypeServiceImpl();
		List<BookType> list = bts.listType();
		req.setAttribute("booklist", list);
		try {
			req.getRequestDispatcher("/booktype/typeList.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("servelet");
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		BookType bt = new BookType();
		String id = req.getParameter("id");
		bt.setId(Integer.parseInt(id));
		BookTypeService bts = new BookTypeServiceImpl();
		bts.delete(bt);
	}
	
	public void select(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String i = req.getParameter("id");
		int id = Integer.parseInt(i);
		BookTypeService bts = new BookTypeServiceImpl();
		BookType bt = bts.select(id);
		req.setAttribute("b", bt);
		try {
			req.getRequestDispatcher("/booktype/update.jsp").forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void update(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("update1");
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String typename = req.getParameter("TypeName");
		String des = req.getParameter("TypeDes");
		String id = req.getParameter("Id");
		
		BookType bt = new BookType();
		bt.setDes(des);
		bt.setTypeName(typename);
		bt.setId(Integer.parseInt(id));
		System.out.println(bt.getId());
		BookTypeService bts = new BookTypeServiceImpl();
		bts.update(bt);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		String method = req.getParameter("method");
		if (method.equals("add")) {
			add(req, resp);
		}
		else if (method.equals("list")) {
			
				list(req,resp);}
			
		else 	if (method.equals("delete")) {
				delete(req, resp);
			}
		else 	if (method.equals("select")) {
				select(req, resp);
			}
		else 	if (method.equals("update")) {
			update(req, resp);
		}
		
	}

}
