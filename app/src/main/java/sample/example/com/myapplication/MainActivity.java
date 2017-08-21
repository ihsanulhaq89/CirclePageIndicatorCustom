package sample.example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private int currentPage = 0;
    final private int totalPages = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        setPage(0);



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage++;
                setPage(currentPage%totalPages);
            }
        });

    }

    private void setPage(int currentPage) {
        RadioButton button = (RadioButton) radioGroup.getChildAt(currentPage);
        button.setChecked(true);
    }
}
