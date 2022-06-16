package com.glj.java.labs.lab002;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.glj.java.labs.lab002.dataobject.UserDO;
import com.glj.java.labs.lab002.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @ClassName UserMapperTest
 * @Description
 *
 * UserMapper 的单元测试
 *
 * @Author glj
 * @Date 2022/5/23 3:36 下午
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =  App.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testInsert() {
        UserDO userDO = new UserDO().builder().username(UUID.randomUUID().toString()).password("123456")
                .createTime(new Date()).deleted(0).build();
        userMapper.insert(userDO);
    }

    @Test
    public void testUpdateById() {
        UserDO updateUserDO = new UserDO().builder().id(10).password("new-password-plus").build();
        userMapper.updateById(updateUserDO);
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(9);
    }

    @Test
    public void testSelectById() {
        UserDO userDO = userMapper.selectById(10);
        System.out.println(userDO);
    }

    @Test
    public void testSelectByUsername() {
        UserDO userDO = userMapper.selectByUsername("ca8c0f33-6180-476c-8ea4-e962353ea51b");
        System.out.println(userDO);
    }

    @Test
    public void testSelectByIds() {
        List<UserDO> userDOList = userMapper.selectByIds(Arrays.asList(10, 11, 12));
        userDOList.forEach(userDO -> {
            System.out.println(userDO);
        });
    }

    @Test
    public void testSelectPageByCreateTime() {
        IPage<UserDO> page = new Page<>(1, 10);
        Date createTime = new Date(2022-1990, Calendar.FEBRUARY, 24);  // 临时 Demo ，实际不建议这么写
        page = userMapper.selectPageByCreateTime(page, createTime);
        System.out.println(page.getRecords());
    }
}
