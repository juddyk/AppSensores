package com.example.juddyreina.appsensores;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Deteccion extends AppCompatActivity implements SensorEventListener{

    private SensorManager sm;
    private ImageView imgV;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deteccion);

        txt=(TextView) findViewById(R.id.text);
        imgV=(ImageView) findViewById(R.id.img);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> ListaSensores =sm.getSensorList(Sensor.TYPE_PROXIMITY);
        if(!ListaSensores.isEmpty()){
            Sensor sensorL= ListaSensores.get(0);
            sm.registerListener(this, sensorL,sm.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this){
            switch (event.sensor.getType()){
                case Sensor.TYPE_PROXIMITY:
                    float valor=event.values[0];
                    if(valor<1){
                        txt.setText(""+valor);
                        imgV.setImageResource(R.drawable.ic_asustado);
                    }
                    else if(valor==1){
                        txt.setText(""+valor);
                        imgV.setImageResource(R.drawable.ic_tranquilo);
                    }
                    break;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    protected void onPause() {
        super.onPause();
        // Se detiene el listener para no malgastar la bateria
        sm.unregisterListener(this);
    }

}
