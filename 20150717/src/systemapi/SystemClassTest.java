package systemapi;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemClassTest {
	
	public static void main(String[] args) {
		
//		System.out;	// 표준 출력 스트림
//		System.in;	// 표준 입력 스트림
//		System.err;	// 표준 에러 (출력) 스트림
		
		// currentTimeMillis()
		/*
		long start = System.currentTimeMillis();	// 현재 시간을 EPOCH 시간
		// 코드 실행
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "밀리초 걸렸음");
		*/
		
		// JVM에게 가비지 컬렉터 실행하도록 요청
//		System.gc();
		
		// 시스템 환경변수 조회
		// System.getenv()
		/*
		Map envs = System.getenv();
		Set keys = envs.keySet();
		for (Object key : keys) {
			System.out.println(key + " = " + envs.get(key));
		}
		*/

		// System.getProperties()
		Properties props = System.getProperties();
		Set propKeys = props.keySet();
		for (Object key : propKeys) {
			if (key.toString().startsWith("os."))
				System.out.println(key + " = " + props.get(key));
		}
		
		// 현재 시스템(OS)이 사용하고 있는
		// 라인 구분자를 리턴
		// Windows: \r\n
		// Linux/Unix: \n
		// Mac: \n (최신 MacOS), \r (과거 몇몇 MacOS)
//		System.lineSeparator();
		
	}
	
}


















