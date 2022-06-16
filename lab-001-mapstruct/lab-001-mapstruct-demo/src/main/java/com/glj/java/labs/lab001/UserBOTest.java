package com.glj.java.labs.lab001;

import com.glj.java.labs.lab001.bo.UserBO;
import com.glj.java.labs.lab001.convert.UserConvert;
import com.glj.java.labs.lab001.dataobject.UserDO;

/**
 * @ClassName UserBOTest
 * @Description
 *
 * 测试入口函数
 *
 * @Author glj
 * @Date 2022/5/20 5:56 下午
 * @Version 1.0
 */
public class UserBOTest {

    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO().setId(1).setUsername("mike").setPassword("123456");

        // 进行转换
        UserBO userBO = UserConvert.INSTANCE.convert(userDO);

        System.out.println(userBO);
    }
}
