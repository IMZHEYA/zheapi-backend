package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.zheapicommon.model.entity.UserInterfaceInfo;

/**
* @author 13425
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-03-29 16:20:01
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
    /**
     * 调用接口统计
     */
    boolean invokeCount(long interfaceInfoId,long userId);
}
