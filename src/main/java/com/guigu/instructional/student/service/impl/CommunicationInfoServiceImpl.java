package com.guigu.instructional.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.CommunicationInfo;
import com.guigu.instructional.po.CommunicationInfoExample;
import com.guigu.instructional.po.CommunicationInfoExample.Criteria;
import com.guigu.instructional.student.mapper.CommunicationInfoMapper;
import com.guigu.instructional.student.service.CommunicationInfoService;

@Service("communicationInfoServiceImpl")
public class CommunicationInfoServiceImpl implements CommunicationInfoService {

	@Resource(name = "communicationInfoMapper")
	private CommunicationInfoMapper communicationInfoMapper;


	@Override
	public boolean addCommunication(CommunicationInfo communicationInfo) {
		
		try {
			int i =communicationInfoMapper.insertSelective(communicationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean updateCommunication(CommunicationInfo communicationInfo) {

		try {
			int i = communicationInfoMapper.updateByPrimaryKeySelective(communicationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;

	}

	@Override
	public List<CommunicationInfo> getCommunicationInfoList(CommunicationInfo communicationInfo) {
	
		CommunicationInfoExample communicationInfoExample = new CommunicationInfoExample();
		Criteria criteria = communicationInfoExample.createCriteria();
			
			if(communicationInfo!=null) {
				//id
				if(communicationInfo.getCommunicationId()!=null) {
					criteria.andStudentIdEqualTo(communicationInfo.getCommunicationId());
				}
				
				//name
				if(communicationInfo.getCommunicationContent()!=null) {
					communicationInfo.setCommunicationContent("%"+communicationInfo.getCommunicationContent()+"%");
					criteria.andCommunicationContentLike(communicationInfo.getCommunicationContent());
				}
			}
			/*
			 * ��ѯ����������ѧԱ������
			 * 1������ 
			 * 0��ɾ��
			 */
//			criteria.andStudentStateEqualTo(1);
			
			return communicationInfoMapper.selectByExample(communicationInfoExample);
			
	}

	@Override
	public CommunicationInfo getCommunicationInfo(Integer communicationId) {
		
		return communicationInfoMapper.selectByPrimaryKey(communicationId);

	}

}
