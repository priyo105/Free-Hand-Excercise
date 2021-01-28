package com.example.freehandworkout_loseweightin30days.ui.dumbleExercise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.freehandworkout_loseweightin30days.R;
import com.example.freehandworkout_loseweightin30days.ui.home.freeHandExerciseAdapter;
import com.example.freehandworkout_loseweightin30days.ui.home.freehandExerciseObject;

import java.util.ArrayList;
import java.util.List;

public class DumbleExerciseFragment extends Fragment {

    private ListView dumbleExcerciseList;
    private List<freehandExerciseObject> freehandExerciseObjectList=new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dumble_excercises, container, false);

        dumbleExcerciseList=root.findViewById(R.id.dumbleExcerciseList);
        createDataObject();
        DumbleExcerciseAdapter adapter=new DumbleExcerciseAdapter(getContext(),freehandExerciseObjectList);
        dumbleExcerciseList.setAdapter(adapter);


        return root;
    }



    void createDataObject(){


        freehandExerciseObject obj1=new freehandExerciseObject("Goblet Squat",R.drawable.goblet_squat,"3 reps(20 times)","The goblet squat works all the major muscle groups of the lower body, including the quadriceps, glutes, hamstrings, and calves.\n" );
        freehandExerciseObjectList.add(obj1);


        freehandExerciseObject obj2=new freehandExerciseObject("Forward Lunge Bicep Curl",R.drawable.forward_lunge_dumble,"3 reps(20 times)","In both forward and backward lunges, the same muscle groups are targeted- mostly your lower half including the hamstrings, quads, glutes, and calves. Your core and back muscles are also engaged while performing this exercise.");
        freehandExerciseObjectList.add(obj2);


        freehandExerciseObject obj4=new freehandExerciseObject("Dumbbell Bench Press",R.drawable.dumble_bench_press,"3 reps(15 times)","The dumbbell bench press is an extremely effective movement for increasing upper body strength and muscle mass for both aesthetics and performance.");
        freehandExerciseObjectList.add(obj4);


        freehandExerciseObject obj5=new freehandExerciseObject("Side Raise",R.drawable.side_raise,"3 reps(15 times)","A lateral raise works your shoulder muscles as well as your triceps. To do this exercise: Stand or sit with your arms at your sides and a dumbbell in each hand. With your palms facing in toward your body and your elbows slightly bent, raise the dumbbells so your arms are parallel to the floor..");
        freehandExerciseObjectList.add(obj5);


        freehandExerciseObject obj6=new freehandExerciseObject("Dumble DeadLift",R.drawable.dumble_deadlift,"3 reps(15 times)",". Deadlifts with dumbbells work out your legs, back, forearms and glutes all at the same time" );
        freehandExerciseObjectList.add(obj6);


        freehandExerciseObject obj7=new freehandExerciseObject("Dumble DeadLift",R.drawable.upright_row,"3 reps(15 times)"," Dumbbell upright rows are a great exercise for shoulder and trap muscular development and the perfect addition to your upper body workouts." );
        freehandExerciseObjectList.add(obj7);

        freehandExerciseObject obj8=new freehandExerciseObject("Dumble Swing",R.drawable.dumble_swing,"3 reps(15 times)","The dumbbell swing is a combination movement that is a cross between a deep back squat, front lateral raise, and overhead press. As a compound movement, the dumbbell swing activates several major muscle groups including the quadriceps, hamstrings, chest, trapezius, shoulders, and abdominals. By targeting all of these muscles and varying the weight and tempo, this makes it an effective way to boost strength, endurance, power, and speed.." );
        freehandExerciseObjectList.add(obj8);

        freehandExerciseObject obj9=new freehandExerciseObject(" Bicep Curl",R.drawable.bicep_curls,"3 reps(15 times)","One of the simplest and most common weight exercises is also one of the best. It works a host of bicep and tricep muscles. Throughout this movement, make sure you keep your back straight and your upper body controlled." );
        freehandExerciseObjectList.add(obj9);

        freehandExerciseObject obj10=new freehandExerciseObject("Bent-Over Row",R.drawable.bent_row,"3 reps(15 times)","Maximise the potential of free weights with this classic muscle-building exercise, which works the back and shoulders. Just be advised that this one is not for beginners and that improper form can render serious damage. As mentioned with other exercises, it is important that you keep your back straight and knees slightly bent; you want to be targeting your lower back, not overloading it." );
        freehandExerciseObjectList.add(obj10);


    }

}