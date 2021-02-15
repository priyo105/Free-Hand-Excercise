package com.zerogravityapp.freehandworkout_loseweightin30days.ui.home;


public class freehandExerciseObject {

    private String exerciseName;
    private int baseImage;
    private String  reps;
    private String durationOfExercise;
    private String gifImageToShow;
    private String shortDescription;

    public freehandExerciseObject(String exerciseName, int baseImage, String reps) {
        this.exerciseName = exerciseName;
        this.baseImage = baseImage;
        this.reps = reps;
    }


    public freehandExerciseObject(String exerciseName, int baseImage, String reps, String shortDescription) {
        this.exerciseName = exerciseName;
        this.baseImage = baseImage;
        this.reps = reps;
        this.shortDescription = shortDescription;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(int baseImage) {
        this.baseImage = baseImage;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public String getDurationOfExercise() {
        return durationOfExercise;
    }

    public void setDurationOfExercise(String durationOfExercise) {
        this.durationOfExercise = durationOfExercise;
    }

    public String getGifImageToShow() {
        return gifImageToShow;
    }

    public void setGifImageToShow(String gifImageToShow) {
        this.gifImageToShow = gifImageToShow;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
