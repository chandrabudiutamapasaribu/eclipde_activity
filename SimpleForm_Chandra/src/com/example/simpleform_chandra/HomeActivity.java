package com.example.simpleform_chandra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
public class HomeActivity extends Activity {
	TextView showInformasi ;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Intent intGoToMain = getIntent();
		String[] message = intGoToMain.getStringArrayExtra(MainActivity.MessageMainAct);
		showInformasi = (TextView)findViewById(R.id.tV1Home) ;
		showInformasi.setText("Nama  Anda  \t : " +message[0] +  "\n NIS Anda : "+message[1]); 
		
	}
	public void goToMain(View view ){
		Intent intGoToMain = new Intent(this, MainActivity.class);
		startActivity(intGoToMain);
	}
}
