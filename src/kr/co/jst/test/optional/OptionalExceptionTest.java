package kr.co.jst.test.optional;

import java.util.Optional;

/**
 * @author 전상훈
 * 
 * 옵셔널의 예외처리를 해보자
 *
 */
public class OptionalExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//옵셔널 예외처리
		try {
			String s = Optional.ofNullable("value").orElseThrow(() -> new Exception());
			System.out.println("값이 존재합니다 : "+s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에외처리 되었습니다.");
		}

		//옵셔널 예외처리
		try {
			Object s = Optional.ofNullable(null).orElseThrow(() -> new Exception());
			System.out.println("값이 존재합니다 : "+s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에외처리 되었습니다.");
		}
		
		//or()메소드 사용하기 : ofNullable()메소드 사용시 null일시 empty()가 되어야하는데 or()를 사용하여 대신처리함
		Optional<Object> o = Optional.ofNullable(null).or(() -> Optional.of("value"));
		System.out.println("o : "+o);
		System.out.println("o : "+o.get());
		 
	}

}
