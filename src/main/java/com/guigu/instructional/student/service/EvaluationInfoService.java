package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.EvaluationInfo;

public interface EvaluationInfoService {

	/**
	 * addStudent:添加学员评价信息
	 * @param evaluationInfo
	 * @return
	 */
	public boolean addEvaluation(EvaluationInfo evaluationInfo);
	
	/**
	 * updateStudent:更新学员评价数据
	 * @param evaluationInfo
	 * @return
	 */
	public boolean updateEvaluation(EvaluationInfo evaluationInfo);
	
	/**
	 * getStudentInfoList:根据条件查询学员评价信息
	 * @param evaluationInfo
	 * @return
	 */
	public List<EvaluationInfo> getEvaluationInfoList(EvaluationInfo evaluationInfo);
	
	/**
	 * getStudentInfo:根据员工编号查询学员评价信息
	 * @param evaluationId
	 * @return
	 */
	public EvaluationInfo getEvaluationInfo(Integer evaluationId);
}
