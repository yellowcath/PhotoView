# PhotoView
expand [PhotoView](https://github.com/chrisbanes/PhotoView) to support customized ScaleType

```java
    int myScaleType = 123;
    attacher.setScaleType(myScaleType);
    attacher.setScaleTypeStrategy((srcRect, dstRect, baseMatrix, scaleType) -> {
        if(scaleType == myScaleType){
            //dosomething to baseMatrix
        }
    });
```

and DoubleTapStrategy

```java
        //like Weibo
        attacher.setDoubleTapStrategy((photoViewAttacher, scale, x, y) -> {
            if(Math.abs(scale-photoViewAttacher.getMediumScale())<0.001f){
                photoViewAttacher.setScale(photoViewAttacher.getMaximumScale(),x,y,true);
            }else{
                photoViewAttacher.setScale(photoViewAttacher.getMediumScale(),x,y,true);
            }
            return true;
        });
```
