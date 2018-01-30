package dexterdatul.com.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dexter John Datul on 30/01/2018.
 */

public class Twofragment extends android.support.v4.app.Fragment {

    View view;

    public Twofragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.item_two, container, false);
        return view;
    }

}
