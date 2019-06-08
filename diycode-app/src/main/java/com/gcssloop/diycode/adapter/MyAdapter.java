package com.gcssloop.diycode.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.gcssloop.diycode.R;
import com.gcssloop.diycode.database.Actions;

import java.util.Collections;
import java.util.List;

public class MyAdapter extends ArrayAdapter {

    private final int resourceId;

    public MyAdapter(Context context, int textViewResourceId, List<Actions> objects) {
        super(context,textViewResourceId, Collections.singletonList(objects));
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        Actions action = (Actions) getItem(position); // 获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);//实例化一个对象
        TextView ac_title = (TextView) view.findViewById(R.id.action_title);//获取该布局内的图片视图
        TextView ac_content = (TextView) view.findViewById(R.id.action_content);//获取该布局内的文本视图
        TextView ac_position = (TextView) view.findViewById(R.id.action_position);//获取该布局内的文本视图
        TextView ac_time = (TextView) view.findViewById(R.id.action_time);//获取该布局内的文本视图
        TextView ac_num = (TextView) view.findViewById(R.id.action_num);//获取该布局内的文本视图
        ac_title.setText(action.title);//为图片视图设置图片资源
        ac_content.setText(action.content);//为文本视图设置文本内容
        ac_position.setText(action.location);
        ac_time.setText(action.time);
        ac_num.setText(action.num);
        return view;

    }

}
