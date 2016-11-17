package apposing.skeletonfragmentapp.listeners;

import apposing.skeletonfragmentapp.activities.MainActivity;
import apposing.skeletonfragmentapp.fragments.fragment_base.BaseFragment;

/**
 * Created by Phil on 17/11/2016.
 */

public interface FragmentInteractionListener {
    void switchFragment(BaseFragment fragment, String fragmentName);
    void goBack();
    void clearBackStack();
    MainActivity getParentInstance();
}
