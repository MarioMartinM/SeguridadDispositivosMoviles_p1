package com.example.mariomartin.proyecto_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Mario Martin on 02/02/2018.
 */

public class MiBCReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Cuidado, cuidado ha llegado a 10!!!!.", Toast.LENGTH_LONG).show();
// hacemos vibrar el móvil
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);
        Log.i("Receiver", "Intent Recibido");
    }
}
