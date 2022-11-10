package ftmk.bitp3453.helloclass;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;

import java.util.Calendar;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        DatePickerDialog datePicker;
        ActivityRegistrationBinding binding;
        @Override
                protected void ocCreate(Bundle savedInstanceState){
            super.onCreate(Bundle savedInstanceState);
            binding = ActivityRegistrationBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            binding.edtBirthdate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    fnInvokeDatePicker();
                }
            });
            binnding edtBirthdate.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    fnInvokeDatePicker();
                }
            });
            binding.fabAddUser.setOnclickListener(this,fnAdduser};
    }

    private void fnInvokeDatePicker(){
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);

        datePicker = new DatePickerDialog(RegistrationActivity.this,
                new DatePickerDialog.OnDateSetListener() {
            @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
                binding.edtBirthdate.setText(dayofMonth + "/" (monthOfYear + 1)+ "/" +year);
            }
                });
    },year,month,day);
            datePicker.show();


}