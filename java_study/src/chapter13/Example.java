package chapter13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor


@Data
// @ToString
// @Getter
// @Setter
// >> @Data 어노테이션은 모든 맴버 필드에 대한 게터, 세터, toString , equals 메서드를 생성
public class Example {
	private String name;
	private int age;
	
//	public Example() {}
	// public Example(모든 맴버필드에 대한 매개변수) {모든 필드의 초기화}
}


// Example exam1 = new Example();
// Example exam2 = new Example("박영준", 26);