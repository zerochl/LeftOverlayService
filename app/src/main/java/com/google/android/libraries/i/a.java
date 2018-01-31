package com.google.android.libraries.i;

import android.os.Bundle;
import android.os.IInterface;
import android.view.WindowManager.LayoutParams;

public interface a extends IInterface {
    void BJ(int i);

    void BK(int i);

    String HB();

    boolean HC();

    void onWindowAttached(Bundle bundle, d dVar);

    void onWindowAttached(LayoutParams layoutParams, d dVar, int i);

    boolean onWindowAttached(byte[] bArr, Bundle bundle);

    void aL(float f);

    void cnK();

    void cnL();

    boolean cnM();

    void fI(int i);

    void od(boolean z);

    void oe(boolean z);

    void onPause();

    void onResume();
}
