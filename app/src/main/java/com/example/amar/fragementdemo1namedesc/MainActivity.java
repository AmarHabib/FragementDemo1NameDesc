package com.example.amar.fragementdemo1namedesc;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FRAG2ListFragmnt.FoodListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public void itemclicked(long id) {

        MenudetlsFragmnt1 detals = new MenudetlsFragmnt1();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        detals.setMenuID(id);
        ft.replace(R.id.framelayt, detals);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();


    }
}
