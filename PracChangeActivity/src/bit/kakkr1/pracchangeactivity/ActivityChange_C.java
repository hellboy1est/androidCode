package bit.kakkr1.pracchangeactivity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityChange_C extends ActionBarActivity {
	private Button btnActivityC;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_change__c);
		
		addListenerOnButton();	
		
	}
	public void addListenerOnButton()
	
	{
		
		btnActivityC=(Button) findViewById(R.id.btnA);
		 
		 btnActivityC.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Uri goSeeMonkey=Uri.parse("http://www.disney.com");
				Intent mickeyContent =new Intent(Intent.ACTION_VIEW,goSeeMonkey	);
				
				startActivity(mickeyContent);
				
				
				
			}
		 
		
		
	});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_change__c, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
