package com.glj.java.labs.lab001.convert;

import com.glj.java.labs.lab001.bo.UserBO;
import com.glj.java.labs.lab001.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @InterfaceName UserConvert
 * @Description
 *
 * User 相关类 之间的转换
 *
 * @Author glj
 * @Date 2022/5/20 5:54 下午
 * @Version 1.0
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserBO convert(UserDO userDO);
}
