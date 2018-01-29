package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.CommunicationInfo;


public interface CommunicationInfoService {

	/**
	 * addStudent:���ѧԱ��Ϣ
	 * @param communicationInfo
	 * @return
	 */
	public boolean addCommunication(CommunicationInfo communicationInfo);
	
	/**
	 * updateStudent:����ѧԱ����
	 * @param communicationInfo
	 * @return
	 */
	public boolean updateCommunication(CommunicationInfo communicationInfo);
	
	/**
	 * getStudentInfoList:����������ѯѧԱ��Ϣ
	 * @param communicationInfo
	 * @return
	 */
	public List<CommunicationInfo> getCommunicationInfoList(CommunicationInfo communicationInfo);
	
	/**
	 * getStudentInfo:����Ա����Ų�ѯѧԱ��Ϣ
	 * @param communicationId
	 * @return
	 */
	public CommunicationInfo getCommunicationInfo(Integer communicationId);
}
