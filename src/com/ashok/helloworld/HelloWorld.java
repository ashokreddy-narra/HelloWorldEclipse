package com.ashok.helloworld;

import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;

public class HelloWorld extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helloworld);
	}

}
