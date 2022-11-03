package ftmk.bitp3453.helloclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {


    TextView txtvwAge;
    EditText edtName,edtYear;
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        txtvwAge = (TextView) findViewById(R.id.txtvwAge);
        edtName = (EditText) findViewById(R.id.edtTxtName);
        edtName = (EditText) findViewById(R.id.edtYear);

    }
    public void fnGreet(View vw)
    {
        String strName = edtName.getText() .toString();
        txtvwAge.setText("Hellooo and welcome " + strName);
    }
}
