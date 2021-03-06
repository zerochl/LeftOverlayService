package com.zero.bindapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.google.android.apps.gsa.nowoverlayservice.ConfigurationOverlayController;
import com.google.android.libraries.gsa.d.a.OverlaysController;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/**
 * Created by zero on 2018/1/22.
 */

public class AppBindService extends Service{
    private OverlaysController overlaysController;

    public void onCreate() {
        super.onCreate();
        this.overlaysController = new ConfigurationOverlayController(this);
    }

    public void onDestroy() {
        this.overlaysController.onDestroy();
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        return this.overlaysController.onBind(intent);
    }

    public boolean onUnbind(Intent intent) {
        this.overlaysController.unUnbind(intent);
        return false;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.overlaysController.dump(printWriter);
    }
}
