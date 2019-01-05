package com.example.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;

    Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    String getName() {
        return mName;
    }
}