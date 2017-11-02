package com.github.chrisbanes.photoview;

import android.graphics.Matrix;
import android.graphics.RectF;

/**
 * Created by huangwei on 2017/11/2.
 */

public interface ScaleTypeStrategy {
    void processScaleType(RectF srcRect, RectF dstRect, Matrix matrix,int scaleType);
}
