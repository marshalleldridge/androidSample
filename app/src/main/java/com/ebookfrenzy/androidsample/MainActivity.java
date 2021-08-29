package com.ebookfrenzy.androidsample;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.ebookfrenzy.androidsample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = binding.getRoot();
    setContentView(view);
  }

  public void convertCurrency(View view) {

    if (!binding.dollarText.toString().equals("")) {
      Float dollarValue = Float.valueOf(binding.dollarText.getText().toString());
      Float euroValue = dollarValue * 0.85F;
      binding.convertResult.setText(euroValue.toString());
    } else {
      binding.convertResult.setText(R.string.no_value_string);
    }
  }
}