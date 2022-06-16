package com.glj.java.labs.lab002.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.glj.java.labs.lab002.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
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
public interface UserMapper extends BaseMapper<UserDO> {

    default UserDO selectByUsername(@Param("username") String username) {
        return selectOne(new QueryWrapper<UserDO>().eq("username", username));
    }

    // 演示 Mybatis-Plus 与 xml 混合使用
    List<UserDO> selectByIds(@Param("ids") Collection<Integer> ids);

    // 演示 Mybatis-Plus 中分页插件的使用
    default IPage<UserDO> selectPageByCreateTime(IPage<UserDO> page, @Param("createTime") Date createTime) {
       return selectPage(page, new QueryWrapper<UserDO>().gt("create_time", createTime));
    }
}
