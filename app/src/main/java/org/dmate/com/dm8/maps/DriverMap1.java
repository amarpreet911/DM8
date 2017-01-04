package org.dmate.com.dm8.maps;


import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.dmate.com.dm8.CardAdapter;
import org.dmate.com.dm8.CardInfo;
import org.dmate.com.dm8.R;

import java.util.ArrayList;
import java.util.List;


public class DriverMap1 extends FragmentActivity implements OnMapReadyCallback{
    public GoogleMap mMap;
    private RecyclerView recycleView;
    private RecyclerView.Adapter recycleAdapter;
    private RecyclerView.LayoutManager recycleLayoutManager;
    public List<CardInfo> listCard;
    /*private MyOnClickListner = myOnClickListner;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_page);
        recycleView();


        // specify an adapter (see also next example)
      //The adapter provides access to the items in your data set, creates views for items, and
        // replaces the content of some of the views with new data items when the original
        // item is no longer visible.
      /*  mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);*/
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        System.out.println("reached map");
    }

        public void recycleView(){

            /*myOnClickListner = new MyOnClickListner(this);*/
            recycleView = (RecyclerView) findViewById(R.id.my_recycler_view);
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            recycleView.setHasFixedSize(true);
            // use a linear layout manager //this horizontal setup did the trickk for me
            recycleLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            recycleView.setLayoutManager(recycleLayoutManager);



            recycleView.setItemAnimator(new DefaultItemAnimator());
            initializeCardData();
            initiateAdapter();

        }

   private void initializeCardData() {
        listCard = new ArrayList<>();
        listCard.add(new CardInfo("Guru_Gobind ", "Singh"));
        listCard.add(new CardInfo("Wahe", " Guru"));
       listCard.add(new CardInfo("Guru_Gobind ", "Singh"));
       listCard.add(new CardInfo("Wahe", " Guru"));
    }
    private void initiateAdapter(){
        recycleAdapter = new CardAdapter(listCard);
        recycleView.setAdapter(recycleAdapter);
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
       System.out.println("reached on map ready");
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}
