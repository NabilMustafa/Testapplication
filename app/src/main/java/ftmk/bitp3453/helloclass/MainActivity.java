package ftmk.bitp3453.helloclass;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import ftmk.bitp3453.helloclass.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    //Declare

    TextView txtVw1;
    Button buttonRegistration, buttonRecyclerView, buttonFirstActivity, buttonSecondActivityCam;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    ActivityMainBinding binding;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Initialize

        buttonRegistration = (Button) findViewById(R.id.buttonRegistration);
        buttonFirstActivity = (Button) findViewById(R.id.buttonFirstActivity);
        buttonRecyclerView = (Button) findViewById(R.id.buttonRecyclerView);
        txtVw1 = findViewById(R.id.textView);


        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        actionBarDrawerToggle.syncState();

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.nav_menu);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()){
                    case R.id.nav_main_activity:
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.nav_settings:
                        Toast.makeText(getApplicationContext(), "You navigated to Setting screen", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_camera_activity:
                        intent = new Intent(getApplicationContext(), ThreadedActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.nav_logout:
                        Toast.makeText(getApplicationContext(), "You are logged out! See ya !", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }

            }

        });
    }


    public void fnRegistration(View vw) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void fnRecyclerView(View vw) {
        Intent intent = new Intent(this, StudentMainActivity.class);
        startActivity(intent);
    }

    public void fnFirstActivity(View vw) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void fnChangeText(View view) {
        txtVw1.setText("Yeeha it changes");
    }
}