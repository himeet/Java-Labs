package com.glj.javalabs.lab003.service;

import com.glj.javalabs.lab003.api.UserRpcService;
import com.glj.javalabs.lab003.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserRpcServiceImpl
 * @Description
 *
 * {@link UserRpcService} 的实现类
 *
 * @Author glj
 * @Date 2022/6/16 4:19 下午
 * @Version 1.0
 */
@Service
public class UserRpcServiceImpl implements UserRpcService {

    @Override
    public UserDTO get(Integer id) {
        return new UserDTO().builder()
                .id(id)
                .name("没有昵称：" + id).
                gender(id % 2 + 1)  // 1 - 男；2 - 女
                .build();
    }

}
