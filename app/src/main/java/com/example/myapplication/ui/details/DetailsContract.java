package com.example.myapplication.ui.details;

import com.example.myapplication.BasePresenter;
import com.example.myapplication.BaseView;

/**
 * Created by evin on 2/7/17.
 */

public interface DetailsContract {
    interface View extends BaseView {
        void showImage();
        void showPhone();
    }

    interface Presenter extends BasePresenter<View> {
        void loadInfo();
    }
}
