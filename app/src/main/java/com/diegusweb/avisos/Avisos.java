package com.diegusweb.avisos;

/**
 * Created by HP on 12/05/2016.
 */
public class Avisos {


    private int mId;
    private String mContent;
    private int mImport;

    public Avisos(String mContent, int mId, int mImport) {
        this.mContent = mContent;
        this.mId = mId;
        this.mImport = mImport;
    }

    public String getmContent() {
        return mContent;
    }

    public int getmId() {
        return mId;
    }

    public int getmImport() {
        return mImport;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmImport(int mImport) {
        this.mImport = mImport;
    }




}
