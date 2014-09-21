package in.wptrafficanalyzer.viewpagerdemo;

import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class NotiHandler extends Activity implements android.view.View.OnClickListener{

	Button b;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noti_handler);
        b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.button1)
		{
			startActivity(new Intent(getApplicationContext(), DeveloperFragment.class));
		}
	}
}
