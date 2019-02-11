package com.example.user.ford;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryF extends Fragment {

    TextView namejava,fuelecojav,pricejava;
    ImageView imagejava;
    ListView javalv;

    private int[] picjava={R.drawable.aspire,R.drawable.figo,R.drawable.mustang,R.drawable.ecosport,R.drawable.endevour,R.drawable.freestyle};

    ArrayList<String>nm=new ArrayList<>();
    ArrayList<String>fueleco=new ArrayList<>();
    ArrayList<String>price=new ArrayList<>();

    public GalleryF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_gallery, container, false);

        javalv=v.findViewById(R.id.gallerylistview);

        nm.add("ASPIRE");
        nm.add("Next-Gen Figo");
        nm.add("Mustang");
        nm.add("EcoSport");
        nm.add("Endeavour");
        nm.add("Ford Freestyle");

        fueleco.add("Fuel Economy (P): 20.4 km/l ");
        fueleco.add("Fuel Economy (P): 18.16 km/l");
        fueleco.add("Fuel Economy (P): 7.91 km/l ");
        fueleco.add("Fuel Economy (P): 17 km/l ");
        fueleco.add("Fuel Economy (P): NA km/l ");
        fueleco.add("Fuel Economy (P): 19.0 km/l ");

        price.add("Starting from : ₹ 5,55,000 ");
        price.add("Starting from : ₹ 5,82,600 ");
        price.add("Starting from : ₹ 74,62,000");
        price.add("Starting from : ₹ 7,82,300");
        price.add("Starting from : ₹ 26,82,800 ");
        price.add("Price : ₹ 5,43,400");

        adapt apt=new adapt();
        javalv.setAdapter(apt);


        return v;
    }

    class adapt extends BaseAdapter {

        @Override
        public int getCount() {
            return nm.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inf=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inf.inflate(R.layout.gallery,null);
            imagejava=convertView.findViewById(R.id.imagexml);
            namejava=convertView.findViewById(R.id.namexml);
            fuelecojav=convertView.findViewById(R.id.fuelecoxml);
            pricejava=convertView.findViewById(R.id.pricexml);
            imagejava.setImageResource(picjava[position]);
            namejava.setText(nm.get(position));
            fuelecojav.setText(fueleco.get(position));
            pricejava.setText(price.get(position));

            return convertView;
        }
    }

}
