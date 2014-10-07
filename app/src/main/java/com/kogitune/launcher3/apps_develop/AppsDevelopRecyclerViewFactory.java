package com.kogitune.launcher3.apps_develop;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by takam on 2014/09/28.
 */
public class AppsDevelopRecyclerViewFactory {

    public RecyclerView newInstance(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setHasFixedSize(true);

        // LinearLayoutManagerを使用する
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        return recyclerView;
    }
}
