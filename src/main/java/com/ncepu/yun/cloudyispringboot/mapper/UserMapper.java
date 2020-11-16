
package com.ncepu.yun.cloudyispringboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ncepu.cloudyi.cloudyiapi.entity.User;

@Mapper
public interface UserMapper {
    List<User> selectAllUser();
}
