package com.example.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Audit;

@FeignClient("Zuul")
public interface RemoteCallService {

	@RequestMapping(method=RequestMethod.GET, value="/AuditLogMicroServ/addAudit")
	public ResponseEntity<?> getAddedAudit(Audit audObj);
	
	
}
