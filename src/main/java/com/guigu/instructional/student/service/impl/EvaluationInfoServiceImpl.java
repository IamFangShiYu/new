package com.guigu.instructional.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.EvaluationInfo;
import com.guigu.instructional.po.EvaluationInfoExample;
import com.guigu.instructional.po.EvaluationInfoExample.Criteria;
import com.guigu.instructional.student.mapper.EvaluationInfoMapper;
import com.guigu.instructional.student.service.EvaluationInfoService;

@Service("evaluationInfoServiceImpl")
public class EvaluationInfoServiceImpl implements EvaluationInfoService {

	@Resource(name = "evaluationInfoMapper")
	private EvaluationInfoMapper evaluationInfoMapper;
	
	@Override
	public boolean addEvaluation(EvaluationInfo evaluationInfo) {
		
		try {
			int i =evaluationInfoMapper.insertSelective(evaluationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean updateEvaluation(EvaluationInfo evaluationInfo) {
		
		try {
			int i = evaluationInfoMapper.updateByPrimaryKeySelective(evaluationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}

	@Override
	public List<EvaluationInfo> getEvaluationInfoList(EvaluationInfo evaluationInfo) {
		
		EvaluationInfoExample evaluationInfoExample = new EvaluationInfoExample();
		Criteria criteria = evaluationInfoExample.createCriteria();
		
		if(evaluationInfo!=null) {
			//id
			if(evaluationInfo.getEvaluationId()!=null) {
				criteria.andStudentIdEqualTo(evaluationInfo.getStudentId());
			}
			
			//name
			if(evaluationInfo.getEvaluationTile()!=null) {
				evaluationInfo.setEvaluationTile("%"+evaluationInfo.getEvaluationTile()+"%");
				criteria.andEvaluationTileLike(evaluationInfo.getEvaluationTile());
			}
			
		}
		/*
		 * 查询所有正常的学员的数据
		 * 1：正常 
		 * 0：删除
		 */
		criteria.andEvaluationStateEqualTo(1);
		
		return evaluationInfoMapper.selectByExample(evaluationInfoExample);
	}

	@Override
	public EvaluationInfo getEvaluationInfo(Integer evaluationId) {
		
		return evaluationInfoMapper.selectByPrimaryKey(evaluationId);
	}

}
