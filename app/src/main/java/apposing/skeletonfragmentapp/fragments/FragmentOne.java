package apposing.skeletonfragmentapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apposing.skeletonfragmentapp.R;
import apposing.skeletonfragmentapp.fragments.fragment_base.BaseFragment;
import apposing.skeletonfragmentapp.fragments.fragment_base.FragmentNames;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Phil on 17/11/2016.
 */

public class FragmentOne extends BaseFragment {

    @OnClick(R.id.btn_next_fragment)
    public void moveToNextFragment() {
        fragListener.switchFragment(FragmentTwo.newInstance(null), FragmentNames.FRAGMENT_TWO);
    }

    public static BaseFragment newInstance(@Nullable Bundle arg0) {
        FragmentOne fragmentOne = new FragmentOne();
        fragmentOne.setArguments(arg0);
        return fragmentOne;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_one;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  super.onCreateView(layoutInflater, container, savedInstanceState);
        fragUnbinder = ButterKnife.bind(this, view);
        return view;
    }
}
