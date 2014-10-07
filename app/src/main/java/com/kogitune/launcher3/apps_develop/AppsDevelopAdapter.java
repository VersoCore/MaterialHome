package com.kogitune.launcher3.apps_develop;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by takam on 2014/09/28.
 */

public class AppsDevelopAdapter extends RecyclerView.Adapter<AppsDevelopAdapter.ViewHolder>{
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }
}
