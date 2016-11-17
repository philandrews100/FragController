package apposing.skeletonfragmentapp.fragments.fragment_base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apposing.skeletonfragmentapp.listeners.FragmentInteractionListener;
import butterknife.Unbinder;

/**
 * Created by Phil on 17/11/2016.
 */

public abstract class BaseFragment extends Fragment {

    public FragmentInteractionListener fragListener;
    public Unbinder fragUnbinder;

    public abstract
    @LayoutRes
    int getLayoutId();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return layoutInflater.inflate(getLayoutId(), container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragListener = (FragmentInteractionListener) context;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(fragUnbinder != null)
            fragUnbinder.unbind();
    }
}
