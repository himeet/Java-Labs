package com.glj.javalabs.lab003.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName UserDTO
 * @Description
 *
 * User 的 DTO
 *
 * @Author glj
 * @Date 2022/6/16 4:02 下午
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 昵称
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

}
