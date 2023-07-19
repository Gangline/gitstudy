package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) {
		
		//	Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		//	-> 파일 복사
		
		//	49,520,698 bytes
		
		//	Source.txt ---> FileCopy ---> Destination.txt
		
		//-------------------------------------------------------------
		
		//Source 파일 읽어들임
		File file = new File("./src/java13_io/fileStream", "Source.txt" );
		System.out.println("[TEST] exists : " + file.exists());
		
		File file2 = new File("./src/java13_io/fileStream", "Destination.txt" );
		
		//임시 저장 공간
		byte[] buf = new byte[1024];
		int len = -1;
//		StringBuilder sb = new StringBuilder();
		
		try (	FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(file2)	 ) {
			
			//입력 데이터가 EOF가 될 때까지 반복적으로 입력한다
			while((len = fis.read(buf) ) != -1) {
				
				//입력 받은 데이터를 출력스트림으로 출력한다
				fos.write(buf, 0, len);
				
				//출력 버퍼 비우기
				fos.flush();
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		
	}
}
