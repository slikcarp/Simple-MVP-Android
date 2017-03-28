package com.example.myapplication.ui.list;

/**
 * Created by evin on 2/7/17.
 */

public class ListPresenter implements ListContract.Presenter {

    private ListContract.View view;

    @Override
    public void loadData() {

        view.showProgress();

        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(1000);
                    view.showData("Fake data");
                } catch (InterruptedException e) {
                    view.showError(e.toString());
                }

                view.hideProgress();
            }
        }.start();

    }

    @Override
    public void attachView(ListContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }
}
