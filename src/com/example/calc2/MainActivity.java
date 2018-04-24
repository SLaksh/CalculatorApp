package com.example.calc2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq;
	EditText et;
	int val1,val2;
	boolean add,sub,div,mul;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		  b1=(Button) findViewById(R.id.one);
		  b2=(Button) findViewById(R.id.two);
		  b3=(Button) findViewById(R.id.three);
		  b4=(Button) findViewById(R.id.four);
		  b5=(Button) findViewById(R.id.five);
		  b6=(Button) findViewById(R.id.six);
		  b7=(Button) findViewById(R.id.seven);
		  b8=(Button) findViewById(R.id.eight);
		  b9=(Button) findViewById(R.id.nine);
		  b0=(Button) findViewById(R.id.zero);
		  bdot=(Button) findViewById(R.id.cancel);
		  badd=(Button) findViewById(R.id.add);
		  bsub=(Button) findViewById(R.id.sub);
		  bmul=(Button) findViewById(R.id.mul);
		  bdiv=(Button) findViewById(R.id.divide);
		  beq=(Button) findViewById(R.id.equal);
		  
		  et=(EditText) findViewById(R.id.editText1);
		  
		  b1.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"1");
		   }
		  });
		  
		  b2.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"2");
		    //this is equivalent to the same
		    //et.setText(et.getText.toString() +((Button)view).getText().toString());
		   }
		  });
		  
		  b3.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"3");
		   }
		  });
		  
		  b4.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"4");
		   }
		  });
		  
		  b5.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"5");
		   }
		  });
		  
		  b6.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"6");
		   }
		  });
		  
		  b7.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"7");
		   }
		  });
		  
		  b8.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		   
		    et.setText(et.getText()+"8");
		   }
		  });
		  
		  b9.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"9");
		   }
		  });
		  
		  b0.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+"0");
		   }
		  });
		  
		  bdot.setOnClickListener(new View.OnClickListener() {
		   @Override
		   public void onClick(View v) {
		    
		    et.setText(et.getText()+".");
		   }
		  });
		  
		 badd.setOnClickListener(new View.OnClickListener() {		  
		  @Override
		  public void onClick(View v)
		  {
		   val1=Integer.parseInt(et.getText()+"");
		   add=true;
		   et.setText(null);
		  }
		 });
		 
		bsub.setOnClickListener(new View.OnClickListener() {
		  
		  @Override
		  public void onClick(View v) {
		   val1=Integer.parseInt(et.getText()+"");
		   sub=true;
		   et.setText(null);
		  }
		 });
		
		bdiv.setOnClickListener(new View.OnClickListener() {
		 
		 @Override
		 public void onClick(View v) {
		  val1=Integer.parseInt(et.getText()+"");
		  div=true;
		  et.setText(null);
		 }
		});
		
		bmul.setOnClickListener(new View.OnClickListener() {
		 
		 @Override
		 public void onClick(View v) {
		  val1=Integer.parseInt(et.getText()+"");
		  mul=true;
		  et.setText(null);
		 }
		});
		 
		beq.setOnClickListener(new View.OnClickListener() {		 
		 @Override
		 public void onClick(View v) 
		 {
		  val2=Integer.parseInt(et.getText()+"");
		  if (add==true) {
		   et.setText(val1+val2+"");
		   add=false; 
		  }
		  if (sub==true) {
		   et.setText(val1-val2+"");
		   sub=false; 
		  }
		  if (mul==true) {
		   et.setText(val1*val2+"");
		   mul=false; 
		  }
		  if (div==true) {
		   et.setText(val1/val2+"");
		   div=false; 
		  }
		 }
		 
		});	
	}}
