package enity;

public class BookType {
	private int id;
	private String typeName;
	private String des;

	public BookType() {
		super();
	}

	public BookType(String typeName, String des) {
		super();
		this.typeName = typeName;
		this.des = des;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}
