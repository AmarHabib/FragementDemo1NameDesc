package com.example.amar.fragementdemo1namedesc;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenudetlsFragmnt1 extends Fragment {


    //used to check which particualr item was clicked
    private long menuID;

    public void setMenuID(long menuID) {

        this.menuID = menuID;


    }


    // Required empty public constructor
    public MenudetlsFragmnt1() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     if(savedInstanceState!=null){

         menuID=savedInstanceState.getLong("menuID");
     }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menudetls_fragmnt1, container, false);
    }



    @Override
    public void onStart() {
        super.onStart();
        View view =getView();
        if(view!=null){

            TextView title=(TextView)view.findViewById(R.id.name);

            TextView Descp=(TextView)view.findViewById(R.id.descp);

            Menu menu=Menu.menus[(int)menuID];

            title.setText(menu.getName());
            Descp.setText(menu.getDescription());

        }

    }










}
