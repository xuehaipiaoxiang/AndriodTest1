package com.example.application4;


import android.util.Log;

import java.io.IOException;
import java.net.URL;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

import okhttp3.Request;
import okhttp3.Response;

public class OkHttpHelper {

    final private String TAG="======OkHttpHelper=======";
    private HttpUrl url;
    private OkHttpClient okHttpClient;
    private Request request;


    public OkHttpHelper(String urlStr,String parameter){
        // default is GET
        url= new HttpUrl.Builder().scheme("http").host(urlStr).addPathSegments(parameter).build();


        okHttpClient =new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
                         @Override
                         public void onFailure(Call call, IOException e) {
                             Log.d(TAG,"onFailure");
                         }

                         @Override
                         public void onResponse(Call call, Response response) throws IOException {
                             Log.d(TAG,"response");
                             Log.d(TAG,response.toString());
                         }
                     }
        );
    }

    private void debugUse(String info){

        Log.d(TAG,info);
    }



}
