package com.example.freehandworkout_loseweightin30days.ui.FastFatLoss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.freehandworkout_loseweightin30days.R;
import com.example.freehandworkout_loseweightin30days.ui.home.freehandExerciseObject;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class FastFatLossAdapter extends BaseAdapter {
    private Context c;
    private List<freehandExerciseObject> freehandExerciseObjectList;

    public FastFatLossAdapter(Context c, List<freehandExerciseObject> freehandExerciseObjectList) {
        this.c = c;
        this.freehandExerciseObjectList = freehandExerciseObjectList;
    }

    @Override
    public int getCount() {
        return freehandExerciseObjectList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;

        view = inflater.inflate(R.layout.freehandlistadapterview, parent,false);
        TextView t1=(TextView)view.findViewById(R.id.name);
        TextView reps=(TextView)view.findViewById(R.id.reps);
        TextView description=(TextView)view.findViewById(R.id.benifits);


        GifImageView i2=(GifImageView)view.findViewById(R.id.image);
        i2.setImageResource(freehandExerciseObjectList.get(position).getBaseImage());
        t1.setText(freehandExerciseObjectList.get(position).getExerciseName());
        reps.setText(freehandExerciseObjectList.get(position).getReps());
        description.setText(freehandExerciseObjectList.get(position).getShortDescription());


        return view;    }
}
