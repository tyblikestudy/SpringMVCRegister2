package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;

public class DefaultUser extends SimpleUser {
	
	private String email;
	
	private String profession;
	
	@NotBlank(message="email����Ϊ��")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@NotBlank(message="ְҵ����Ϊ��")
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
}
