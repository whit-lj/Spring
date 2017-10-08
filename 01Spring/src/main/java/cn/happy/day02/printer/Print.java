package cn.happy.day02.printer;

import cn.happy.day02.ink.Ink;
import cn.happy.day02.paper.Paper;

/**
 * Created by Administrator on 2017/9/28.
 */
public class Print {
    private Ink ink;
    private Paper pager;

    public void print(){
        System.out.println("用"+ink.getColor()+"在"+pager.getPaper()+"上打印我爱你中国");
    }
    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPager() {
        return pager;
    }

    public void setPager(Paper pager) {
        this.pager = pager;
    }
}
