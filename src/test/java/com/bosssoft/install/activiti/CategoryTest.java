package com.bosssoft.install.activiti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.impl.context.Context;
import org.activiti.engine.repository.Category;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

public class CategoryTest extends BaseTest{
	
	@Test
	public void addCategory(){

		repositoryService.saveCategory(null, "ddd", null);
		
		
		repositoryService.deleteCategory("4750001");
	}

	@Test
	public void categoryTest() {

		// ---search
		
		List<Category> list=new ArrayList<Category>();
		// 查询列表
		System.out.println("-------类别列表-------");
		 list = repositoryService.createCategoryQuery().listPage(0, 3);
		for (Category category : list) {
			System.out.println(
					category.getId() + "  " + category.getCategoryName() + " " + category.getParentCategoryId());
		}

		// 根据ID查询
		System.out.println("-------根据ID查询-------");
		Category category = repositoryService.createCategoryQuery().categoryId("4755001").singleResult();
		System.out.println(category.getId() + "  " + category.getCategoryName() + " " + category.getParentCategoryId());
		
		//根据名称模糊查询
		System.out.println("-------名称模糊-------");
		list= repositoryService.createCategoryQuery().categoryNameLike("类别").list();
		for (Category ca : list) {
			System.out.println(
					ca.getId() + "  " + ca.getCategoryName() + " " + ca.getParentCategoryId());
		}
		
		System.out.println("-------名称精确-------");
		list= repositoryService.createCategoryQuery().categoryName("人资").list();
		for (Category ca : list) {
			System.out.println(
					ca.getId() + "  " + ca.getCategoryName() + " " + ca.getParentCategoryId());
		}
		
		System.out.println("-------父级类别-------");
		list= repositoryService.createCategoryQuery().parentCategoryId("4750001").listPage(1, 1);
		for (Category ca : list) {
			System.out.println(
					ca.getId() + "  " + ca.getCategoryName() + " " + ca.getParentCategoryId());
		}
		
		System.out.println(repositoryService.createCategoryQuery().count());
	}

	
	@Test
 	public void startProcess() throws InterruptedException {

		
 		/*identityService.setAuthenticatedUserId("u03");
 	
 		ProcessInstance in=runtimeService.startProcessInstanceByKey("finance", "business_01");
 		
 		runtimeService.setProcessInstanceName(in.getProcessInstanceId(), "报销审批_mike_02");*/
		
		
		/*identityService.setAuthenticatedUserId("u03");
		
		ProcessInstanceBuilder  processInstanceBuilder=runtimeService.createProcessInstanceBuilder().processDefinitionKey("finance").businessKey("business_01").processInstanceName("报销审批_mike_02");
		processInstanceBuilder.start();
		
		Thread.sleep(600000000);*/
		Map<String,Object> processVar=new HashMap<String, Object>();
		processVar.put("key1", "key1");
		processVar.put("key2", false);
		
		
	          
	ProcessInstance inst=	runtimeService
				.createProcessInstanceBuilder()
				//.processDefinitionKey("Process_1")
				//.processDefinitionKey("myProcess")
				.processDefinitionId("Process_1:1:547505")
				.businessKey("key1")
				.processStarter("u01")
				.addVariable("condition", processVar)
				.processInstanceName("测试流程-2018-12-13")
				.start(); 
	
		  System.out.println(inst.getId());  
		  
		  //test
		  
		  
		  
		
 		
 	}
	
	@Test
	public void one(){
	   taskService.complete("617509");	
	}
	
}
