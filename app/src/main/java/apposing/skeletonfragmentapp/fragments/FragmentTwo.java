package apposing.skeletonfragmentapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apposing.skeletonfragmentapp.R;
import apposing.skeletonfragmentapp.fragments.fragment_base.BaseFragment;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Phil on 17/11/2016.
 */

public class FragmentTwo extends BaseFragment {

    @OnClick(R.id.btn_go_back)
    public void goBack() {
        fragListener.goBack();
    }

    public static BaseFragment newInstance(@Nullable Bundle arg0) {
        FragmentTwo fragmentTwo = new FragmentTwo();
        fragmentTwo.setArguments(arg0);
        return fragmentTwo;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_two;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(layoutInflater, container, savedInstanceState);
        fragUnbinder = ButterKnife.bind(this, view);
        return view;
    }
}
