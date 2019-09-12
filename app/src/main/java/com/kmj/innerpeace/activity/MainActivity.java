package com.kmj.innerpeace.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.kmj.innerpeace.FragmentUtils;
import com.kmj.innerpeace.R;
import com.kmj.innerpeace.fragment.DiaryFragment;
import com.kmj.innerpeace.fragment.HomeFragment;
import com.kmj.innerpeace.fragment.MusicFragment;
import com.kmj.innerpeace.fragment.PlaylistFragment;
import com.kmj.innerpeace.fragment.ProfileFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ArrayList<Fragment> fragments;
    FragmentUtils fragmentUtils;
    ProfileFragment profileFragment;
    DiaryFragment diaryFragment;
    HomeFragment homeFragment;
    MusicFragment musicFragment;
    PlaylistFragment playlistFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments=new ArrayList<>();
        profileFragment=new ProfileFragment();
        diaryFragment=new DiaryFragment();
        homeFragment=new HomeFragment();
        musicFragment=new MusicFragment();
        playlistFragment=new PlaylistFragment();
        fragments.add(profileFragment);
        fragments.add(diaryFragment);
        fragments.add(homeFragment);
        fragments.add(musicFragment);
        fragments.add(playlistFragment);
        fragmentUtils=new FragmentUtils(R.id.framelayout,fragments);
        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(), 0, new Bundle());
        bottomNavigationView=findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.bottom_profile:
                        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(), 0, new Bundle());
                        return true;
                    case R.id.bottom_diary:
                        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(), 1, new Bundle());
                        return true;
                    case R.id.bottom_home:
                        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(), 2, new Bundle());
                        return true;
                    case R.id.bottom_music:
                        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(), 3, new Bundle());
                        return true;
                    case R.id.bottom_playlist:
                        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(), 4, new Bundle());
                        return true;
                }
                return false;
            }
        });
    }
}
