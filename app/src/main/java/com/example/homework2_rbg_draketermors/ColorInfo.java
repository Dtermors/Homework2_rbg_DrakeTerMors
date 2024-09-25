package com.example.homework2_rbg_draketermors;

public class ColorInfo
{
    //Setting up variables for storage
    private String storeRed;
    private String storeGreen;
    private String storeBlue;
    private String storeHex;

    //constructor
    public ColorInfo()
    {

    }

    //over loaded constructor
    public ColorInfo(String r, String g, String b, String h)
    {
        storeRed = r;
        storeGreen = g;
        storeBlue = b;
        storeHex = h;
    }

    //=============================================
    //Getters and setters
    //=============================================

    public String getStoreRed() {
        return storeRed;
    }

    public void setStoreRed(String storeRed) {
        this.storeRed = storeRed;
    }

    public String getStoreGreen() {
        return storeGreen;
    }

    public void setStoreGreen(String storeGreen) {
        this.storeGreen = storeGreen;
    }

    public String getStoreBlue() {
        return storeBlue;
    }

    public void setStoreBlue(String storeBlue) {
        this.storeBlue = storeBlue;
    }

    public String getStoreHex() {
        return storeHex;
    }

    public void setStoreHex(String storeHex) {
        this.storeHex = storeHex;
    }
}
