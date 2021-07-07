package com.example.cardview;

public class DataModel {
    private int imageRes;
    private String imageName;

    public DataModel(int imageRes , String imageName){
        this.imageRes = imageRes;
        this.imageName = imageName;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getImageName() {
        return imageName;
    }
}
