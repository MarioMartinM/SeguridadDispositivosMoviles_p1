package com.example.mariomartin.proyecto_1;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Mario Martin on 02/02/2018.
 */

public class MiServicio extends Service {
    MediaPlayer miCancion;
    private static final String TAG = "Clase MiServicioo ";

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    } /** Fin del metodo public IBinder onBind(Intent arg0) ***/

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
    // Este servicio se ejecutará hasta que se forma explicita se pare
      Toast.makeText(this, "El Servicio iniciado", Toast.LENGTH_SHORT).show();
      miCancion=MediaPlayer.create(MiServicio.this, R.raw.xantos);
      miCancion.start();
      Log.i(TAG, "El Servicio se ha iniciado");
      return START_STICKY;
    } /** Fin del metodo public int onStartCommand(...) ***/

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Servicio parado", Toast.LENGTH_SHORT).show();
        miCancion.stop();
        Log.i(TAG, "El Servicio se ha parado");
    } /** Fin del metodo public int onStartCommand(...) ***/

}
