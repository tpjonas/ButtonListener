package cimdata.android.dez2017.buttonlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView outputText;
    Button anonymClassBtn;
    Button activityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       outputText = findViewById(R.id.txt_output);
       anonymClassBtn = findViewById(R.id.btn_02);
       activityBtn = findViewById(R.id.btn_03);

       // 2. Methode: anonyme Klasse: Ein Objekt als Button Listener:
        anonymClassBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                outputText.setText("Anonym");
            }
        });

        // 3. Methode: Die Activity selbst als Listener:
        activityBtn.setOnClickListener(this);
    }

    // 1. Methode: via defined function
    public void onXMLButtonClick(View view) {

        System.out.println("foobar"); // Java output
        Log.i("AB -- " + this.getLocalClassName(), "my comment"); // Android Log
        outputText.setText("XML");

    }

    // Die Methode, die aufgerufwen wird, wenn auf den 3ten Button geklickt wird.
    @Override
    public void onClick(View view) {
        outputText.setText("Activity");
    }


    // inner class > nutzen dann aber anonyme klasse
    private class MyBtnListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            outputText.setText("Anonym");
        }

    }



}