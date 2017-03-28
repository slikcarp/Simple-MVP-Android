package com.example.myapplication;

/**
 * Created by evin on 2/7/17.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);

    void detachView();
}
