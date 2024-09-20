package chapter20.Library2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private String name;
	private String userId;
	
	public User(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}
}
