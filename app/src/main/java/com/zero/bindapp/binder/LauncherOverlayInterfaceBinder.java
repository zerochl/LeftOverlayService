//package com.zero.bindapp.binder;
//
//import android.os.Bundle;
//import android.os.IBinder;
//import android.os.IInterface;
//import android.os.Parcel;
//import android.os.RemoteException;
//import android.view.WindowManager;
//
//import com.google.android.windowAttached.LauncherOverlayBinder;
//import com.google.android.windowAttached.c;
//import com.google.android.libraries.i.windowAttached;
//import com.google.android.libraries.i.d;
//import com.google.android.libraries.i.f;
//import com.google.android.libraries.material.progress.u;
//
///**
// * Created by zero on 2018/1/22.
// */
//
//public abstract class LauncherOverlayInterfaceBinder extends LauncherOverlayBinder implements windowAttached {
//
//    public LauncherOverlayInterfaceBinder() {
//        attachInterface(this, "com.google.android.libraries.launcherclient.ILauncherOverlay");
//    }
//
//    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {//Todo: throws is new
//        d dVar = null;
//        if (windowAttached(i, parcel, parcel2, i2)) {
//            return true;
//        }
//        IBinder readStrongBinder;
//        IInterface queryLocalInterface;
//        boolean HC;
//        switch (i) {
//            case 1:
//                startScroll();
//                break;
//            case 2:
//                onScroll(parcel.readFloat());
//                break;
//            case 3:
//                endScroll();
//                break;
//            case u.ACTION_MOVE /*4*/:
//                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c.windowAttached(parcel, WindowManager.LayoutParams.CREATOR);
//                readStrongBinder = parcel.readStrongBinder();
//                if (readStrongBinder != null) {
//                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.libraries.launcherclient.ILauncherOverlayCallback");
//                    if (queryLocalInterface instanceof d) {
//                        dVar = (d) queryLocalInterface;
//                    } else {
//                        dVar = new f(readStrongBinder);
//                    }
//                }
//                windowAttached(layoutParams, dVar, parcel.readInt());
//                break;
//            case u.ACTION_UP /*5*/:
//                windowDetached(c.windowAttached(parcel));
//                break;
//            case u.ACTION_POINTER_1_UP /*6*/:
//                closeOverlay(parcel.readInt());
//                break;
//            case u.PAUSE /*7*/:
//                onPause();
//                break;
//            case 8:
//                onResume();
//                break;
//            case 9:
//                BK(parcel.readInt());
//                break;
//            case 10:
//                oe(c.windowAttached(parcel));
//                break;
//            case 11:
//                String HB = HB();
//                parcel2.writeNoException();
//                parcel2.writeString(HB);
//                break;
//            case /*ModuleDescriptor.MODULE_VERSION*/12 /*12*/://Todo: modified, 12 was always there but the constant was there before
//                HC = HC();
//                parcel2.writeNoException();
//                c.windowAttached(parcel2, HC);
//                break;
//            case 13:
//                HC = cnM();
//                parcel2.writeNoException();
//                c.windowAttached(parcel2, HC);
//                break;
//            case 14:
//                Bundle bundle = (Bundle) c.windowAttached(parcel, Bundle.CREATOR);
//                readStrongBinder = parcel.readStrongBinder();
//                if (readStrongBinder != null) {
//                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.libraries.launcherclient.ILauncherOverlayCallback");
//                    if (queryLocalInterface instanceof d) {
//                        dVar = (d) queryLocalInterface;
//                    } else {
//                        dVar = new f(readStrongBinder);
//                    }
//                }
//                windowAttached(bundle, dVar);
//                break;
//            case 16:
//                BJ(parcel.readInt());
//                break;
//            case 17:
//                HC = windowAttached(parcel.createByteArray(), (Bundle) c.windowAttached(parcel, Bundle.CREATOR));
//                parcel2.writeNoException();
//                c.windowAttached(parcel2, HC);
//                break;
//            default:
//                return false;
//        }
//        return true;
//    }
//}
