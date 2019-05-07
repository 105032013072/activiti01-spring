package com.bosssoft.install.activiti;

import org.activiti.bpmn.model.FormDefinition;
import org.junit.Test;

public class FormTest extends BaseTest{

	@Test
	public void getProcessForm(){
		//FormDefinition formDefinition=formService.getProcessFormDefinition("Process_1:1:1092506");
		FormDefinition formDefinition=formService.getRuntimeProcessFormDefinition("1097501");
		System.out.println("------"+formDefinition.getFormPage());
	}
	
	@Test
	public void getTaskForm(){
	//	FormDefinition formDefinition=formService.getTaskFormDefinition("Process_1:1:1092506", "A");
		FormDefinition formDefinition=formService.getRuntimeTaskFormDefinition("1110002");
		System.out.println("------form:"+formDefinition.getFormPage());
	}
	
	
}
