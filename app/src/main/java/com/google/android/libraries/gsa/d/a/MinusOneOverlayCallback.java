package com.google.android.libraries.gsa.d.a;

import android.content.res.Configuration;
import android.os.Message;

import com.google.android.libraries.material.progress.u;

import java.io.PrintWriter;

public final class MinusOneOverlayCallback extends OverlayControllerCallback {

    private final OverlaysController overlaysController;

    public MinusOneOverlayCallback(OverlaysController overlaysControllerVar, OverlayControllerBinder overlayControllerBinderVar) {
        super(overlayControllerBinderVar, 3);
        this.overlaysController = overlaysControllerVar;
    }

    final OverlayController createController(Configuration configuration) {
        return this.overlaysController.createController(configuration, this.overlayControllerBinder.mServerVersion, this.overlayControllerBinder.mClientVersion);
    }

    public final void dump(PrintWriter printWriter, String str) {
        printWriter.println(String.valueOf(str).concat("MinusOneOverlayCallback"));
        super.dump(printWriter, str);
    }

    public final boolean handleMessage(Message message) {
        if (super.handleMessage(message)) {
            return true;
        }
        OverlayController overlayControllerVar;
        long when;
        switch (message.what) {
            //ACTION_DOWN
            case 3:
                if (this.overlayController != null) {
                    overlayControllerVar = this.overlayController;
                    when = message.getWhen();
                    if (!overlayControllerVar.cnD()) {
                        SlidingPanelLayout slidingPanelLayoutVar = overlayControllerVar.slidingPanelLayout;
                        if (slidingPanelLayoutVar.threshold < slidingPanelLayoutVar.mTouchSlop) {
                            overlayControllerVar.slidingPanelLayout.BM(0);
                            overlayControllerVar.mAcceptExternalMove = true;
                            overlayControllerVar.offsetX = 0;
                            overlayControllerVar.slidingPanelLayout.mForceDrag = true;
                            overlayControllerVar.downTime = when - 30;
                            overlayControllerVar.dispatchTouchEvent(0, overlayControllerVar.offsetX, overlayControllerVar.downTime);
                            overlayControllerVar.dispatchTouchEvent(2, overlayControllerVar.offsetX, when);
                        }
                    }
                }
                return true;
            case u.ACTION_MOVE /*4*/:
                if (this.overlayController != null) {
                    overlayControllerVar = this.overlayController;
                    float floatValue = (float) message.obj;
                    when = message.getWhen();
                    if (overlayControllerVar.mAcceptExternalMove) {
                        overlayControllerVar.offsetX = (int) (floatValue * ((float) overlayControllerVar.slidingPanelLayout.getMeasuredWidth()));
                        overlayControllerVar.dispatchTouchEvent(2, overlayControllerVar.offsetX, when);
                    }
                }
                return true;
            case u.ACTION_UP /*5*/:
                if (this.overlayController != null) {
                    overlayControllerVar = this.overlayController;
                    when = message.getWhen();
                    if (overlayControllerVar.mAcceptExternalMove) {
                        overlayControllerVar.dispatchTouchEvent(1, overlayControllerVar.offsetX, when);
                    }
                    overlayControllerVar.mAcceptExternalMove = false;
                }
                return true;
            default:
                return false;
        }
    }
}
