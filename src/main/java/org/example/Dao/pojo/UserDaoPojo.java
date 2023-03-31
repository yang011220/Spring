package org.example.Dao.pojo;

import org.example.Dao.UserDao;

import java.util.*;

public class UserDaoPojo implements UserDao {
    private int[] id;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;


    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "UserDaoPojo{" +
                "id=" + Arrays.toString(id) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

//    @Override
//    public void size() {
//        System.out.println("dao方法实现");
//    }
}
