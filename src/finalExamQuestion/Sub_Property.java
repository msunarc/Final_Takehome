package finalExamQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sub_Property {

	 public static String DoesFileExist(String a)throws IOException {
		 String path ="data\\final.prop";
		 try {	
				
				Properties f =new Properties();
				
				FileInputStream bd=new FileInputStream(path);
				
			     f.load(bd);

			return f.getProperty(a);

			}
			catch(FileNotFoundException e) {
				System.out.println("File not Found");
			return null;
	 }
	 }
}
