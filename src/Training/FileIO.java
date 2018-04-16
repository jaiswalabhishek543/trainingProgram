package Training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileIO {
	
	
	public static void main(String[] args) throws IOException
	{
		
		File file = new File("./abc.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            int content;
            while ((content = fis.read()) != -1) 
            {
                // converting to char and display it
                System.out.print((char) content); 
            }
            System.out.println("");
            
            
            
            //Changing the content of the file 
            FileOutputStream file1 = new FileOutputStream(file);  
            FilterOutputStream filter = new FilterOutputStream(file1);  
            String s="Welcome to java.";      
            byte b[]=s.getBytes();      
            filter.write(b);     
            filter.flush();  
            filter.close();  
            file1.close();  
            System.out.println("Done");  
            
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
		
		
		
		
	}

}
