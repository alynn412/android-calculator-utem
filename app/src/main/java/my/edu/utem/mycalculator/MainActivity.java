package my.edu.utem.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int ans = 0;
    TextView num1, num2;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.textResult);
        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
    }

    public void btnAdd(View view) {
        ans = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        txtView.setText(ans+"");
    }

    public void btnSub(View view) {
        ans = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
        txtView.setText(ans+"");
    }

    public void btnDiv(View view) {
        ans = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        txtView.setText(ans+"");
    }

    public void btnMul(View view) {
        ans = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        txtView.setText(ans+"");
    }
}
