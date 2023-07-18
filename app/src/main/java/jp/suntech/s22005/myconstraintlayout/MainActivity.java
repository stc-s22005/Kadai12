package jp.suntech.s22005.myconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btsend = findViewById(R.id.btSend);
        btsend.setOnClickListener(new ButonClickListener());
        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(new ButonClickListener());
    }
    private class ButonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Snackbar.make(v, "Snackbar Sample", Snackbar.LENGTH_LONG).show();
        }
    }

    }