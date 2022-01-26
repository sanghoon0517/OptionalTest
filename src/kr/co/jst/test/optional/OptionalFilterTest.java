package kr.co.jst.test.optional;

import java.util.Optional;

/**
 * @author 전상훈
 * 
 * 옵셔널의 필터를 이용해보자
 *
 */
public class OptionalFilterTest {
	public static void main(String[] args) {
		String test = String.valueOf("Kakao");
//		String test = String.valueOf("Naver");
		
		//옵셔널의 필터 : of()의 값을 확인하고 true이면 그 값을 출력하고, false이면 empty를 출력한다.
		Optional<String> s1 = Optional.of(test).filter(s -> {
			if(s.equals("Kakao")) {
				System.out.println("카카오 입사를 축하드립니다.");
				return true;
			} else {
				System.out.println("네이버 입사를 축하드립니다.");
				return false;
			}
		});
		
		System.out.println("카카오인가 : "+s1.get());
		System.out.println("==========================================================================");
		
		String pass = Optional.of(test).filter(s -> {
			if(s.equals("Google")) {
				System.out.println("구글 입사를 축하드립니다.");
				return true;
			} else {
				System.out.println("구글 외입니다.");
				return false;
			}
		}).orElseGet(() -> {
			System.out.println("구글 외에 입사하셔서 나오는 메시지입니다.");
			return "except Google";
		});
		
		System.out.println("입사에 축하드립니다.");
		System.out.println("구글입니까? : "+pass);
		
		System.out.println("==========================================================================");
		
		int valueRange = 10;
		int success = 3;
		int fail = 12;
		
		boolean valid1 = Optional.of(success).filter(i -> i < valueRange).isPresent();
		boolean valid2 = Optional.of(fail).filter(i -> i < valueRange).isPresent();
		
		System.out.println("정상인가 : "+valid1);
		System.out.println("정상인가 : "+valid2);
	}
}
