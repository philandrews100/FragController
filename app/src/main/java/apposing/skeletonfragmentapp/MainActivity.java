package apposing.skeletonfragmentapp;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @BindView(R.id.fl_main_container)
    FrameLayout flMainContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
}
