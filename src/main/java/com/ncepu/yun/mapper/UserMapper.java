
package com.ncepu.yun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ncepu.yun.entity.User;

@Mapper
public interface UserMapper {
    List<User> selectAllUser();
}
