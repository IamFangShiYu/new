package com.guigu.instructional.payment.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.payment.service.StaffSalaryService;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StaffSalary;
import com.guigu.instructional.po.StaffSalaryCustom;
import com.guigu.instructional.po.StudentPayment;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/payment/staffsalary/")
public class StaffSalaryController {

	@Resource(name="StaffSalaryServiceImpl")
	private StaffSalaryService staffSalaryService;
	
	@Resource(name="staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	
	 @RequestMapping("add.action")
	    public String addStaffSalary(StaffSalary staffSalary,Model model) throws Exception {
	       
	       boolean result= staffSalaryService.addStaffSalary(staffSalary);
	       if(result) {
	           model.addAttribute("info","-AddSuccess");
	       }else {
	           model.addAttribute("info","-AddFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("delete.action")
	    public String deleteStaffSalary(Integer staffSalaryId,Model model) throws Exception {
	       
	       boolean result= staffSalaryService.deleteStaffSalary(staffSalaryId);
	       if(result) {
	           model.addAttribute("info","-DeleteSuccess");
	       }else {
	           model.addAttribute("info","-DeleteFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("update.action")
	    public String updateStaffSalary(StaffSalary staffSalary,Model model) throws Exception {
	       
	       boolean result= staffSalaryService.updateStaffSalary(staffSalary);
	       if(result) {
	           model.addAttribute("info","-UpdateSuccess");
	       }else {
	           model.addAttribute("info","-UpdateFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("load.action")
	    public String loadUpate(Integer staffSalaryId,Model model) {
	       StaffSalary staffSalary = staffSalaryService.getStaffSalary(staffSalaryId);
	        model.addAttribute("staffSalary", staffSalary);
	           
	        List<StaffInfo> list3 =staffInfoService.getStaffInfoList(null);
	        model.addAttribute("stafflist", list3);
	        
	        StaffInfo staffInfo=new StaffInfo();
	        staffInfo.setRoleId(2);
	        List<StaffInfo> list2 =staffInfoService.getStaffInfoList(staffInfo);
	        model.addAttribute("stastafflist", list2);
	        
	        return "payment/staffsalary/staffsalary_update";
	    }
	   
	   @RequestMapping("addload.action")
	    public String addloadUpate(Integer staffSalaryId,Model model) {
	       StaffSalary staffSalary = staffSalaryService.getStaffSalary(staffSalaryId);
	        model.addAttribute("staffSalary", staffSalary);
	           
	        List<StaffInfo> list3 =staffInfoService.getStaffInfoList(null);
	        model.addAttribute("stafflist", list3);
	        
	        StaffInfo staffInfo=new StaffInfo();
	        staffInfo.setRoleId(2);
	        List<StaffInfo> list2 =staffInfoService.getStaffInfoList(staffInfo);
	        model.addAttribute("stastafflist", list2);
	        
	        return "payment/staffsalary/staffsalary_add";
	    }
	   
	   
	   @RequestMapping("list.action")
	    public String list(StaffSalaryCustom staffSalaryCustom,Model model) throws Exception {
	        List<StaffSalaryCustom> list =staffSalaryService.findStaffSalaryList(staffSalaryCustom);
	        model.addAttribute("list", list);
	        
	        return "payment/staffsalary/staffsalary_list";
	    }
	
	
}
