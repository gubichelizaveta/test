package bgtu.by.for_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import bgtu.by.for_github.test_pack.test_class;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //displayText();
        for (int k = 0; k < 10; k++) {
            Log.d("MainActivity", " counter =" + k);
        }
    }
    private void displayText() {
        test_class tf = new test_class();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(tf.getValue());
    }
}