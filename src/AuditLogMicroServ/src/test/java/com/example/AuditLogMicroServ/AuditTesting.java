package com.example.AuditLogMicroServ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.example.model.Audit;

public class AuditTesting {

	RestTemplate rest1=new RestTemplate();
	
	@Test
	public void test1()
	{
		String str1="abhis";
		String url = "http://localhost:8080/deleteByName/"+str1;
		
		final Long lon1=rest1.getForObject(url, Long.class);
		Long lon2=new Long(0);
		assertEquals(lon1, lon2);
		
	}
	
	
	
	@Test
	public void test2()
	{
		String str2="Nothing";
		String url="http://localhost:8080/updateByeventType/"+str2;
		Audit aud4=rest1.getForObject(url, Audit.class);
		String str4="Nothing";
		assertEquals(str4, aud4.getEventType());
		
		
		
	}
	
	
	
	@Test
	public void test3()
	{
		String url="http://localhost:8080/viewAll";
		List<Audit>  aud=rest1.getForObject(url, List.class);
		assertFalse(aud.isEmpty());
		
	}
	
	
	@Test
	public void test4()
	{
		String str="abhi";
		String url="http://localhost:8080/viewByName/"+str;
		Audit aud=rest1.getForObject(url, Audit.class);
		assertEquals(str, aud.getEventName());
	}

	
}

