package com.glj.java.labs.lab002;

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
 * UserMapper 的单元测试类
 *
 * @Author glj
 * @Date 2022/5/23 9:47 上午
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testInsert() {
        UserDO userDO = new UserDO().builder().username(UUID.randomUUID().toString()).
                password("123456").createTime(new Date()).build();
        userMapper.insert(userDO);
    }

    @Test
    public void testUpdateById() {
        UserDO updateUserDO = new UserDO().builder().id(5).password("new-password").build();
        userMapper.updateById(updateUserDO);
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(4);
    }

    @Test
    public void testSelectById() {
        UserDO userDO = userMapper.selectById(6);
        System.out.println(userDO);
    }

    @Test
    public void SelectByUsername() {
        UserDO userDO = userMapper.selectByUsername("5b1ca7ca-332d-4697-ab61-152e4f92542a");
        System.out.println(userDO);
    }

    @Test
    public void SelectByIds() {
        List<UserDO> userDOList = userMapper.selectByIds(Arrays.asList(5, 6, 7));
        userDOList.forEach(userDO -> {
            System.out.println(userDO);
        });
    }


}
