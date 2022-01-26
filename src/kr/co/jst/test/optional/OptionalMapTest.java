package kr.co.jst.test.optional;

import java.util.Optional;

/**
 * @author 전상훈
 * 
 * 옵셔널의 맵을 활용해보자
 *
 */
public class OptionalMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "   test   ";
		System.out.println("문자열 길이 : "+original.length());
		
		String s1 = Optional.ofNullable(original)
							.map(i -> i.trim())
							.orElseGet(() ->{ return "There is no Text.";});
		
		System.out.println("문자열 길이 : "+s1.length());
		
		System.out.println("==========================================================");
		
		String original2 = "   Kakao   ";
		System.out.println("문자열 길이 : "+original.length());
		
		boolean valchk2 = Optional.ofNullable(original2)
				.map(String::trim)
				.filter(s -> s.equals("Kakao"))
				.isPresent();
		
		System.out.println("valchk2 결과값 : "+valchk2);
		
		System.out.println("==========================================================");
		
		int valNum = 3;
		
		int num = Optional.ofNullable(valNum)
						.map(i -> i+1)
						.orElseGet(() -> {return 0;});
		System.out.println("계산된 값 : "+num);
		
		System.out.println("==========================================================");
		
		int inputNum = 15;
		
		Optional<Boolean> valChk = Optional.ofNullable(inputNum)
											.map(i -> {
												if(i<10) {
													return true;
												} else {
													return false;
												}
											});
		System.out.println("검증된 값 : "+valChk.get());
		
		System.out.println("==========================================================");
		
		//ifPresent()를 사용해보자
		String rcvData = "data";
//		String rcvData = null;
		
		Optional.ofNullable(rcvData)
				.ifPresent(s -> System.out.println("값을 받았습니다."));
		
		System.out.println("==========================================================");
		
		//ifPresent()를 사용해보자
//		String rcvData2 = "data";
		String rcvData2 = null;
		
		Optional.ofNullable(rcvData2)
		.ifPresentOrElse(s -> System.out.println("값을 받았습니다.")
				, () -> System.out.println("받은 데이터가 null값입니다."));
		
		System.out.println("==========================================================");
		
		

	}

}
