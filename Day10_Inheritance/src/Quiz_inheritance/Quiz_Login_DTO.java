package Quiz_inheritance;

public class Quiz_Login_DTO {
	public String id, pwd;
	//setter, getter »ý¼º
	
	public Quiz_Login_DTO() {}
	/*
	public Quiz_Login_DTO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	*/

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
	

}
