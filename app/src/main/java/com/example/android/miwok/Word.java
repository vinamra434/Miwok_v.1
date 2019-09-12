package com.example.android.miwok;

class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;
    private static final int NO_IMAGE_PROVIDED = -1;


     Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

     Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID = mAudioResourceID;
    }

     String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

     String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

     int getmImageResourceID() {return mImageResourceID;}

     int getmAudioResourceID() {return mAudioResourceID;}

     boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
