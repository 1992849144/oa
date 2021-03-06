package org.java.web;

import org.java.dao.PlaceMapper;
import org.java.entity.Meetingformat;
import org.java.entity.Place;
import org.java.entity.SysUser;
import org.java.entity.Util;
import org.java.service.MeetingformatService;
import org.java.service.PlaceService;
import org.java.service.SysUserService;
import org.java.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 显示在日程修改那里的下拉框，公共的类
 */
@Controller
public class PublicController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private PlaceService placeService;

    @Autowired
    private MeetingformatService meetingformatService;


    /**
     * 获得所有地点，会议类型
     * 根据用户id获得用户昵称
     * @param id
     * @return
     */
    @PostMapping("show")
    @ResponseBody
    public Map commune(Integer id){
        Map map=new HashMap();
        SysUser user = sysUserService.getSysUserById(id);//获得用户详情
        String nickname=user.getNickname();
        List<Place> place = placeService.getAllPlace();//显示所有地点
        List<Meetingformat> meetingformat = meetingformatService.getAllMeetingformat();//显示所有会议类型

        map.put("nickname",nickname);
        map.put("place",place);
        map.put("meetingformat",meetingformat);

        return map;
    }

    /**
     * 获得所有地点，会议类型
     * @return
     */
    @PostMapping("init")
    @ResponseBody
    public Map show(){
        Map map=new HashMap();
        List<Place> place = placeService.getAllPlace();//显示所有地点
        List<Meetingformat> meetingformat = meetingformatService.getAllMeetingformat();//显示所有会议类型
        map.put("place",place);
        map.put("meetingformat",meetingformat);
        return map;
    }

    /**
     * 删除用户
     * @param id
     */
    @PostMapping("deleteUser")
    @ResponseBody
    @Transactional
    public void deleteUser(Integer id){
        sysUserService.deleteUser(id);
    }
}
