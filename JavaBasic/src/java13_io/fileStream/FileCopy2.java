package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String[] args) {
		
		//	Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		//	-> 파일 복사
		
		//	49,520,698 bytes
		
		//	Source.txt ---> FileCopy ---> Destination.txt
		
		//-------------------------------------------------------------
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//Source 파일 읽어들임
		File file = new File("./src/java13_io/fileStream", "Source.txt" );
		System.out.println("[TEST] exists : " + file.exists());
		
		//임시 저장 공간
		byte[] buf = new byte[49520698];
		int len = -1;
//		StringBuilder sb = new StringBuilder();
		
		try {
			fis = new FileInputStream(file);
			
			while((len = fis.read(buf)) !=-1) {
//				sb.append(new String(buf,0,len));
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
//		System.out.println();
//		System.out.println("읽어들인 파일");
//		System.out.println(sb);
		
		//출력 대상 파일
		File file2 = new File("./src/java13_io/fileStream", "Destination.txt" );
	
		try {
			fos = new FileOutputStream(file2);
			
			fos.write(buf, 0, buf.length);
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
