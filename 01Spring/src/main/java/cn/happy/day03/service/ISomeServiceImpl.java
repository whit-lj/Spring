package cn.happy.day03.service;

import cn.happy.day03.dao.ISomeDAO;

/**
 * Created by Administrator on 2017/10/7.
 */
public class ISomeServiceImpl implements ISomeService{


    public ISomeDAO getDao() {
        return dao;
    }

    public void setDao(ISomeDAO dao) {
        this.dao = dao;
    }

    private ISomeDAO dao;



    public void doSome() {
        dao.doSome();
    }
}
