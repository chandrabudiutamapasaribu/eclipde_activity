package com.example.simpleform_chandra;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug.IntToString;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
																										

public class MainActivity extends Activity {
	

	TextView output;
	Button btnsimpan;
	EditText nama ,nis;
	public static final String MessageMainAct = "MessageMainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		output=(TextView)findViewById(R.id.textView1);
		nama=(EditText)findViewById(R.id.editText1);
		nis=(EditText)findViewById(R.id.editText2);
		btnsimpan=(Button)findViewById(R.id.btnsimpan);
		
	}

	public void btnSimpan(View view){
		output.setText("Nama Lengkap Anda \t : " + nama.getText().toString()+"\n NIS Anda \t : "+nis.getText().toString());
	}
	public void goToHome(View view){
		//code untuk mengarahkan ke home 
		Intent intGoToHome = new Intent(this,HomeActivity.class);
	
		String[] message  = {
		                     nama.getText().toString(),
		                     nis.getText().toString()
							};
	
		
		intGoToHome.putExtra(MessageMainAct, message);
		startActivity(intGoToHome);
	}
}
