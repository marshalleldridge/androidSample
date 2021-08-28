package com.ebookfrenzy.androidsample;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void convertCurrency(View view) {
    EditText dollarText = findViewById(R.id.dollar_text);
    TextView result = findViewById(R.id.convert_result);

    if (!dollarText.getText().toString().isEmpty()) {
      Float dollarValue = Float.valueOf(dollarText.getText().toString());
      Float euroValue = dollarValue * 0.85F;
      result.setText(euroValue.toString());
    } else {
      result.setText(R.string.no_value_string);
    }
  }
}