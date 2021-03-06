package com.github.chrisbanes.photoview;

import android.view.MotionEvent;
import android.widget.ImageView;

class Util {

    static void checkZoomLevels(float minZoom, float midZoom,
                                float maxZoom) {
        if (minZoom >= midZoom) {
            throw new IllegalArgumentException(
                    "Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (midZoom >= maxZoom) {
            throw new IllegalArgumentException(
                    "Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    static boolean hasDrawable(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static boolean isSupportedScaleType(final int scaleType) {
        if(scaleType == ImageView.ScaleType.MATRIX.ordinal()){
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        return true;
    }

    static int getPointerIndex(int action) {
        return (action & MotionEvent.ACTION_POINTER_INDEX_MASK) >> MotionEvent.ACTION_POINTER_INDEX_SHIFT;
    }

    static ImageView.ScaleType getScaleType(int scaleType){
        ImageView.ScaleType[] values = ImageView.ScaleType.values();
        return scaleType>=0&& scaleType<values.length?values[scaleType]:null;
    }
}
