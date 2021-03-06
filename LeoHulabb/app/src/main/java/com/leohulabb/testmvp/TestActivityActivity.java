package com.leohulabb.testmvp;

import android.widget.ImageView;
import android.widget.TextView;

import com.commonui.activity.base.BaseActivity;
import com.commonui.imageloader.glide.ImageLoaderUtils;
import com.commonui.toast.ToastManager;
import com.leohulabb.R;
import com.leohulabb.data.TestData;
import com.leohulabb.testmvp.contract.TestContract;
import com.leohulabb.testmvp.model.TestModelImpl;
import com.leohulabb.testmvp.presenter.TestPresenterImpl;

public class TestActivityActivity extends BaseActivity<TestPresenterImpl, TestModelImpl> implements TestContract.View {

    private ImageView ivLogo;
    private TextView tvAddress;
    private TextView tvName;

    private String imageStr;

    @Override
    public int getLayoutId() {
        return R.layout.test_activity;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
        imageStr = getIntent().getStringExtra("Picture");
    }

    @Override
    public void initView() {
        ivLogo = (ImageView) findViewById(R.id.iv_logo);
        tvAddress = (TextView) findViewById(R.id.tv_address);
        tvName = (TextView) findViewById(R.id.tv_name);
    }

    @Override
    public void setData() {
        mPresenter.getDetail();
    }

    @Override
    public void setListener() {
    }

    @Override
    public void setDetail(TestData data) {
        tvAddress.setText(data.getFancierAddress());
        tvName.setText(data.getFancierName());
        ImageLoaderUtils.display(context, ivLogo, imageStr);
    }

    @Override
    public void noData() {
        ToastManager.show(context, "暂无数据");
        finish();
    }
}