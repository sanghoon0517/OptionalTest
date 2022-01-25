package kr.co.jst.test.optional;

import java.util.Optional;

public class OptionalTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반적인 Optional
		String test = Optional.of("test").get();
		System.out.println(test);
		
		//isPresent()메소드 사용하기
		boolean present = Optional.ofNullable("yes").isPresent();
		System.out.println("값이 존재하는지 : "+present);
		
		//isPresent()메소드 사용하기2
		boolean present2 = Optional.ofNullable(null).isPresent();
		System.out.println("값이 존재하는지 : "+present2);
		
		//isEmpty()메소드 사용하기 1.8에는 없음
		boolean empty = Optional.ofNullable("no").isEmpty();
		System.out.println("비어있는가 : "+empty);
		
		//isEmpty()메소드 사용하기 1.8에는 없음
		boolean empty2 = Optional.ofNullable("").isEmpty();
		System.out.println("비어있는가 : "+empty2);
		
		//isEmpty()메소드 사용하기 1.8에는 없음
		boolean empty3 = Optional.ofNullable(null).isEmpty();
		System.out.println("비어있는가 : "+empty3);
		
	}

}
