package com.example.android.miwok;


public class Word {
    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mimageResourceId = noImage;
    private static final int noImage = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mMiwokTranslation = miwokTranslation;
        mdefaultTranslation = defaultTranslation;
        mimageResourceId = imageResourceId;

    }

    public int getImageResourceId() {
        return mimageResourceId;
    }
    public String getMdefaultTranslation() {
        return mdefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public boolean hasImage(){
    return mimageResourceId != noImage;
    }
}





