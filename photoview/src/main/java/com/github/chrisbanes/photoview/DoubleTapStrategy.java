package com.github.chrisbanes.photoview;

/**
 * Created by huangwei on 2017/11/2.
 */

public interface DoubleTapStrategy {
    boolean onDoubleTap(PhotoViewAttacher attacher,float currentScale,float x,float y);
}
