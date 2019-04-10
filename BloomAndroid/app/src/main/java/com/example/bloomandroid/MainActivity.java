package com.example.bloomandroid;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final HomeFragment homeFragment = new HomeFragment();
        final FavoritesFragment favoritesFragment = new FavoritesFragment();
        final TicketsFragment ticketsFragment = new TicketsFragment();
        final AccountFragment accountFragment = new AccountFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();
                if(id == R.id.home){
                    setFragment(homeFragment);
                    return true;
                } else if(id == R.id.favorites){
                    setFragment(favoritesFragment);
                    return true;
                } else if(id == R.id.tickets){
                    setFragment(ticketsFragment);
                    return true;
                } else if(id == R.id.account) {
                    setFragment(accountFragment);
                    return true;
                }
                return false;
            }
        });
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}
