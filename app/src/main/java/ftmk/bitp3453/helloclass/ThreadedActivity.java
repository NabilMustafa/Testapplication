package ftmk.bitp3453.helloclass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThreadedActivity extends AppCompatActivity {
    ImageView imgVwPic;
    TextView tvGreet;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threaded);

        imgVwPic = findViewById(R.id.imgVwProfile);
        Intent intent = getIntent();

        String strMsg = intent.getStringExtra("varStr1");
        tvGreet = findViewById(R.id.textView);
        tvGreet.setText("Welcome to second Activity"+strMsg);
    }
    public void fnTakePic(View vw)
    {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tvGreet.setText(tvGreet.getText().toString()+"..This is your Picture heheh....");
                    }
                });
            }
        };
        Thread thr = new Thread(run);
        thr.start();
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        
        Bitmap bp = (Bitmap) data.getExtras().get("data");
        iv.setImageBitmap(bp);
    }

}