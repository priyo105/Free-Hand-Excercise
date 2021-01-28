package com.example.freehandworkout_loseweightin30days.ui.FastFatLoss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.freehandworkout_loseweightin30days.R;
import com.example.freehandworkout_loseweightin30days.ui.dumbleExercise.DumbleExcerciseAdapter;
import com.example.freehandworkout_loseweightin30days.ui.home.freehandExerciseObject;

import java.util.ArrayList;
import java.util.List;

public class FastFatlossFragment extends Fragment {

    private ListView fastFatLossListView;
    private List<freehandExerciseObject> freehandExerciseObjectList=new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_fast_fat_loss, container, false);

       fastFatLossListView=root.findViewById(R.id.fastfatlosslistview);

        createDataObject();
        FastFatLossAdapter adapter=new FastFatLossAdapter(getContext(),freehandExerciseObjectList);
        fastFatLossListView.setAdapter(adapter);


        return root;
    }



    void createDataObject(){


        freehandExerciseObject obj1=new freehandExerciseObject("Running",R.drawable.running,"15 mins Every Day","Running is an excellent form of exercise for weight loss. It burns a lot of calories, may help you continue to burn calories long after a workout, may help suppress appetite and targets harmful belly fat. What's more, running has many other benefits for your health and is simple to begin" );
        freehandExerciseObjectList.add(obj1);


        freehandExerciseObject obj2=new freehandExerciseObject("Elliptical trainer",R.drawable.eliptical,"20 mins per day","\n" +
                "Some of us no longer have the strong joints we had as teenagers. Jogging is out of the question and walking doesn’t cut it. The good news is elliptical trainers provide an intense, low impact cardio workout. In fact, a 145-lb. person can burn about 300 calories in 30 minutes on an elliptical trainer. That’s about as many calories as running burns, but without the joint wear-and-tear.");
        freehandExerciseObjectList.add(obj2);


        freehandExerciseObject obj4=new freehandExerciseObject("Cycling",R.drawable.cycling,"20 mins per day","Depending on the intensity of your workout and your body weight, you can burn more than 600 calories an hour with a stationary bike workout. This makes indoor cycling an excellent workout option for burning calories quickly. Burning more calories than you consume is the key to weight loss.");
        freehandExerciseObjectList.add(obj4);


        freehandExerciseObject obj5=new freehandExerciseObject("Swimming",R.drawable.swimming,"30 mins( 3 days a week)","Swimming is a fun way to lose weight and get in shape.\n" +
                "\n" +
                "Harvard Health estimates that a 155-pound (70-kg) person burns approximately 233 calories per half hour of swimming.");
        freehandExerciseObjectList.add(obj5);


        freehandExerciseObject obj6=new freehandExerciseObject("Burpee",R.drawable.burpees,"3 reps(15 times)","No list of full-body exercises is complete without burpees. As brutal as they are, Fitness says they do an amazing job of torching calories and training your chest, core, and abs. If you aren’t already doing them, it’s time to start.\n" +
                "\n" +
                "Begin standing with your feet shoulder-width apart. Lower your body into a squat, place your palms on the floor below your shoulders, then hop your feet back into a plank. Jump your feet back to your hands, then immediately jump up as you extend your arms above your head. As you land, go right into the next one. Repeat the exercise until exhaustion." );
        freehandExerciseObjectList.add(obj6);



    }
}