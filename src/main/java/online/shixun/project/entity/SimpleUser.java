package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SimpleUser {

	@NotBlank()
	@Size(min = 2, max = 8)
	private String name;	
	@NotBlank()
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
