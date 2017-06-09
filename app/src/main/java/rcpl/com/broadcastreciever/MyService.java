package rcpl.com.broadcastreciever;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by rishavg on 6/9/17.
 */


public class MyService extends Service {

    MediaPlayer mp;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
            mp = MediaPlayer.create(getApplicationContext(), R.raw.disconnected);
            mp.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
        stopSelf();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
