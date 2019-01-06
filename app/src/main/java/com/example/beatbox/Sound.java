package com.example.beatbox;


class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "");
    }

    String getAssetPath() {
        return mAssetPath;
    }

    String getName() {
        return mName;
    }

    void setSoundId(int soundId) {
        mSoundId = soundId;
    }

    Integer getSoundId() {
        return mSoundId;
    }
}
