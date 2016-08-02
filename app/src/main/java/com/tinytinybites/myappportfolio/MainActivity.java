package com.tinytinybites.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Ui Elements
    private TextView mProjectPopularMoviesTv;
    private TextView mProjectStockHawkTv;
    private TextView mProjectBuildItBiggerTv;
    private TextView mProjectMaterialTv;
    private TextView mProjectGoUbiquitousTv;
    private TextView mProjectCapstoneTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProjectPopularMoviesTv = (TextView) findViewById(R.id.projectPopularMovies);
        mProjectStockHawkTv = (TextView) findViewById(R.id.projectStockHawk);
        mProjectBuildItBiggerTv = (TextView) findViewById(R.id.projectBuildItBigger);
        mProjectMaterialTv = (TextView) findViewById(R.id.projectMaterial);
        mProjectGoUbiquitousTv = (TextView) findViewById(R.id.projectGoUbiquitous);
        mProjectCapstoneTv = (TextView) findViewById(R.id.projectCapstone);

        //Set On click
        mProjectPopularMoviesTv.setOnClickListener(this);
        mProjectStockHawkTv.setOnClickListener(this);
        mProjectBuildItBiggerTv.setOnClickListener(this);
        mProjectMaterialTv.setOnClickListener(this);
        mProjectGoUbiquitousTv.setOnClickListener(this);
        mProjectCapstoneTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String appName = null;

        switch(v.getId()){
            case R.id.projectBuildItBigger:{
                appName = getString(R.string.application_listing_project_build_it_bigger);
                break;
            }
            case R.id.projectCapstone:{
                appName = getString(R.string.application_listing_project_capstone);
                break;
            }
            case R.id.projectGoUbiquitous:{
                appName = getString(R.string.application_listing_project_go_ubiquitous);
                break;
            }
            case R.id.projectMaterial:{
                appName = getString(R.string.application_listing_project_make_your_app_material);
                break;
            }
            case R.id.projectPopularMovies:{
                appName = getString(R.string.application_listing_project_popular_movies);
                break;
            }
            case R.id.projectStockHawk:{
                appName = getString(R.string.application_listing_project_stock_hawk);
                break;
            }
        }

        if(appName != null){
            Toast.makeText(MainActivity.this, String.format(getString(R.string.application_listing_button_toast), appName), Toast.LENGTH_SHORT).show();
        }
    }
}
