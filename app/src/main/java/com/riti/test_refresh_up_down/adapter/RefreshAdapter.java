package com.riti.test_refresh_up_down.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.riti.test_refresh_up_down.R;

/**
 * Created by YZBbanban on 2018/3/1.
 */

public class RefreshAdapter extends BaseRecyclerViewAdapter<String> {
    public RefreshAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_refresh, parent, false);
        RefreshViewHolder refreshViewHolder = new RefreshViewHolder(view);
        return refreshViewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        String name = getList().get(position);
        RefreshViewHolder refreshViewHolder = (RefreshViewHolder) holder;
        refreshViewHolder.tv.setText(name);
    }

    class RefreshViewHolder extends BaseViewHolder {
        TextView tv;

        public RefreshViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
