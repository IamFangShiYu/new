package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.po.StudentWriteGrade;
import com.guigu.instructional.po.StudentWriteGradeCustom;

public interface StudentWriteGradeCustomService {


	public boolean addStudentWriteGradeCustom(StudentWriteGrade studentWriteGrade);
	

	public boolean updateStudentWriteGradeCustom(StudentWriteGrade studentWriteGrade);
	
	public StudentWriteGradeCustom getStudentWriteGradeCustomList(Integer writeGradeId);

	public List<StudentWriteGradeCustom> getStudentWriteGradeCustomList(StudentInfo studentInfo);
	

	public StudentWriteGrade getStudentWriteGradeCustom(Integer writeGradeId);
	
	public boolean deleteStudentWriteGradeCustom(Integer writeGradeId);
	   
}
