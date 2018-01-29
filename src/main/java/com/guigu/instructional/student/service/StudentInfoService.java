package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.StudentInfo;

public interface StudentInfoService {

	/**
	 * addStudent:���ѧԱ��Ϣ
	 * @param studentInfo
	 * @return
	 */
	public boolean addStudent(StudentInfo studentInfo);
	
	/**
	 * updateStudent:����ѧԱ����
	 * @param studentInfo
	 * @return
	 */
	public boolean updateStudent(StudentInfo studentInfo);
	
	/**
	 * getStudentInfoList:����������ѯѧԱ��Ϣ
	 * @param studentInfo
	 * @return
	 */
	public List<StudentInfo> getStudentInfoList(StudentInfo studentInfo);
	
	/**
	 * getStudentInfo:����Ա����Ų�ѯѧԱ��Ϣ
	 * @param studentId
	 * @return
	 */
	public StudentInfo getStudentInfo(Integer studentId);
}
