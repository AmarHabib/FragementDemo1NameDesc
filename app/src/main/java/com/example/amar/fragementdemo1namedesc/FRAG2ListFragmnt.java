package com.example.amar.fragementdemo1namedesc;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FRAG2ListFragmnt extends ListFragment {

    public FRAG2ListFragmnt() {

    }


    static interface FoodListListener{

        void itemclicked(long id);

    }

    private FoodListListener listner;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listner=(FoodListListener)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listner!=null){
            listner.itemclicked(id);
        }
        super.onListItemClick(l, v, position, id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       //name will be 3(0-2) size
        String names[]=new String[Menu.menus.length];
        //
        for (int i=0; i<names.length; i++){

            //contain names from (0-2)
            names[i]=Menu.menus[i].getName();

        }

        //To add the list of names to ListFragement then use Adapter as usual
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,names);
        //setting adapter to list
        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);

    }

}
