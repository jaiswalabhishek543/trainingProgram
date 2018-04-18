package training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

//Class
public class FileIO {
	
	
	@SuppressWarnings("PMD.AssignmentInOperand")
	public static void main(final String[] args) throws IOException
	{
		final Logger printf=Logger.getLogger(FileIO.class.getName());
		final File file = new File("./abc.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            int content;
            while ((content = fis.read()) != -1) 
            {
                // converting to char and display it
                printf.info((char) content); 
            }
            printf.info("");
            
            
            
            //Changing the content of the file 
            final FileOutputStream file1 = new FileOutputStream(file);  
            final FilterOutputStream filter = new FilterOutputStream(file1);  
            final String str1="Welcome to java.";      
            final byte by1[]=str1.getBytes();      
            filter.write(by1);     
            filter.flush();  
            filter.close();  
            file1.close();  
            printf.info("Done");  
            
            
            
            
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
