package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class CountActivity extends AppCompatActivity{

    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_count);
        countText = (TextView)findViewById(R.id.phrase_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String count = extras.getString("count");

        countText.setText(count);

        Log.d(getClass().toString(),"Count activity onCreate");
    }
}
