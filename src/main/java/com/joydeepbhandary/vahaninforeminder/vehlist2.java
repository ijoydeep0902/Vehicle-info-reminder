package com.joydeepbhandary.vahaninforeminder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class vehlist2 extends AppCompatActivity {

    Button btnadd;
    RecyclerView recyclerView;
    ArrayList<vehinfo> list;
    DatabaseReference databaseReference;
//    myadaptor adaptor;
//    @Override
//    public  void onBackPressed()
//    {
//        super.onBackPressed();;
//        startActivity(new Intent(vehlist2.this,MainActivity.class));
//        finish();
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehlist2);



//        recyclerView=findViewById(R.id.recylerview);
//        databaseReference= FirebaseDatabase.getInstance().getReference("VehInfo");
//
//
//        list=new ArrayList<>();
//        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
//        adaptor= new myadaptor(this,list);
//        recyclerView.setAdapter(adaptor);
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                for(DataSnapshot dataSnapshot: snapshot.getChildren())
//                {
//                    vehinfo vehinfo=dataSnapshot.getValue(vehinfo.class);
//                    list.add(vehinfo);
//                }
//                adaptor.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });















        btnadd=findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(vehlist2.this,Vehilceadd.class);
                startActivity(intent);

                Toast.makeText(vehlist2.this, "Fill up the form", Toast.LENGTH_SHORT).show();
            }
        });

    }
}