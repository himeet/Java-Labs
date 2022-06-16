package com.glj.javalabs.lab003.api;

import com.glj.javalabs.lab003.dto.UserDTO;

/**
 * @InterfaceName UserRpcService
 * @Description
 *
 * User 的 RPC 接口
 *
 * @Author glj
 * @Date 2022/6/16 4:04 下午
 * @Version 1.0
 */
public interface UserRpcService {

    /**
     * 根据指定用户编号，获得用户信息
     *
     * @param id 用户编号
     * @return 用户信息
     */
    UserDTO get(Integer id);

}
