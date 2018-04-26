package model;

import java.util.Date;
/*
 *@abhi 
 */
public class Statement {
	/*
	 * Creating Statement class 
	 */

	private String content;
	private Date date;
	
	public Statement(String content) {
		this.content = content;
		this.date =new Date();
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
