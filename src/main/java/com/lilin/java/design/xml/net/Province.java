package com.lilin.java.design.xml.net;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: Province
 * @date 2019/3/17上午12:22
 */
public class Province {

    private String name;
    private List<City> citys = new ArrayList<>();

    public Province(String name) {
        this.name = name;
    }

    public Province(List<City> citys) {
        this.citys = citys;
    }

    public Province(String name, List<City> citys) {
        this.name = name;
        this.citys = citys;
    }

    public Province() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCitys() {
        return citys;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
    }

    public void addCity(City city) {
        citys.add(city);
    }
}
