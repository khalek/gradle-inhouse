package se.softhouse.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "se.softhouse.android.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendMessage(View view) {
    	Intent intent = new Intent(this, PalindromeTestActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	Word word = new Word(editText.getText().toString());
    	
    	String message = "The word " + word.getContent() +
    				" is" + (word.isPalindrome() ? "" : " not") +
    				" a palindrome";
    	
    	
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
}
