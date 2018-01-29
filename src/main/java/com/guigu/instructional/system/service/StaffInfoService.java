package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StaffTeachers;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.service.StaffInfoService</p>
 * <p>description锟斤拷</p>
 * <p>@author锟斤拷锟斤拷锟斤拷师<p>   
 * <p> date:2018锟斤拷1锟斤拷26锟斤拷锟斤拷锟斤拷8:55:29 </p>
 * <p>comments锟斤拷    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public interface StaffInfoService {
    
    /**
     * addStaff:锟斤拷锟皆憋拷锟斤拷锟较�
     * @author 锟斤拷锟斤拷师
     * @param staffInfo
     * @return  <br/> 
     * @since JDK 1.8
     */
    public boolean addStaff(StaffInfo staffInfo);
    
    /**
     * updateStaff:锟斤拷锟斤拷员锟斤拷锟斤拷锟斤拷
     * @author 锟斤拷锟斤拷师
     * @param staffInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public boolean updateStaff(StaffInfo staffInfo);
    
    /**
     * getStaffInfo:锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷询员锟斤拷锟斤拷息
     * @author 锟斤拷锟斤拷师
     * @param staffInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public List<StaffInfo> getStaffInfoList(StaffInfo staffInfo);
    
    
    /**
     * getStaffInfo:锟斤拷锟斤拷员锟斤拷锟斤拷挪锟窖憋拷锟斤拷锟较�
     * @author 锟斤拷锟斤拷师
     * @param staffId
     * @return  <br/>
     * @since JDK 1.8
     */
    public StaffInfo getStaffInfo(Integer staffId);
    
  

}


