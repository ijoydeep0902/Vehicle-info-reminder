package com.joydeepbhandary.vahaninforeminder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;
import java.security.PrivilegedAction;

public class Vehilceadd extends AppCompatActivity {

    FirebaseDatabase db;
    DatabaseReference reference;

        EditText textvehno;
     EditText text;//insurance
     Button button;//insurance

     EditText texttax;//tax
     Button btnDPtaxupto;//tax

    EditText textpollution;//pollution
     Button btnPollution;//pollution


     EditText textfitness;//fitness

     Button btnDpfitness;//fitness
//
    private void openDialog(TextView text)//method
    {
        DatePickerDialog dialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                text.setText(String.valueOf(day)+"."+String.valueOf(month+1)+"."+String.valueOf(year));
            }
        },2023, 0, 15);
        dialog.show();
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehilceadd);

        textvehno=findViewById(R.id.textView4);

        text = findViewById(R.id.editTextInsurance);
        button = findViewById(R.id.buttoninsurance);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(text);
            }
        });
//
        texttax = findViewById(R.id.texttax);
        btnDPtaxupto = findViewById(R.id.btnDPtax);
        btnDPtaxupto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(texttax);
            }
        });
//
        textfitness = findViewById(R.id.textView6);
        btnDpfitness = findViewById(R.id.btnDPfitness);
        btnDpfitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(textfitness);
            }
        });
//
        textpollution = findViewById(R.id.textView7);
        btnPollution = findViewById(R.id.btnDPpollution);
        btnPollution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog(textpollution);
            }
        });


//        reference=FirebaseDatabase.getInstance().getReference().child("VehInfo");


        Button btnsubmit = findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v)
        {

             String vehno=textvehno.getText().toString();
             String insurance=texttax.getText().toString();
             String tax=texttax.getText().toString();
             String fitness=textfitness.getText().toString();
             String pollution=textpollution.getText().toString();

             if(vehno.isEmpty()||tax.isEmpty()||insurance.isEmpty()||fitness.isEmpty()||pollution.isEmpty())
                 Toast.makeText(Vehilceadd.this, "pura bharle bsdka",Toast.LENGTH_SHORT).show();
             else {
                 db = FirebaseDatabase.getInstance();
                 reference = db.getReference("VehInfo").child(vehno);

                 vehinfo veh = new vehinfo(vehno, insurance, tax, fitness, pollution);
                 reference.setValue(veh);
                 Toast.makeText(Vehilceadd.this, "Jao babu ho gya tumhara.", Toast.LENGTH_SHORT).show();
                  }
            }
        });




    }

}