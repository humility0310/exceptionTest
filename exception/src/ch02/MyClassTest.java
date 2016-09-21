package ch02;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();

		try {
			myclass.dangeroisMethod();
		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch(MyException e){
//			e.printStackTrace();
//		}
		catch(IOException | MyException e){
			e.printStackTrace();
		}
	}

}
