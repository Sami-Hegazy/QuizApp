package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int grades;
    boolean clickedNile=false; // to determine nile button is clicked or not
    boolean clickedEverest=false;// to determine Everest button is clicked or not
    boolean clickedChina=false;// to determine China button is clickedor not
    boolean clickedNorth=false;// to determine north of africa button is clicked or not
    boolean clickedYes=false;// to determine yes button is clicked or not

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonnile=findViewById(R.id.button_nile_river);
        buttonnile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (clickedNile==false){
               upgrdeGrade();
               clickedNile=true;

           }
            }
        });

    Button buttonamazon =findViewById(R.id.button_amazon_river);
    buttonamazon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            makeToast("you must try again");
        }
    });

    Button buttoneverest=findViewById(R.id.button_everest);
    buttoneverest.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // this if statement if button is the first time to click then it will update grades else it will do nothing
          if (clickedEverest==false){
             upgrdeGrade();
          clickedEverest=true;
          }
        }
    });
    Button buttonAalps=findViewById(R.id.button_alps);
    buttonAalps.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            makeToast("you must try again");
        }
    });

   Button buttonChina=findViewById(R.id.button_china);
   buttonChina.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           // this if statement if button is the first time to click then it will update grades else it will do nothing
         if (clickedChina==false){
          upgrdeGrade();
         clickedChina=true;}
       }
   });

   Button buttonIndia=findViewById(R.id.button_india );
   buttonIndia.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           makeToast("you must try again");
       }
   });

   Button buttonSubmit=findViewById(R.id.button_submit);
  // this listener for submit button for show your grades
   buttonSubmit.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           makeToast("your grades:"+grades+"/5");
           grades=0;
       }
   });

   
    }


    /**
     * this method i create so i can easily make toat message
     * @param message refer to the text that Toast will show it
     */

private void makeToast(String message){

    Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

}


    /**
     * this method check if user check the right button will update grades variable by adding one to it's current value
     * and making toat message to give information about he answer right or not
     * @param view refer to the radio button that will be clicked
     *
     */
public void onClickEgypt(View view){
    if (view.getId()==R.id.radioButtonnorth){
        // this if statement if button is the first time to click then it will update grades else it will do nothing
        if (clickedNorth==false){
       upgrdeGrade();
      clickedNorth=true;}
    }else {
        makeToast("try again");
    }

}

    /**
     * this method check if user check the right button will update grades variable by adding one to it's current value
     * and making toat message to give information about he answer right or not
     * @param view refer to the radio button that will be clicked
     *
     */
    public void onClickRussia(View view){
    if (view.getId()==R.id.radioButtonyes){
       // this if statement if button is the first time to click then it will update grades else it will do nothing
        if (clickedYes==false){
      upgrdeGrade();
       clickedYes=true;}
    }else {
        makeToast("opps!");
    }
}

    /**
     * this method for adding one to the current value of grades var
     */
    private void upgrdeGrade(){
        grades++;
        makeToast("what a good choice!");
}



}
