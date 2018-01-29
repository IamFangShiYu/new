package com.guigu.instructional.payment.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.payment.service.StudentPaymentService;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentPayment;
import com.guigu.instructional.po.StudentPaymentCustom;

@Controller
@RequestMapping("/payment/studentpayment/")
public class StudentPaymentController {
	
	
	@Resource(name="StudentPaymentServiceImpl")
	private StudentPaymentService studentPaymentService;
	
	   @RequestMapping("add.action")
	    public String addStudentPayment(StudentPayment studentPayment,Model model) throws Exception {
	       
	       boolean result= studentPaymentService.addStudentPayment(studentPayment);
	       if(result) {
	           model.addAttribute("info","-AddSuccess");
	       }else {
	           model.addAttribute("info","-AddFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("delete.action")
	    public String deleteStudentPayment(Integer paymentId,Model model) throws Exception {
	       
	       boolean result= studentPaymentService.deleteStudentPayment(paymentId);
	       if(result) {
	           model.addAttribute("info","-DeleteSuccess");
	       }else {
	           model.addAttribute("info","-DeleteFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("update.action")
	    public String updateStudentPayment(StudentPayment studentPayment,Model model) throws Exception {
	       
	       boolean result= studentPaymentService.updateStudentPayment(studentPayment);
	       if(result) {
	           model.addAttribute("info","-UpdateSuccess");
	       }else {
	           model.addAttribute("info","-UpdateFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("load.action")
	    public String loadUpate(Integer paymentId,Model model) {
	       StudentPayment studentPayment = studentPaymentService.getStudentPayment(paymentId);
	        model.addAttribute("studentPayment", studentPayment);
	        return "payment/studentpayment/studentpayment_update";
	    }
	   
	   @RequestMapping("list.action")
	    public String list(StudentPaymentCustom studentPaymentCustom,Model model) throws Exception {
	        List<StudentPaymentCustom> list =studentPaymentService.findStudentPaymentList(studentPaymentCustom);
	        model.addAttribute("list", list);
	        
	        return "payment/studentpayment/studentpayment_list";
	    }

}
