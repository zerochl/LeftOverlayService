package com.google.android.libraries.i;

import android.os.Bundle;
import android.os.IInterface;
import android.view.WindowManager.LayoutParams;

public interface a extends IInterface {
    void BJ(int i);

    void BK(int i);

    String HB();

    boolean HC();

    void windowAttached(Bundle bundle, d dVar);

    void windowAttached(LayoutParams layoutParams, d dVar, int i);

    boolean windowAttached(byte[] bArr, Bundle bundle);

    void onScroll(float f);

    void startScroll();

    void endScroll();

    boolean cnM();

    void closeOverlay(int i);

    void windowDetached(boolean z);

    void oe(boolean z);

    void onPause();

    void onResume();
}
