package chapter20.reservation.model;

import lombok.Getter;
import lombok.Setter;

/*
 *  User 클래스 
 *  - 사용자 정보를 담는 클래스
 *  - 속성: 사용자 아이디, 비밀번호, 이름, 이메일
 */

@Getter
@Setter
public class User {
	private String userId;
	private String password;
	private String name;
	private String email;
	
	public User (String userId, String password, String name, String email) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}
}
