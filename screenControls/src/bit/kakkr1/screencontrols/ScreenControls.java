package bit.kakkr1.screencontrols;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.os.Bundle;




public class ScreenControls extends ActionBarActivity {

	//declare control variables
	
	  private RadioGroup instrumentGroup;
	  private RadioButton radioInstrumentButton;
	  private Button btnConfirm;
	
		
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_controls);
        
      
        //run method onCreate
        
        addListenerOnButton();
        
	}
	
	public void addListenerOnButton(){
		
		//initialize variables
		instrumentGroup=(RadioGroup) findViewById(R.id.rdGroup_Instruments);
		
		btnConfirm =(Button) findViewById(R.id.btnConfirm);
		
		btnConfirm.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v) {
				//gets selected radio button id and passes its value to selectedId
				
				int selectedId =instrumentGroup.getCheckedRadioButtonId();
				
				//selectedId is passes on to radioInstrumentButton
				radioInstrumentButton=(RadioButton) findViewById(selectedId);
				
				//radioInstrument text is passed on to new string chosenInstrument
				String chosenInstrument = radioInstrumentButton.getText().toString();
				
				String feedbackString="You have enrolled for " + chosenInstrument + " lessons";
				TextView textViewFeedback =(TextView) findViewById(R.id.txtInstrument);
				textViewFeedback.setText(feedbackString);
				
			}
			
			
			
			
		
			
	});
	
	
	}}
	
