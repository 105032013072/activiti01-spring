package com.bosssoft.install.activiti;

import java.util.ArrayList;
import java.util.List;


import org.activiti.engine.identity.User;
import org.activiti.engine.impl.persistence.entity.UserEntity;

import org.activiti.engine.spi.identity.IdentityEnum;
import org.activiti.engine.spi.identity.OMService;
import org.activiti.engine.spi.identity.Participator;
import org.activiti.engine.spi.identity.ParticipatorDescriptor;
import org.springframework.stereotype.Service;

import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

@Service("oMService")
public class OMServiceImpl implements OMService{

	public List<User> getUserByParticipator(String participatorId, IdentityEnum participatorType) {
		
		List<User> list=new ArrayList<User>();
		
		User u1=new UserEntity();
		u1.setId("u1");
		
		User u2=new UserEntity();
		u2.setId("u2");
		
		User u3=new UserEntity();
		u3.setId("u3");
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

	public String getParticipatorName(String participatorId, IdentityEnum participatorType) {
		
		return participatorId+"_name";
	}

	public Page<Participator> getUsers(Page page, Searcher searcher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Participator> getUsersByParticipator(Page page, String participatorId, IdentityEnum participatorType) {
		
		Participator p1=new Participator("u1", "u1_Name", IdentityEnum.USER, null);
		Participator p2=new Participator("u2", "u2_Name", IdentityEnum.USER, null);
		
		Page<Participator> result=new Page<Participator>();
		result.add(p1);
		result.add(p2);
		
		return result;
	}

	public List<Participator> getParticipatorList(IdentityEnum participatorType) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Participator> getParticipatorByParentId(String participatorId, IdentityEnum participatorType) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public Page<Participator> getParticipatorList(Page<Participator> page, Searcher searcher) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Participator> getRootParticipatorListByType() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Participator> getParticipatorByParentId(String participatorId, String participatorType) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ParticipatorDescriptor> getParticipatorTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Participator> getCandidateTree(String parentId, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getIdentityGroupsOfUser(String userId, IdentityEnum type) {
		// TODO Auto-generated method stub
		return null;
	}

	public Participator getParticipatorInfo(String participatorId, IdentityEnum participatorType) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
