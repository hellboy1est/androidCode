package bit.kakkr1.spinnerinstrument;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Bundle;



public class SpinnerActivity extends ActionBarActivity {
	
	//declare control variables
	
	  private RadioGroup instrumentGroup;
	  private RadioButton radioInstrumentButton;
	  private Button btnConfirm;
	  private Spinner spnMonths;
	  
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        
      //run method onCreate
        addListenerOnButton();
    }
        public void addListenerOnButton(){
        
        instrumentGroup=(RadioGroup) findViewById(R.id.rdGroup_Instruments);
    		
    	btnConfirm =(Button) findViewById(R.id.btnEnrol);
        	
    	spnMonths =(Spinner) findViewById(R.id.spnMonths);
    	
        String[] months={"January","February","March","April","May","June","July","August","September","October","November",
                "December" };       
      
        int layoutID=android.R.layout.simple_spinner_item;        
        
        ArrayAdapter<String> monthsAdapter = new ArrayAdapter<String>(this, layoutID, months);
        
        spnMonths.setAdapter(monthsAdapter);       
        
        btnConfirm.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//gets selected radio button id and passes its value to selectedId
        		int selectedId =instrumentGroup.getCheckedRadioButtonId();
        		
        		//selectedId is passes on to radioInstrumentButton
				radioInstrumentButton=(RadioButton) findViewById(selectedId);
				
				//radioInstrument text is passed on to new string chosenInstrument
				String chosenInstrument = radioInstrumentButton.getText().toString();
				
				//gets selected spinner item and passes to new string selectedSpinnerMonth
        		String selectedSpinnerMonth=spnMonths.getSelectedItem().toString();
        		
        		//passes string value of selectedSpinnermonth to string choenRadioMonth
        		String chosenRadioMonth=selectedSpinnerMonth;
        						
				// passes values of spinner and radio to a string and then to the text view        	
				String feedbackString="You are enrolled for " +chosenInstrument +" lessons, starting in "  + chosenRadioMonth;
				
				TextView textViewFeedback =(TextView) findViewById(R.id.txtInstrumentMonths);
				textViewFeedback.setText(feedbackString);
        	
        	}
        	
        });
        }
			      
                
    }  
    