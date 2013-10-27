package com.shunix.cleargpscache.widget;

import com.shunix.cleargpscache.R;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class ClearGPSCacheWidget extends AppWidgetProvider {

	private static final String UPDATE_ACTION = "com.shunix.cleargpscachewidget.UPDATE_APP_WIDGET";
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		for (int i = 0; i < appWidgetIds.length; ++i) {
			Intent intent = new Intent();
			intent.setAction(UPDATE_ACTION);
			PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
			RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
					R.layout.widget_layout);
			remoteViews.setOnClickPendingIntent(R.id.reset, pendingIntent);
			appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
		}
	}
	
	@Override
	public void onReceive(Context context, Intent intent) {
		super.onReceive(context, intent);
		if(intent.getAction().equals(UPDATE_ACTION)) {
			System.out.println(intent.getAction());
		}
	}
	
	

}
