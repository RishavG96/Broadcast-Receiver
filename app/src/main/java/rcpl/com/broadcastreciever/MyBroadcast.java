package rcpl.com.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by rishavg on 6/8/17.
 */
public class MyBroadcast extends BroadcastReceiver {
    static MediaPlayer mp;
    Context context;
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent i=new Intent(context,MyService.class);
        if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED))
            context.startService(i);
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED))
            context.stopService(i);




        /*
        this.context=context;
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED))
        {
            if(mp==null) {
                mp = MediaPlayer.create(context, R.raw.connected);
                mp.start();
            }
            else
            {
                mp.stop();
                mp=null;
                mp = MediaPlayer.create(context, R.raw.connected);
                mp.start();
            }
            Toast.makeText(context, "Charger Connected!", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED))
        {
            if(mp!=null) {
                mp.stop();
                mp = null;
                mp = MediaPlayer.create(context, R.raw.disconnected);
                mp.start();
            }
            else
            {
                mp = MediaPlayer.create(context, R.raw.disconnected);
                mp.start();
            }
            Toast.makeText(context, "Charger Unplugged!", Toast.LENGTH_SHORT).show();
        }
        else
        {

            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();


            if (activeNetwork != null) { // connected to the internet
                if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                    // connected to wifi
                    Toast.makeText(context, "Connected to WiFi", Toast.LENGTH_LONG).show();

                } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                    // connected to the mobile provider's data plan
                    Toast.makeText(context, "Connected to Network", Toast.LENGTH_LONG).show();
                }
                }
            else
            {
                Toast.makeText(context, "Connection Unavailable", Toast.LENGTH_LONG).show();
            }

        }*/
    }
}
