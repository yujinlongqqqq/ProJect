package com.commonui.activity.base;

import java.util.List;

/**
 * des:baseview
 * Created by xsf
 * on 2016.07.11:53
 */
public interface BaseListView<T> {
    //显示加载页
    void showProgress();
    //关闭加载页
    void hideProgress();
    //加载新数据
    void loadData(List<T> list);
    //添加更多数据
    void addData(List<T> list);
    //显示加载失败
    void showLoadFailMsg();
    //显示已加载所有数据
    void showLoadCompleteAllData();
    //显示无数据
    void showNoData();
}