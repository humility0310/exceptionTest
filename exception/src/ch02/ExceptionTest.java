package ch02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 1;
		int k = 0;
		try {
			System.out.println("파일엶");
			k = 1000 / a;
			System.out.println("more code...");
		} catch (ArithmeticException ex) {
			// 1.로그남기기(파일)
			
			
			
			// 2.사과(정상종료)
			System.out.println("쏘리염 헤헷");
			
			
			
			//3.셋다 못한다면...
			ex.printStackTrace();
			return;
		} finally {
			System.out.println("자원정리");
		}
		System.out.println("결과는 : " + k);
	}

}
