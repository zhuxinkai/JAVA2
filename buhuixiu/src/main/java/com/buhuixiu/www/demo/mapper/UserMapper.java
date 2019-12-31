package com.buhuixiu.www.demo.mapper;

import com.buhuixiu.www.demo.model.Role;
import com.buhuixiu.www.demo.model.User;
import org.apache.ibatis.annotations.Mapper;



import java.util.List;

@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);
}
