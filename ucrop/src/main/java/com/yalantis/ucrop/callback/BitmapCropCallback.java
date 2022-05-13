package com.yalantis.ucrop.callback;

import android.graphics.RectF;
import android.net.Uri;

import androidx.annotation.NonNull;

public interface BitmapCropCallback {

    void onBitmapCropped(@NonNull Uri resultUri, int offsetX, int offsetY, int imageWidth, int imageHeight, RectF mCropRect, RectF mCurrentImageRect, float mCurrentAngle);

    void onCropFailure(@NonNull Throwable t);

}