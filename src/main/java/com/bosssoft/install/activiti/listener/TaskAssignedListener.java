package com.bosssoft.install.activiti.listener;

import org.activiti.engine.delegate.event.ActivitiEntityEvent;
import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;

import com.bosssoft.install.activiti.Mybean;

public class TaskAssignedListener implements ActivitiEventListener{

	@Autowired
	private Mybean mybean;
	
	public void onEvent(ActivitiEvent event) {
		System.out.println("任务分配事件");
		System.out.println(mybean);
		/*ActivitiEntityEvent entityEvent=(ActivitiEntityEvent)event;
		Object entity=entityEvent.getEntity();
		if(entity instanceof TaskEntity){
			TaskEntity task=(TaskEntity)entity;
			System.out.println(">>>> 办理人："+task.getAssignee());
		    
		}*/
	}

	public boolean isFailOnException() {
		
		return false;
	}

}
