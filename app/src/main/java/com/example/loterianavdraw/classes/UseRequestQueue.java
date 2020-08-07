package com.example.loterianavdraw.classes;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class UseRequestQueue{

    private static UseRequestQueue instance;
    private RequestQueue requestQueue;
    private static Context context;

    private UseRequestQueue(Context context) {
        UseRequestQueue.context = context;
        requestQueue = getRequestQueue();
    }

    public static UseRequestQueue getInstance(Context context) {
        if (instance == null) {
            instance = new UseRequestQueue(context);
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

}

