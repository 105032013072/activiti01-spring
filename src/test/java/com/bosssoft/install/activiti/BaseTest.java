package com.bosssoft.install.activiti;

import java.util.List;

import org.activiti.engine.BpmnxTool;
import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.bpmn.helper.TaskFlowUtils;
import org.activiti.engine.impl.pvm.delegate.ActivityBehavior;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.repository.Category;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.spi.identity.IdentityEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTest {

	
	@Autowired
	public BpmnxTool bpmnxTool;
	
	@Autowired
	public TaskService taskService;
	
	@Autowired
	public RuntimeService runtimeService;
	
	@Autowired
	public IdentityService identityService;
	
	@Autowired
	public RepositoryService repositoryService;
	
	@Autowired
	public FormService formService;
	
	@Test
	public void getActivity(){
		ProcessInstance inst=	runtimeService
				.createProcessInstanceBuilder()
				.processDefinitionKey("Process_1")
				//.processDefinitionKey("finance12")
				//.processDefinitionId("Process_self:1:22535")
				.businessKey("business_03")
				
				//.setVariables(var)
				.processInstanceName("business_03").start();
	}
	
	@Test
	public void deleteDeployment() {
		taskService.complete("15007");
	}
}
