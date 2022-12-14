package ftmk.bitp3453.helloclass;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ftmk.bitp3453.helloclass.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {


    TextView txtvwAge;
    EditText edtName,edtYear;
    Button btnClick;

    ActivityFirstBinding binding;
    ActivityResultLauncher<Intent> launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        txtvwAge = (TextView) findViewById(R.id.txtvwAge);
        edtName = (EditText) findViewById(R.id.edtTxtName);
        edtYear = (EditText) findViewById(R.id.edtYear);

    }
    public void fnGreet(View vw)
    {
        String strDate = edtYear.getText().toString();
        int number = Integer.parseInt(strDate);
        int strAge = (2022 - number);

        String strName = edtName.getText().toString();
        txtvwAge.setText("Hellooo and welcome " + strName +"."+" You are "+ strAge);
    }
    public void fnThreadActivity(View vw)
    {
        Intent intent = new Intent(this,ThreadedActivity.class);
        String strMsg = edtName.getText().toString();
        intent.putExtra("varStr1",strMsg);
        startActivity(intent);
    }
}
