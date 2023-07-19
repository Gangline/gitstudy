package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//절대 경로 지정
		File file1 = new File("C:/Users/gram/Desktop/Java/workspace/JavaBasic/src/java13_io/file/", "Hello");
		
		System.out.println( file1.length());
		System.out.println( file1.exists());

		System.out.println("------------------------------");
		
		
		//상대 경로 지정
//		File file2 = new File("src/java13_io/file/", "Hello");	//C:/Users/gram/Desktop/Java/workspace/JavaBasic/ 절대 경로 지정을 지워주면 된다
		File file2 = new File("./src/java13_io/file/", "Hello");	//C:/Users/gram/Desktop/Java/workspace/JavaBasic/ 절대 경로 지정을 지워주면 된다
		
		System.out.println(file2);
		
		System.out.println(file1.length());
		System.out.println(file1.exists());
		
		System.out.println("------------------------------");

		//상대 경로 기준점 == 클래스 패스 == 프로젝트 폴더
		//	C:/Users/gram/Desktop/Java/workspace/JavaBasic/
		
		
//		File file3 = new File("./src/java13_io/file/../../java10_collection/", "user.properties");
//		File file3 = new File("/Users/gram/Desktop/Java/workspace/JavaBasic/src/java13_io/file/", "Hello");
		
//		File file3 = new File("../JavaBasic/src/java13_io/file/", "Hello");
		
		File file3 = new File("../../../Java/workspace/JavaBasic/src/java13_io/file/", "Hello");
		
		System.out.println(file3.exists());
		
		
		
	}
}
