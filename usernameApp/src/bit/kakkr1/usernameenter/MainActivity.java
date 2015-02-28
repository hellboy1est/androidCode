package bit.kakkr1.usernameenter;


import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	public class KeyTypeHandler implements OnKeyListener
	
	{
		@Override
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			// TODO Auto-generated method stub
			//if(KeyEvent.ACTION_DOWN != event.getAction())
				//return false;
			
			if ((keyCode == KeyEvent.KEYCODE_ENTER)&& (event.getAction()==KeyEvent.ACTION_UP))
			{
				//int viewID=v.getId();
				
				//EditText etInput=(EditText) findViewById(viewID);
				
				//String userName=etInput.getText().toString();
				
				EditText txtUserName=(EditText)findViewById(R.id.txtUser);
				
				Editable userName=txtUserName.getText();
				
				if(userName.length()!=8)
				{
					
					Toast.makeText(MainActivity.this, "Username must be 8 chracters long, " +userName.toString(),Toast.LENGTH_LONG).show();
					//txtUserName.setText("less Then 8");
					//Toast toast=new Toast (MainActivity.this);
					//toast.show();
					return true;
					
				}
				else
				{					
					Toast.makeText(MainActivity.this, "Thank You, " + userName.toString(), Toast.LENGTH_LONG).show();
					return true;
				}
			}			
			
			return false;
		}
				
	}	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
        
		
        EditText txtUserName=(EditText)findViewById(R.id.txtUser);
				
		KeyTypeHandler handler=new KeyTypeHandler();
	      
	    txtUserName.setOnKeyListener(handler);		
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
