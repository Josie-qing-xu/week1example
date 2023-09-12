package algonquin.cst2335.week1example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // sample as public static void main

    @Override // app starts here
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //this is the only function call, loads stuff onto screen
        setContentView(R.layout.activity_main);
    }
}