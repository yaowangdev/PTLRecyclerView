package com.mrw.wzmrecyclerview.PullToLoad;

import android.content.Context;
import android.view.View;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Administrator on 2016/9/28.
 */
public  abstract class LoadFooterCreator {

    /**
     * 上拉
     * @param distance 距离
     * @return 是否继续上拉
     */
    public abstract boolean onStartPull(float distance,int lastState);

    /**
     * 松手加载
     * @param distance 距离
     * @return 是否继续上拉
     */
    public abstract boolean onReleaseToLoad(float distance,int lastState);

    /**开始加载*/
    public abstract void onStartLoading();

    /**加载结束*/
    public abstract void onStopLoad();


    public abstract View getLoadView(Context context, RecyclerView recyclerView);

}
