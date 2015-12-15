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

public class linterna extends AppCompatActivity implements SensorEventListener{
    private SensorManager sm;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16;
    private ImageView img17,img18,img19,img20,img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,img31,img32;
    private float rangM;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linterna);

        img1=(ImageView) findViewById(R.id.img1);img2=(ImageView) findViewById(R.id.img2);img3=(ImageView) findViewById(R.id.img3);
        img4=(ImageView) findViewById(R.id.img4);img5=(ImageView) findViewById(R.id.img5);img6=(ImageView) findViewById(R.id.img6);
        img7=(ImageView) findViewById(R.id.img7);img8=(ImageView) findViewById(R.id.img8);img9=(ImageView) findViewById(R.id.img9);
        img10=(ImageView) findViewById(R.id.img10);img11=(ImageView) findViewById(R.id.img11);img12=(ImageView) findViewById(R.id.img12);
        img13=(ImageView) findViewById(R.id.img13);img14=(ImageView) findViewById(R.id.img14);img15=(ImageView) findViewById(R.id.img15);
        img16=(ImageView) findViewById(R.id.img16);img17=(ImageView) findViewById(R.id.img17);img18=(ImageView) findViewById(R.id.img18);
        img19=(ImageView) findViewById(R.id.img19);img20=(ImageView) findViewById(R.id.img20);img21=(ImageView) findViewById(R.id.img21);
        img22=(ImageView) findViewById(R.id.img22);img23=(ImageView) findViewById(R.id.img23);img24=(ImageView) findViewById(R.id.img24);
        img25=(ImageView) findViewById(R.id.img25);img26=(ImageView) findViewById(R.id.img26);img27=(ImageView) findViewById(R.id.img27);
        img28=(ImageView) findViewById(R.id.img28);img29=(ImageView) findViewById(R.id.img29);img30=(ImageView) findViewById(R.id.img30);
        img31=(ImageView) findViewById(R.id.img31);img32=(ImageView) findViewById(R.id.img32);
        txt=(TextView) findViewById(R.id.txt);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> ListaSensores =sm.getSensorList(Sensor.TYPE_LIGHT);
        if(!ListaSensores.isEmpty()){
            Sensor sensorL= ListaSensores.get(0);
            sm.registerListener(this, sensorL,sm.SENSOR_DELAY_NORMAL);
            rangM=sensorL.getMaximumRange();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this){
            switch (event.sensor.getType()){
                case Sensor.TYPE_LIGHT:
                    float valor=event.values[0];
                    float v=(rangM/32);
                    txt.setText("Intensidad: "+valor+" lux");
                        for(int i=0;i<v;i++){
                            if(valor<1*v){img1.setImageResource(R.drawable.ic_on);}else{img1.setImageResource(R.drawable.ic_off);}
                            if(valor<2*v){img2.setImageResource(R.drawable.ic_on);}else{img2.setImageResource(R.drawable.ic_off);}
                            if(valor<3*v){img3.setImageResource(R.drawable.ic_on);}else{img3.setImageResource(R.drawable.ic_off);}
                            if(valor<4*v){img4.setImageResource(R.drawable.ic_on);}else{img4.setImageResource(R.drawable.ic_off);}
                            if(valor<5*v){img5.setImageResource(R.drawable.ic_on);}else{img5.setImageResource(R.drawable.ic_off);}
                            if(valor<6*v){img6.setImageResource(R.drawable.ic_on);}else{img6.setImageResource(R.drawable.ic_off);}
                            if(valor<7*v){img7.setImageResource(R.drawable.ic_on);}else{img7.setImageResource(R.drawable.ic_off);}
                            if(valor<8*v){img8.setImageResource(R.drawable.ic_on);}else{img8.setImageResource(R.drawable.ic_off);}
                            if(valor<9*v){img9.setImageResource(R.drawable.ic_on);}else{img9.setImageResource(R.drawable.ic_off);}
                            if(valor<10*v){img10.setImageResource(R.drawable.ic_on);}else{img10.setImageResource(R.drawable.ic_off);}
                            if(valor<11*v){img11.setImageResource(R.drawable.ic_on);}else{img11.setImageResource(R.drawable.ic_off);}
                            if(valor<12*v){img12.setImageResource(R.drawable.ic_on);}else{img12.setImageResource(R.drawable.ic_off);}
                            if(valor<13*v){img13.setImageResource(R.drawable.ic_on);}else{img13.setImageResource(R.drawable.ic_off);}
                            if(valor<14*v){img14.setImageResource(R.drawable.ic_on);}else{img14.setImageResource(R.drawable.ic_off);}
                            if(valor<15*v){img15.setImageResource(R.drawable.ic_on);}else{img15.setImageResource(R.drawable.ic_off);}
                            if(valor<16*v){img16.setImageResource(R.drawable.ic_on);}else{img16.setImageResource(R.drawable.ic_off);}
                            if(valor<17*v){img17.setImageResource(R.drawable.ic_on);}else{img17.setImageResource(R.drawable.ic_off);}
                            if(valor<18*v){img18.setImageResource(R.drawable.ic_on);}else{img18.setImageResource(R.drawable.ic_off);}
                            if(valor<19*v){img19.setImageResource(R.drawable.ic_on);}else{img19.setImageResource(R.drawable.ic_off);}
                            if(valor<20*v){img20.setImageResource(R.drawable.ic_on);}else{img20.setImageResource(R.drawable.ic_off);}
                            if (valor < 21 * v) {img21.setImageResource(R.drawable.ic_on);} else {img21.setImageResource(R.drawable.ic_off);}
                            if (valor < 22 * v) {img22.setImageResource(R.drawable.ic_on);} else {img22.setImageResource(R.drawable.ic_off);}
                            if (valor < 23 * v) {img23.setImageResource(R.drawable.ic_on);} else {img23.setImageResource(R.drawable.ic_off);}
                            if (valor < 24 * v) {img24.setImageResource(R.drawable.ic_on);} else {img24.setImageResource(R.drawable.ic_off);}
                            if (valor < 25 * v) {img25.setImageResource(R.drawable.ic_on);} else {img25.setImageResource(R.drawable.ic_off);}
                            if (valor < 26 * v) {img26.setImageResource(R.drawable.ic_on);} else {img26.setImageResource(R.drawable.ic_off);}
                            if (valor < 27 * v) {img27.setImageResource(R.drawable.ic_on);} else {img27.setImageResource(R.drawable.ic_off);}
                            if (valor < 28 * v) {img28.setImageResource(R.drawable.ic_on);} else {img28.setImageResource(R.drawable.ic_off);}
                            if (valor < 29 * v) {img29.setImageResource(R.drawable.ic_on);} else {img29.setImageResource(R.drawable.ic_off);}
                            if (valor < 30 * v) {img30.setImageResource(R.drawable.ic_on);} else {img30.setImageResource(R.drawable.ic_off);}
                            if (valor < 31 * v) {img31.setImageResource(R.drawable.ic_on);} else {img31.setImageResource(R.drawable.ic_off);}
                            if (valor < 32 * v) {img32.setImageResource(R.drawable.ic_on);} else {img32.setImageResource(R.drawable.ic_off);}
                        }
                    break;
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Se detiene el listener para no malgastar la bateria
        sm.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
