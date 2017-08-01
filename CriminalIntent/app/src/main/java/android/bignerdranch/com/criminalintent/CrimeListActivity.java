package android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Ross on 01/08/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
