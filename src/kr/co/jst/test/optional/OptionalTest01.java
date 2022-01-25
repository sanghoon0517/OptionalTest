package kr.co.jst.test.optional;

import java.util.Optional;

/**
 * @author 전상훈
 * 
 * Optional에 대해 알아보자
 *
 */
public class OptionalTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본적인 Optional
		Optional<String> test = Optional.of("test");
		String str = test.get();
		System.out.println("옵셔널 값 : "+str);
		
		//String에 옵셔널 바로 받기
		String str2 = Optional.of("test").get();
		System.out.println("옵셔널 값 : "+str2);
		
		//비어있는값 null처리 x get()하면 에러남
		Optional<Object> empty = Optional.empty();
		System.out.println("옵셔널 값 : "+ empty); //null값
		
		//ofNulluble()메소드 이용하기
		Optional<String> korea = Optional.ofNullable("korea");
		String str3 = korea.get();
		System.out.println("옵셔널 값 : "+korea.get());
		System.out.println("옵셔널 값 : "+str3);
		
		//ofNulluble()메소드 이용해서 바로 String에 담기
		String test2 = Optional.ofNullable("test3").get();
		System.out.println("옵셔널 값 : "+test2);
		
		//ofNulluble()메소드 이용해서 null담기 (of()메소드를 썼다면 에러가 남)
		Optional<String> test3 = Optional.ofNullable(null);
		System.out.println("옵셔널 값 : "+test3);
				

	}

}
