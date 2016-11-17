package apposing.skeletonfragmentapp.activities;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import apposing.skeletonfragmentapp.R;
import apposing.skeletonfragmentapp.fragments.FragmentOne;
import apposing.skeletonfragmentapp.fragments.fragment_base.BaseFragment;
import apposing.skeletonfragmentapp.fragments.fragment_base.FragmentNames;
import apposing.skeletonfragmentapp.listeners.FragmentInteractionListener;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity implements FragmentInteractionListener{

    private FragmentManager fragManager;
    private FragmentTransaction fragTransaction;

    @BindView(R.id.fl_main_container)
    FrameLayout flMainContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupFragmentManager();
        switchFragment(FragmentOne.newInstance(null), FragmentNames.FRAGMENT_ONE);
    }

    @Override
    public void switchFragment(BaseFragment fragment, String fragmentName) {
        this.fragTransaction = getBaseFragmentManager().beginTransaction();
        this.fragTransaction.replace(flMainContainer.getId(), fragment, fragmentName);
        this.fragTransaction.addToBackStack(fragmentName);
        this.fragTransaction.commit();
    }

    @Override
    public void goBack() {
        onBackPressed();
    }

    @Override
    public void clearBackStack() {
        fragManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    @Override
    public MainActivity getParentInstance() {
        return this;
    }

    @Override
    public void onBackPressed() {
        if (this.fragManager.getBackStackEntryCount() != 1) {
            fragManager.popBackStack();
            if (this.fragManager.getBackStackEntryCount() == 0) {
                super.onBackPressed();
            }
        } else {
            finish();
        }
    }

    private FragmentManager getBaseFragmentManager() {
        if (null == this.fragManager) {
            throw new IllegalStateException(MainActivity.class.getSimpleName() +
                    " is not initialized, call setupFragmentManager(...) first");
        }
        return this.fragManager;
    }

    private void setupFragmentManager() {
        fragManager = getSupportFragmentManager();
    }
}
