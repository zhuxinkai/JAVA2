package com.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;


import java.awt.*;
import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getAllMenus();
}
