package com.example.a2dfire.businessa;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "Business A";

    private TextView nameTv;

    private String paramNameStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity_main);
        nameTv = (TextView) findViewById(R.id.name_tv);

        getParams(getIntent().getData());

        if (!TextUtils.isEmpty(paramNameStr)) {
            nameTv.setText(nameTv.getText().toString() + "---" + paramNameStr);
        }
    }

    private void getParams(Uri uri) {
        if (uri != null) {
            // 完整的url信息
            String url = uri.toString();
            Log.e(TAG, "url: " + uri);
            // scheme部分
            String scheme = uri.getScheme();
            Log.e(TAG, "scheme: " + scheme);
            // host部分
            String host = uri.getHost();
            Log.e(TAG, "host: " + host);
            //port部分
            int port = uri.getPort();
            Log.e(TAG, "port: " + port);
            // 访问路劲
            String path = uri.getPath();
            Log.e(TAG, "path: " + path);
            List<String> pathSegments = uri.getPathSegments();
            //获取指定参数值
            String name = uri.getQueryParameter("name");
            Log.e(TAG, "name: " + name);
            paramNameStr = name;
        }
    }
}
