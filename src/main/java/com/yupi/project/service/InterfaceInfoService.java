package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.zheapicommon.model.entity.InterfaceInfo;

/**
* @author 13425
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-24 16:42:37
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param InterfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
