package com.example.a2dfire.base;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

import java.util.List;

/**
 * Created by dh on 2016/11/21.
 */

public class SchemaRouter {

    /**
     * 1、先判断该uri的合法性
     * 2、根据提供的 uri 跳转到能接受该uri的activity
     */
    public static void startActivityWithUri(Context context,String uri){
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        boolean isValid = !activities.isEmpty();
        if (isValid) {
            context.startActivity(intent);
        }
    }
}
