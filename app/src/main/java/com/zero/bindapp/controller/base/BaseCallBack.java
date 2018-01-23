package com.zero.bindapp.controller.base;

import android.os.Handler;
import android.os.Message;

import java.io.PrintWriter;

/**
 * Created by zero on 2018/1/22.
 */

public class BaseCallBack implements Handler.Callback {

    BaseCallBack() {}

    public boolean handleMessage(Message message) {
        return true;
    }

    public void dump(PrintWriter printWriter, String str) {
        printWriter.println(String.valueOf(str).concat("BaseCallback: nothing to dump"));
    }
}
