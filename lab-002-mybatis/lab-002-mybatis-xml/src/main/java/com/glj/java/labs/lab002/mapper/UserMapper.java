package com.glj.java.labs.lab002.mapper;

import com.glj.java.labs.lab002.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @InterfaceName UserMapper
 * @Description
 *
 * User 的 Mapper 接口
 *
 * @Author glj
 * @Date 2022/5/22 9:14 下午
 * @Version 1.0
 */
@Repository
public interface UserMapper {

    int insert(UserDO user);

    int updateById(UserDO user);

    int deleteById(@Param("id") Integer id); // 生产请使用标记删除，除非有点想不开，嘿嘿。

    UserDO selectById(@Param("id") Integer id);

    UserDO selectByUsername(@Param("username") String username);

    List<UserDO> selectByIds(@Param("ids") Collection<Integer> ids);

}
