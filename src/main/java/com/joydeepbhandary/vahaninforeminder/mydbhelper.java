//package com.joydeepbhandary.vahaninforeminder;
//
//import static java.security.AccessController.getContext;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.view.View;
//
//public class mydbhelper extends SQLiteOpenHelper {
//
//
//private static final String Database_name="veh_infoDB";
//private static final int Database_version=1;
//private static  final String table_name= "veh_info";
//    private static final String vehno="vehno";
//    private static final String insurance_upto="insurance_upto";
//    private static final String tax_upto="tax_upto";
//    private static final String fitness_upto="fitness_upto";
//    private static final String pollution_upto="pollution_upto";
//
//    private static Context context;
//
//    public mydbhelper() {
//
//
//
//
////        public final Context context =View.getContext();
//        super(context, Database_name, null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        //create table table_name( vehno text primary key,insurance_upto text,tax_upto text,fitness_upto text,pollution_upto text);
//        db.execSQL("create table " +table_name+"("+vehno +" text primary key, "+insurance_upto+" text,"+tax_upto+"text,"+fitness_upto+"text,"+pollution_upto+"text);"
//
//
//        );
//
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
//
//        db.execSQL("DROP TABLE IF EXISTS "+table_name);
//        onCreate(db);
//
//    }
//
//    public void addvehicle(String vehno,String insurance_upto,String tax_upto,String fitness_upto,String pollution_upto)
//    {
//
//SQLiteDatabase db=this.getWritableDatabase();
//        ContentValues values=new ContentValues();
//        values.put(vehno,vehno);
//        values.put(insurance_upto,insurance_upto);
//        values.put(tax_upto,tax_upto);
//        values.put(fitness_upto,fitness_upto);
//        values.put(pollution_upto,pollution_upto);
//
//
//        db.insert(table_name,null,values);
//
//    }
//
//
//
//}
