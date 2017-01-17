package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 17/01/2017.
 */

public class WordsActivity extends AppCompatActivity {

    EditText phraseEditText;
    Button countButton;
    WordCount wordCount;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phraseEditText = (EditText)findViewById(R.id.phrase_text);
        countButton = (Button)findViewById(R.id.count_button);
        wordCount = new WordCount();

        intent = new Intent(WordsActivity.this, CountActivity.class);

        Log.d(getClass().toString(), "onCreate got called");
    }

    public void onCountButtonPressed(View button){
        Log.d(getClass().toString(),phraseEditText.getText().toString());

        //WordCount wordCount = new WordCount();
        wordCount.splitPhrase(phraseEditText.getText().toString());

        intent.putExtra("count",wordCount.getSize());

        startActivity(intent);
    }
}
