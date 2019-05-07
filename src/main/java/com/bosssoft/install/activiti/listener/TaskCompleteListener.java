package com.bosssoft.install.activiti.listener;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.bosssoft.install.activiti.Mybean;

public class TaskCompleteListener implements ActivitiEventListener{

	@Autowired
	private Mybean mybean;
	
	public void onEvent(ActivitiEvent event) {
		System.out.println("event");
		System.out.println(">>>>>>>>>>>>"+mybean.print("TaskCompleteListener"));
	}

	public boolean isFailOnException() {
		return false;
	}

}
