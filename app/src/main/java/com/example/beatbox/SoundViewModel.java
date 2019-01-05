package com.example.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }
}