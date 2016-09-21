package ch02;

import java.io.IOException;

public class MyClass {
	public void dangeroisMethod() throws IOException {
		boolean isDanger = true;

		System.out.println("normal...");
		if (isDanger) {
			// 예외상황이 발생
			// ex) 네트워크 오류, IO오류 등등...
			throw new IOException("예외상황 발생");
		}
	}
}
