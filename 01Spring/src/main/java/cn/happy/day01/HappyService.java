package cn.happy.day01;

/**
 * Created by Administrator on 2017/9/28.
 */
public class HappyService {
    private String info;
private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "HappyService{" +
                "info='" + info + '\'' +
                ", age=" + age +
                '}';
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void work(){
        System.out.println("work"+info);
    }
}
