package bit.kakkr1.helloworld;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class HelloWorld extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        
        
        TextView txtRandomString = (TextView) findViewById(R.id.txtDisplay);
        
        String dogBreed="";

        Random rGen =new Random();
        int dogValue=rGen.nextInt(4);

        switch(dogValue)
        {
        
        case 0:
        	dogBreed="Poodle";
        	break;
        case 1:
        	dogBreed="Labrador";
        	break;
        case 2:
        	dogBreed="Shar Pei";
        	break;
        case 3:
        	dogBreed="Newfoundland";
        	break;
        
        }
        txtRandomString.setText(dogBreed);
        
        
        // Get the reference to the TextView via its id, as stored in R
        TextView txtMainDisplay =(TextView)findViewById(R.id.txtMainDisplay);
        
        // Create a Resource object
        Resources resourceResolver=getResources();
        
        //Pass the resource id of your colour (stored in R) to your Resources object, to get the actual value
        int textColorCode=resourceResolver.getColor(R.color.blueForText);
        
        //Assign it
        txtMainDisplay.setTextColor(textColorCode);
        
    }



    
}
