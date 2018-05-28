package org.hanana.hananaapp.events;

import android.support.v4.app.Fragment;

import org.hanana.hananaapp.SingleFragmentActivity;

public class EventsActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new EventsFragment();
    }

}
