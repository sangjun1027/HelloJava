package Board;

public class Board {		//필드
		//필드
	private String id;
	private String pwd;
	private String name;
	private int phone;
	
	public Board(String id, String pwd, String name, int phone) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone;
	}
	
		//생성자
	public Board() {}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
		//메소드
	
		
}

