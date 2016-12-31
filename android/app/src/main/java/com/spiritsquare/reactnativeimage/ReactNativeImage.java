package com.spiritsquare.reactnativeimage;


import android.support.annotation.Nullable;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.ReactImageView;

/**
 * Created by spiritsquare on 12/27/16.
 */

public class ReactNativeImage extends SimpleViewManager<ReactImageView> {
    public static final String REACT_CLASS = "ReactNativeImage";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    public static final String TAG = ReactNativeImage.class.getSimpleName();

    private final @Nullable Object mCallerContext;

    public ReactNativeImage() {
        mCallerContext = null;
    }

    @Override
    public ReactImageView createViewInstance(ThemedReactContext context) {
        return new ReactImageView(context, Fresco.newDraweeControllerBuilder(), mCallerContext);
    }

    // In JS this is Image.props.source
    @ReactProp(name = "src")
    public void setSource(ReactImageView view, @Nullable String sources) {
       view.setSource(sources);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(ReactImageView view, float borderRadius) {
        view.setBorderRadius(borderRadius);
    }
}
