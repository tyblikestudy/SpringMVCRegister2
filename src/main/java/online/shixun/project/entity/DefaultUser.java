package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;

public class DefaultUser extends SimpleUser {
	
	private String email;
	
	private String profession;
	
	@NotBlank(message="email不能为空")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@NotBlank(message="职业不能为空")
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
}
