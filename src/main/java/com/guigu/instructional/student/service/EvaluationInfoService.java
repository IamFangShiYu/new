package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.EvaluationInfo;

public interface EvaluationInfoService {

	/**
	 * addStudent:���ѧԱ������Ϣ
	 * @param evaluationInfo
	 * @return
	 */
	public boolean addEvaluation(EvaluationInfo evaluationInfo);
	
	/**
	 * updateStudent:����ѧԱ��������
	 * @param evaluationInfo
	 * @return
	 */
	public boolean updateEvaluation(EvaluationInfo evaluationInfo);
	
	/**
	 * getStudentInfoList:����������ѯѧԱ������Ϣ
	 * @param evaluationInfo
	 * @return
	 */
	public List<EvaluationInfo> getEvaluationInfoList(EvaluationInfo evaluationInfo);
	
	/**
	 * getStudentInfo:����Ա����Ų�ѯѧԱ������Ϣ
	 * @param evaluationId
	 * @return
	 */
	public EvaluationInfo getEvaluationInfo(Integer evaluationId);
}
