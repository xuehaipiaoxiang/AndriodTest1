package com.example.application4;

import android.app.DownloadManager;
import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkHttpPost {

    final private String TAG="======OkHttpHelper=======";
    private HttpUrl url;
    private OkHttpClient okHttpClient;
    private Request request;

    private String GROUPIDvalue;
    private String XHvalue;
    private String Vvalue;


    private String urlStr,parameter;


    public OkHttpPost(String urlStr,String parameter) {
        // default is POST FORM


        this.urlStr = urlStr;
        this.parameter = parameter;
    }


    public void setValue(String GROUPIDvalue,String XHvalue,String vvalue) {

        this.GROUPIDvalue=GROUPIDvalue;
        this.XHvalue = XHvalue;
        this.Vvalue = vvalue;
    }

    private void debugUse(String info){

        Log.d(TAG,info);
    }


    public void  doConnect(){
        //MediaType mediaType =MediaType.parse("text/x-markdown; charset=utf-8");

        url= new HttpUrl.Builder().scheme("http")
                .host(urlStr).addPathSegment(parameter).build();

        RequestBody requestBody =new FormBody.Builder()
                .add("GROUPID",GROUPIDvalue)
                .add("XH",XHvalue)
                .add("VALUE",Vvalue)
                .build();
        Request request = new Request.Builder().url(url).post(requestBody).build();

        okHttpClient =new OkHttpClient();

        okHttpClient.newCall(request).enqueue(new Callback() {
                                                  @Override
                                                  public void onFailure(Call call, IOException e) {
                                                      Log.d(TAG,"onFailure");
                                                  }

                                                  @Override
                                                  public void onResponse(Call call, Response response) throws IOException {
                                                      Log.d(TAG,"response");
                                                      String tmp=response.toString();
                                                      Log.d(TAG,tmp);
                                                  }
                                              }
        );

    }

}
