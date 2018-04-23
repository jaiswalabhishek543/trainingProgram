package bankingsystem;

import java.util.Date;
/*
 *@abhi
 * 
 */
public class Statement {
	/*
	 * Creating Statement class 
	 */

	private String content;
	private Date date;

   public Statement(String cont)
   {   date=new Date();
	   content=cont;
	   
   }


	@Override
public String toString() {
	return "Statement [content=" + content + ", date=" + date + "]";
}


	public String getContent() {
		return content;
	}





}
