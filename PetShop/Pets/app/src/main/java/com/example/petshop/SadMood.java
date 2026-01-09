package com.example.petshop;

import android.provider.ContactsContract;

import java.util.Date;

public class SadMood extends Mood {
    public SadMood(){
        super();
    }

    public SadMood(Date date){
        super(date);
    }

    @Override
    public String getMoodString(){
        return "Sad";
    }
}
