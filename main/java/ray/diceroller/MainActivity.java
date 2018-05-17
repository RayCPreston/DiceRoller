package ray.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.txtResult);

    }

    public void rollDice(View v) {
        int rand;
        EditText editNum = (EditText) findViewById(R.id.editTextNumDie);
        String numStr = editNum.getText().toString();
        int numDie = Integer.parseInt(numStr);

        switch(v.getId()) {
            case R.id.btnD4: rand = 4;
                break;
            case R.id.btnD6: rand = 6;
                break;
            case R.id.btnD8: rand = 8;
                break;
            case R.id.btnD10: rand = 10;
                break;
            case R.id.btnD12: rand = 12;
                break;
            case R.id.btnD20: rand = 20;
                break;
            case R.id.btnD100: rand = 100;
                break;
            default: rand = 0;
                break;
        }

        if(rand == 0) {
            System.out.println("--Error with dice selection--");
            tv.setText(rand);
        }

        int result = 0;
        for (int i = 0; i < numDie; i++) {
            int temp = ThreadLocalRandom.current().nextInt(1, rand + 1);
            result += temp;
        }

        tv.setText(String.valueOf(result));
    }

    /*public void rollDice(int numDie, String die) {
        int rand;

        switch(die) {
            case "d4": rand = 4;
                break;
            case "d6": rand = 6;
                break;
            case "d8": rand = 8;
                break;
            case "d10": rand = 10;
                break;
            case "d12": rand = 12;
                break;
            case "d20": rand = 20;
                break;
            case "d100": rand = 100;
                break;
            default: rand = 0;
                break;
        }

        if(rand == 0) {
            System.out.println("--Error with dice selection--");
            tv.setText(rand);
        }

        int result = 0;
        for (int i = 0; i < numDie; i++) {
            int temp = ThreadLocalRandom.current().nextInt(1, rand + 1);
            result += temp;
        }

        tv.setText(result);
    }*/

    public void changeText(View v, String val){
        tv.setText(val);
    }


}
