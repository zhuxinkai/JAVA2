package com.buhuixiu.www.demo.model;

/**
 * <h3>buhuixiu</h3>
 * <p>实体类</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-24 09:43
 **/


public class Role {
    private Integer id;
    private String name;
    private String nameZh;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameZh() {
        return nameZh;
    }
}


