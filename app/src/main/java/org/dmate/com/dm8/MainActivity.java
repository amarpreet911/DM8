package org.dmate.com.dm8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Switch;
import android.widget.LinearLayout;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {


Switch selSwRes;
    Switch selSwDri;
    LinearLayout laysignUpSelect;
Boolean selSwState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("reached goal");
      /*  initialAnim();
        selInitGrp();
        selSwRes.setChecked(false);
        selSwDri.setChecked(false);
        System.out.println("end");*/
      //  counter.animate().rotation(36000f);//.setDuration(2000);
    }
   /* private void initialAnim(){
        laysignUpSelect = (LinearLayout) findViewById(R.id.laySignUpSel);
        laysignUpSelect.setTranslationY(-1000f);
        laysignUpSelect.animate().translationYBy(1000f).setDuration(900);
    }
        public void selInitGrp(){
             selSwRes = (Switch) findViewById(R.id.sel_sw_res);
          //  selSwRes.setOnClickListener();
            selSwDri = (Switch) findViewById(R.id.sel_sw_driv);
            //selSwDri.setOnClickListener();
            System.out.println("reached init grp");
                }
       public void selSwitch(View view){
           System.out.println("reached selswitch");
            selInitGrp();

           switch(view.getId())
           {
               case R.id.sel_sw_driv:
                System.out.println("in driver");
                   // Code for button 1 click
                   break;

               case R.id.sel_sw_res:
                   // Code for button 2 click
                   System.out.println("in res");
                   break;

              *//* case R.id.button3:
                   // Code for button 3 click
                   break;*//*
           }


               *//* if(selSwRes.isChecked()){
                    selSwRes.setChecked(false);
                     selSwDri.setChecked(true);
                    }
                else if((selSwDri.isChecked())){
                        selSwRes.setChecked(true);
                        selSwDri.setChecked(false);
                        }*//*
    }*/

}
