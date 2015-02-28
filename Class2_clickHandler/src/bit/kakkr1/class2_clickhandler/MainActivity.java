package bit.kakkr1.class2_clickhandler;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	
	public class ButtonChangeDisplayClickHandler implements OnClickListener
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this,"Normal Click", Toast.LENGTH_LONG).show();
			

		}
		
	}
	
	public class ButtonLongDisplay implements OnLongClickListener
	{

		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stub
			
			Toast.makeText(MainActivity.this,"Long Click", Toast.LENGTH_LONG).show();
			return false;
		}
				
	}
		
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

		Button btn = (Button) findViewById(R.id.btnEventTester);

		ButtonChangeDisplayClickHandler handler=new ButtonChangeDisplayClickHandler();
		
		btn.setOnClickListener(handler);

		ButtonLongDisplay handlerLong=new ButtonLongDisplay();
		
        btn.setOnLongClickListener(handlerLong);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
