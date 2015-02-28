package bit.kakkr1.donttype;


import android.support.v7.app.ActionBarActivity;
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
			//@ is pressed on key down(1st message show up) and key up is released(again message show up
			//without action_up message show up twice
	if ((keyCode ==KeyEvent.KEYCODE_AT) && (event.getAction()==KeyEvent.ACTION_UP))
	{
		Toast.makeText(MainActivity.this, "Dont type @", Toast.LENGTH_LONG).show();
			
	}	
	
			return false;
			
			
		}
				
	}
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       EditText txtDont=(EditText)findViewById(R.id.txtAt); 
       
       KeyTypeHandler handler=new KeyTypeHandler();
       
       txtDont.setOnKeyListener(handler);
        
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
