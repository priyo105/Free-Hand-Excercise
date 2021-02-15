package com.zerogravityapp.freehandworkout_loseweightin30days.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdView;
import com.zerogravityapp.freehandworkout_loseweightin30days.addcontrollers.BannerAddController;
import com.zerogravityapp.freehandworkout_loseweightin30days.addcontrollers.InterStitialAdController;
import com.zerogravityapp.freehandworkout_loseweightin30days.R;

import java.util.ArrayList;
import java.util.List;

public class FreeHandExercises extends AppCompatActivity {

    private ListView freehandExerciseListView;
    private List<freehandExerciseObject> freehandExerciseObjectList=new ArrayList<>();
    private InterStitialAdController interStitialAdController;
    private BannerAddController bannerAddController;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_hand_exercises);
        freehandExerciseListView=findViewById(R.id.freehandlist);
        getSupportActionBar().setTitle("Free Hand Exercises");


         createDataObject();

        freeHandExerciseAdapter adapter=new freeHandExerciseAdapter(getApplicationContext(),freehandExerciseObjectList);
        freehandExerciseListView.setAdapter(adapter);

        //interstitial adds related codes
        interStitialAdController=new InterStitialAdController(this);
        interStitialAdController.initializeAdds();
        interStitialAdController.ShowAdds();

        //banner Add related codes
        mAdView = findViewById(R.id.adView);
        bannerAddController=new BannerAddController(this,mAdView);
        bannerAddController.LoadBannerAdd();

    }


    void createDataObject(){


        freehandExerciseObject obj1=new freehandExerciseObject("JUMPING JACK",R.drawable.jumpingjack,"3 reps(20 times)","Like most cardio exercises, jumping jacks offer cardiovascular benefits. It balances out your heart rate, increases blood circulation all over the body, controls and maintains blood pressure, helps in doing away with bad cholesterol levels in the body, prevents the onset of stroke or heart attacks" );
        freehandExerciseObjectList.add(obj1);


        freehandExerciseObject obj2=new freehandExerciseObject("HIGH KNEE RAISE",R.drawable.highknee,"3 reps(20 times)","High Knees are a cardio-intensive exercise performed at a fast pace. It engages your core, strengthens all the muscles in your legs, gets your heart rate up and improves momentum, coordination and flexibility. Because of the many physical benefits, high-knees are incorporated into a wide variety of workouts. They’re also relatively easy exercises to perform because they can be practiced anywhere — no gym or equipment required.");
        freehandExerciseObjectList.add(obj2);


        freehandExerciseObject obj4=new freehandExerciseObject("Plank",R.drawable.plank,"1 minute(3 times)","Plank is one of the best calorie burning and beneficial exercises. A plank hold engages multiple muscles at once, thereby benefiting the core strength of your body. Not just burning the fat around your abdomen area, they also work by giving you an improved posture, flexibility as well as a tighter tummy. It might look simple but requires a lot of resilience and balance. This way, the longer you are able to stay in the plank position, the better it is. To lose belly fat, experts suggest that you stick to the goal of holding a plank for about 60 seconds for a minimum of 3 times.");
        freehandExerciseObjectList.add(obj4);


        freehandExerciseObject obj5=new freehandExerciseObject("Squats",R.drawable.squats,"3 reps(15 times)","Squats Help Build Muscle. They don't just help you achieve wonderful, toned legs; they promote body-wide muscle building by creating an anabolic (muscle building) environment in the body. They work up your quadriceps, hamstrings, calves, abdominal muscles, lower back and your butt too.");
        freehandExerciseObjectList.add(obj5);

        freehandExerciseObject obj6=new freehandExerciseObject("Push Up",R.drawable.pushup,"3 reps(15 times)","Traditional pushups are beneficial for building upper body strength. They work the triceps, pectoral muscles, and shoulders. When done with proper form, they can also strengthen the lower back and core by engaging (pulling in) the abdominal muscles. Pushups are a fast and effective exercise for building strength");
        freehandExerciseObjectList.add(obj6);

        freehandExerciseObject obj7=new freehandExerciseObject("Lunges",R.drawable.lunges,"3 reps(15 times)","Lunges increase muscle mass to build up strength and tone your body, especially your core, butt, and legs. Improving your appearance isn't the main benefit of shaping up your body, as you'll also improve your posture and range of motion. Lunges target the following muscles: abdominals");
        freehandExerciseObjectList.add(obj7);

        freehandExerciseObject obj8=new freehandExerciseObject("Jump Squats",R.drawable.jumpsquats,"3 reps(15 times)","Jump squats increase your explosive power, improve upper and lower body strength, and burn calories faster than regular squats. Explosive power gives you the ability to take off faster and move quicker, which athletes in football, tennis, and track and field strive for.");
        freehandExerciseObjectList.add(obj8);

        freehandExerciseObject obj9=new freehandExerciseObject("Leg Raise",R.drawable.legraise,"3 reps(15 times)","Leg raises are great for your abs and the obliques. It helps in building stronger abs, increase stability and strength, melt belly fat and tone your body. Leg raises completely isolates the rectus abdominis muscle which helps in toning your stomach");
        freehandExerciseObjectList.add(obj9);


        freehandExerciseObject obj10=new freehandExerciseObject("Ab Crunches",R.drawable.ab_crunches,"3 reps(15 times)","Like situps, crunches help you build muscle. But unlike situps, they work only the abdominal muscles. This intense muscle isolation makes them a popular exercise for people trying to get six-pack abs. This also makes them ideal for strengthening your core, which includes your lower back muscles and obliques.\n");
        freehandExerciseObjectList.add(obj10);

        freehandExerciseObject obj11=new freehandExerciseObject("Bicycle Crunches",R.drawable.bicycle_crunches,"3 reps(15 times)","Adding bicycle crunches to your workout routine helps to increase core strength, slims down your waist and improves your stability and flexibility. This exercise works your abs and obliques and because it keeps your body moving constantly, boosts your heart rate and burns even more calories");
        freehandExerciseObjectList.add(obj11);

        freehandExerciseObject obj12=new freehandExerciseObject("Butt Kicks",R.drawable.buttkicks,"3 reps(15 times)","In particular, butt kicks may help increase the speed of hamstring contractions, which can help you run faster. This explosive move works both your hamstring muscles and your glutes, and it can also be used as a dynamic stretch for your quads.");
        freehandExerciseObjectList.add(obj12);

        freehandExerciseObject obj13=new freehandExerciseObject("Burpees",R.drawable.burpees,"3 reps(15 times)","According to a study from the American College of Sports Medicine, 10 fast-paced reps of burpees are just as effective at increasing your metabolism as a 30-second all-out sprint. This exercise can help burn belly fat faster than any other exercise or diet if performed regularly");
        freehandExerciseObjectList.add(obj13);

        freehandExerciseObject obj14=new freehandExerciseObject("Shoulder Bridge",R.drawable.shoulderbridge,"3 reps(15 times)","The bridge exercise works the posterior leg muscles including the glutes and hamstrings. It also works the abdominals (including the transverse abdominus and rectus abdominus), and the errector spinae (back) muscles");
        freehandExerciseObjectList.add(obj14);

        freehandExerciseObject obj15=new freehandExerciseObject("Tuck Jump",R.drawable.tuckjump,"3 reps(15 times)","A proper tuck jump will work your legs, core, glutes, and quads, giving you both the upper- and lower-body-strengthening exercise you want. And because jumping is involved, you'll also be able to sneak in some cardio with this move");
        freehandExerciseObjectList.add(obj15);

        freehandExerciseObject obj16=new freehandExerciseObject("Bear Crawl",R.drawable.bearcrawl,"3 reps(15 times)","Bear crawls are a great all-in-one exercise that work all the major muscle groups in unison, and provide a real core challenge. Adding bear crawls to your training is a sure-fire way to build strength and power, boost your metabolism and fire up your cardio fitness");
        freehandExerciseObjectList.add(obj16);


        freehandExerciseObject obj17=new freehandExerciseObject("Mountain Climber",R.drawable.mountainclimber,"3 reps(15 times)","The mountain climber is a calorie-burning workout that really gets your heart rate going. It also targets your core, making it the perfect exercise to lose that stubborn belly fat and reveal your abs.");
        freehandExerciseObjectList.add(obj17);
    }
}