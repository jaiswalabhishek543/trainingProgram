package com.example.AuditLogMicroServ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.example.exception.AuditLogException;
import com.example.model.Audit;
import com.example.repo.AuditInterfaceRepo;
import com.example.service.AuditServiceImpl;

/**
 * @author trainee
 *
 */
/**
 * @author trainee
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class AuditTesting {

	RestTemplate rest1 = new RestTemplate();

	@Mock
	AuditInterfaceRepo auditInterfaceRepo;

	@InjectMocks
	AuditServiceImpl auditServiceImpl;

	/*
	 * @Test public void test1() { final String str1="abhis"; String url =
	 * "http://localhost:8888/deleteByName/"+str1;
	 * 
	 * final Long lon1=rest1.getForObject(url, Long.class); final Long lon2=new
	 * Long(0); assertEquals("Test",lon1, lon2);
	 * 
	 * }
	 */

	@Test
	public void test2() {
		final String str2 = "Nothing";
		final String url = "http://localhost:8888/updateByeventType/" + str2;
		final Audit aud4 = rest1.getForObject(url, Audit.class);
		final String str4 = "Nothing";
		assertEquals("Test", str4, aud4.getEventType());

	}

	@Test
	public void test3() {
		final String url = "http://localhost:8888/viewAll";
		final List<Audit> aud = rest1.getForObject(url, List.class);
		assertFalse(aud.isEmpty());

	}

	@Test
	public void test4() {
		final String str = "abhi";
		final String url = "http://localhost:8888/viewByName/" + str;
		final Audit aud = rest1.getForObject(url, Audit.class);
		assertEquals("Test", str, aud.getEventName());
	}

	@Test
	public void test5() throws AuditLogException {
		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType("Deposit");
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		when(auditInterfaceRepo.save(Mockito.any(Audit.class))).thenReturn(aud);
		auditServiceImpl.addAudit(aud);
		assertEquals("Customer", aud.getEventName());

	}

	@Test(expected = AuditLogException.class)
	public void test6() throws AuditLogException {
		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType(null);
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		auditServiceImpl.addAudit(aud);

	}

	@Test(expected = AuditLogException.class)
	public void test9() throws AuditLogException {
		final Audit aud = new Audit();
		aud.setEventName(null);
		aud.setEventType("Deposit");
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		auditServiceImpl.addAudit(aud);

	}

	@Test
	public void test7() throws AuditLogException {
		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType(null);
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		List<Audit> auditList = new ArrayList<>();
		auditList.add(aud);
		when(auditInterfaceRepo.findAll()).thenReturn(auditList);
		List<Audit> list = auditServiceImpl.viewAll();
		assertTrue(!list.isEmpty());

	}

	@Test(expected = AuditLogException.class)
	public void test8() throws AuditLogException {
		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType(null);
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		List<Audit> auditList = new ArrayList<>();
		auditList.add(aud);
		when(auditServiceImpl.viewAll()).thenReturn(auditList);
		List<Audit> list = auditServiceImpl.viewAll();
		assertTrue(!auditList.isEmpty());

	}

	@Test
	public void test10() throws AuditLogException {
		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType("Deposit");
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		when(auditInterfaceRepo.findByeventName(Mockito.any())).thenReturn(aud);
		Audit newAud = auditServiceImpl.findByName1("Customer");
		assertEquals(newAud.getEventDate(), aud.getEventDate());

	}

	@Test(expected = AuditLogException.class)
	public void test11() throws AuditLogException {
		when(auditInterfaceRepo.findByeventName(Mockito.any())).thenReturn(null);
		auditServiceImpl.findByName1("hello");

	}

	@Test
	public void test12() throws AuditLogException {

		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType("Deposit");
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		when(auditInterfaceRepo.findByeventName("Customer")).thenReturn(aud);
		Long num = auditServiceImpl.deleteByName1("Customer");
		assertEquals(num, new Long(0));
	}

	@Test(expected = AuditLogException.class)
	public void test13() throws AuditLogException {

		when(auditInterfaceRepo.findByeventName(Mockito.any())).thenReturn(null);
		auditServiceImpl.deleteByName1("Customer");

	}

	@Test
	public void test14() throws AuditLogException {

		final Audit aud = new Audit();
		aud.setEventName("Customer");
		aud.setEventType("Deposit");
		aud.setUserId("123");
		aud.setNewValue(null);
		aud.setOldValue(null);

		when(auditInterfaceRepo.findByeventType(Mockito.any())).thenReturn(aud);
		Audit audit = auditServiceImpl.updateByeventType1("Deposit");
		assertEquals("Nothing", audit.getEventType());

	}

	@Test(expected = AuditLogException.class)
	public void test15() throws AuditLogException {

		when(auditInterfaceRepo.findByeventType(Mockito.any())).thenReturn(null);
		auditServiceImpl.updateByeventType1("Deposit");

	}

}
