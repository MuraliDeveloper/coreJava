package filesExs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteReadAndWrite {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//specify file info
		File fileIn = new File("C:\\Project\\input.txt");
		File fileOut = new File("C:\\Project\\output.txt");
		//read  file
		FileInputStream fis=
				new FileInputStream(fileIn);
		FileOutputStream fos=
				new FileOutputStream(fileOut);
		try{
		int read;
		while((read = fis.read())!=-1){
			fos.write(read);
		}
		}catch(Exception ex){
			
			
		}finally{
			fis.close();
			fos.close();
		}
		
		
	}

}
