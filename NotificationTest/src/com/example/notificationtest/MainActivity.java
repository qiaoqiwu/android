package com.example.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button sendNotice;
	private Notification note;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sendNotice = (Button) findViewById(R.id.send_notice);
		sendNotice.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.send_notice:
			NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
			Notification.Builder builder = new Notification.Builder(this).setTicker("This is ticker text").setSmallIcon(R.drawable.ic_launcher);
			//notification.setLatestEventInfo(this, "This is content title", "This is content text", null);
			Intent intent = new Intent(this, NotificationActivity.class);
			PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
			note = builder.setContentIntent(pi).setContentTitle("This is content title").setContentText("This is content text").build();
			manager.notify(1, note);
			break;
		default:
			break;
		}
	}
}
