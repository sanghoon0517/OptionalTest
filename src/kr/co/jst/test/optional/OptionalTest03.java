package kr.co.jst.test.optional;

import java.util.Optional;


public class OptionalTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//orElse()메소드 사용하기 : 없으면 다른값을 넣는다는 의미
		String s = Optional.ofNullable("Kakao").orElse("Naver");
		System.out.println("값 : "+s);

		//orElse()메소드 사용하기 : 없으면 다른값을 넣는다는 의미 -> 메모리를 무조건 소모한다는 단점이 있다.
		Object s2 = Optional.ofNullable(null).orElse("Naver");
		System.out.println("값 : "+s2);
		
		//orElseGet()메소드 사용하기 : 없으면 다른값을 넣는다는 의미 -> 값이 없으면 메모리를 소비하지 않음
		String s3 = Optional.ofNullable("Kakao").orElseGet(() -> "Naver");
		System.out.println("값 : "+s3);
		
		//orElseGet()메소드 사용하기 : 없으면 다른값을 넣는다는 의미 -> 값이 없으면 메모리를 소비하지 않음
		Object s4 = Optional.ofNullable(null).orElseGet(() -> "Naver");
		System.out.println("값 : "+s4);
		
		System.out.println("showMsg()메소드를 이용하여 orElse와 orElseGet의 차이를 보겠습니다.");
		System.out.println("================================================");
		new OptionalTest03().doElseMethod();
		
	}
	
	public String showMsg() {
		System.out.println("카카오에 가자");
		return "카카오 합격";
	}
	
	public void doElseMethod() {
		
		Object o = Optional.ofNullable(null).orElseGet(() -> showMsg());
		System.out.println("doElseMethod o : "+o);
		
		Object o1 = Optional.ofNullable(null).orElse(showMsg());
		System.out.println("doElseMethod o1 : "+o1);
		
		System.out.println("================================================");
		
		System.out.println("orElse");
		String pass2 = Optional.ofNullable("합격").orElse(showMsg()); //showMsg가 무조건 실행됌
		
		System.out.println("orElseGet");
		String pass = Optional.ofNullable("합격").orElseGet(this::showMsg); //showMsg가 실행되지 않았음
		
		System.out.println("doElseMethod pass : "+pass);
		System.out.println("doElseMethod pass2 : "+pass2);
	}

}
