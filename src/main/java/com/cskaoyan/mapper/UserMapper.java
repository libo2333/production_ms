package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by little Stone
 * Date 2019/5/15 Time 11:05
 */
public interface UserMapper {

	User queryUserByUsernameAndPassword(@Param("username") String username,
                                        @Param("password") String password);
}
