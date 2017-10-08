package cn.happy.day04;

import java.util.*;

/**
 * Created by Administrator on 2017/10/7.
 */
public class MyCollection {
    private String[]array;
    private List<String>list;
    private Set<String>sett;
    private Map<String,String>map;
    private Properties properties;

    @Override
    public String toString() {
        return "MyCollection{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", sett=" + sett +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSett() {
        return sett;
    }

    public void setSett(Set<String> sett) {
        this.sett = sett;
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
}
