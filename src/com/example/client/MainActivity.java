package com.example.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.lpchat.LpChatActivity;
import com.example.lpchat.LpChatManager;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button contactButton = (Button) findViewById(R.id.contactButton);
		contactButton.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				startChat();						//Start chat when user presses button
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private void startChat()
	{
		LpChatManager.run((Activity) this);			//Run chat manager
	}
}