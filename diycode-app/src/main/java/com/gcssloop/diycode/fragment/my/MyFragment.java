package com.gcssloop.diycode.fragment.my;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.gcssloop.diycode.R;
import com.gcssloop.diycode.activity.MainActivity;
import com.gcssloop.diycode.adapter.MyAdapter;
import com.gcssloop.diycode.database.Actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyFragment extends Fragment {

    protected View mView;
    protected Context mContext;
    private ImageButton mIbtnadd;
    private ListView mLvaction;
    private List<Actions> actionsList;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext = getActivity();
        mView = inflater.inflate(R.layout.myfragment, container, false);
        initactions();
        MyAdapter adapter = new MyAdapter(mContext, R.layout.mylist, actionsList);
        ListView listView = (ListView) mView.findViewById(R.id.action_list);
        listView.setAdapter(adapter);
        return mView;
    }

    private void initactions() {
        actionsList=new ArrayList<Actions>();
        Actions action1=new Actions("111","222","333","444",10);
        actionsList.add(action1);
        Actions action2=new Actions("111","222","333","444",10);
        actionsList.add(action2);
        Actions action3=new Actions("111","222","333","444",10);
        actionsList.add(action3);
        Actions action4=new Actions("111","222","333","444",10);
        actionsList.add(action4);

    }

}
