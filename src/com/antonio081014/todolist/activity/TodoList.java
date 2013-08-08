package com.antonio081014.todolist.activity;
import android.app.Application;

import com.kii.cloud.storage.Kii;

/**
 * 
 */

/**
 * @author antonio081014
 * 
 */
public class TodoList extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		// initialize the Kii SDK!
		Kii.initialize("c8ac240c", "e731f6e3fb7625c44b8a8dd25191c225",
				Kii.Site.US);
	}
}
