package huyoy.project.makoil02;



import static androidx.navigation.ui.BottomNavigationViewKt.setupWithNavController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import huyoy.project.makoil02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navMain();
    }

    private void navMain() {
        NavHostFragment navHostFragment= (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController= navHostFragment.getNavController();
        BottomNavigationView bottomNavigationView= findViewById(R.id.bottomNavigationView);
        setupWithNavController(bottomNavigationView,navController);

    }
}