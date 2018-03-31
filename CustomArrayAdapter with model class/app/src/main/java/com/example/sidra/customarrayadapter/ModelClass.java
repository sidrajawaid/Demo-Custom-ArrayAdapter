package com.example.sidra.customarrayadapter;

/**
 * Created by Sidra on 10/17/2017.
 */

public class ModelClass {
    private int mImage;
    private int mSong;
    private int mSinger;

    public ModelClass(int mSong,int mSinger,int mImage) {
        this.mImage = mImage;
        this.mSong = mSong;
        this.mSinger = mSinger;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmSong() {
        return mSong;
    }

    public int getmSinger() {
        return mSinger;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public void setmSong(int mSong) {
        this.mSong = mSong;
    }

    public void setmSinger(int mSinger) {
        this.mSinger = mSinger;
    }
}
