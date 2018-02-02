package com.example.mariomartin.proyecto_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mario Martin on 02/02/2018.
 */

public class Actividad_Principal extends Activity {
    @Override
    protected void onCreate(Bundle objServicio) {
        super.onCreate(objServicio);
        setContentView(R.layout.maser_act);
        Button bIniciar = (Button) findViewById(R.id.bIniciarSer);
        bIniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(new Intent(getBaseContext(), MiServicio.class));
            }
        }); /** fin del metodo bIniciar.setOnClickListener(...) **/

        Button bParar = (Button) findViewById(R.id.bPararSer);
        bParar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(new Intent(getBaseContext(), MiServicio.class));
            }
        }); /** fin del metodo bParar.setOnClickListener(...) **/
    }
}
