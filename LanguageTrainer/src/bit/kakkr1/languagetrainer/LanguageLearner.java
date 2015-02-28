package bit.kakkr1.languagetrainer;

import java.util.Random;


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.res.Resources;
import android.os.Bundle;



public class LanguageLearner extends ActionBarActivity {

    
    private Button btnRand;
    private RadioGroup NounGroup;
	private RadioButton radioNounButton;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_learner);
        
        // runs method on start
        addListenerOnButton();
    }
    	// method created
        public void addListenerOnButton()
        {
        
        NounGroup=(RadioGroup) findViewById(R.id.rdGroupNoun);
        
        //button variable initialized	
        btnRand=(Button) findViewById(R.id.btnRandom);
        
        // button variable is given on click listener
        btnRand.setOnClickListener(new OnClickListener(){
    	   
        	// on click method is created
    	   public void onClick(View v) {
    		   
    	        // get resources to access images in drawable folder
    		   Resources resources=getResources();
    		   
    		   // Random variable declared 
    		   Random rand=new Random();
    		   
    		   // images names are given in an string array
    		   String[] photos={"der_baum","der_stuhl","der_apfel","die_hexe","die_ente","die_kuh","die_milch","die_strasse","das_auto","das_haus","das_schaf"};
    		   
    		  // String[] nouns={"Apfel","Auto","Baum","Ente","Haus","Hexe","Kuh","Milch","Schaf","Strase","Stuhl"};
    		   
    		   String[] article={"Der","Der","Der","Die","Die","Die","Die","Die","Das","Das","Das"};
    		   
    		   
    		   
    		   //for loop to get images length
    		   
        for(int i=0;i< photos.length;i++)
        
        {
        	
        	
        // images are passed in random variable and integer variable holds that value	
        int pic=rand.nextInt(photos.length);
        
        int resourceID=resources.getIdentifier(photos[pic], "drawable", getPackageName());
        
        ImageView ivDisplay=(ImageView) findViewById(R.id.ivDisplay);        
   
        ivDisplay.setImageResource(resourceID);
        
        int selectedId=NounGroup.getCheckedRadioButtonId();
        
        radioNounButton=(RadioButton) findViewById(selectedId);
 	   
 	    String chosenNoun = radioNounButton.getText().toString();
 	  
 	    
 	    	   
 	    
 	    
 	   
 
                 
        
               
 	   
	   
        }
	   
	   
    }
       });
}
}