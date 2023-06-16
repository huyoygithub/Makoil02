package huyoy.project.makoil02.view.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import huyoy.project.makoil02.MainActivity;
import huyoy.project.makoil02.R;
import huyoy.project.makoil02.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
    private ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        nextAct();
    }

    private void nextAct() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finishAffinity();
            }
        },2000);
    }
}