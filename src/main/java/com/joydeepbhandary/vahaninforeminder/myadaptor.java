//package com.joydeepbhandary.vahaninforeminder;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class myadaptor extends RecyclerView.Adapter<myadaptor.MyViewHolder> {
//
//    Context context;
//    ArrayList<vehinfo> list;
//
//    public myadaptor(ArrayList<vehinfo> list) {
//        this.list = list;
//    }
//
//    public myadaptor(Context context, ArrayList<vehinfo> list) {
//        this.context = context;
////        this.list = list;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//
//        View v= LayoutInflater.from(context).inflate(R.layout.vehentry,parent,false);
//
//        return new MyViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//      vehinfo user=list.get(position);
//      holder.Vehno.setText(user.getVehno());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder{
//
//        TextView Vehno;
//
//
//
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            Vehno=itemView.findViewById(R.id.field1);
//        }
//    }
//}
