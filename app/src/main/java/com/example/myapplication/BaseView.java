package com.example.myapplication;

/**
 * Created by evin on 2/7/17.
 */

public interface BaseView {
    void showProgress();

    void hideProgress();

    void showError(String error);
}
