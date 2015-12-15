package com.example.juddyreina.appsensores;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    private Listas[] datos = new Listas[]{
            new Listas("Brujula"),
            new Listas("Bu!"),
            new Listas("Leds")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adaptador = new Adapter(this,datos);
        lst = (ListView) findViewById(R.id.lst);
        lst.setAdapter(adaptador);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                int idActivity = (int) parent.getItemIdAtPosition(position);
                switch (idActivity) {
                    case 0:
                        i = new Intent(MainActivity.this, Brujula.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(MainActivity.this, Deteccion.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(MainActivity.this, linterna.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }

    public class Adapter extends ArrayAdapter<Listas> {

        public Adapter(Context context, Listas[] datos) {
            super(context, R.layout.list, datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.list,null);
            TextView nombre = (TextView) item.findViewById(R.id.tv_sensor_name);
            nombre.setText(datos[position].getNombre());
            return item;
        }
    }


}
