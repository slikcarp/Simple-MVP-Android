package com.example.myapplication.ui.list;

import com.example.myapplication.BasePresenter;
import com.example.myapplication.BaseView;

/**
 * Created by evin on 2/7/17.
 */

public interface ListContract {
    interface View extends BaseView {
        void showData(String data);
    }

    interface Presenter extends BasePresenter<View> {
        void loadData();
    }
}
