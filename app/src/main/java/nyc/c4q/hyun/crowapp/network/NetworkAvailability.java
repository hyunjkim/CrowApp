package nyc.c4q.hyun.crowapp.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Hyun on 12/21/16.
 */
public class NetworkAvailability {

    private static ConnectivityManager cm;
    private static NetworkInfo activeNetwork;
    private static boolean isConnected;

    public static boolean checkNetwork(Context applicationContext) {

        cm = (ConnectivityManager) applicationContext
                .getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        activeNetwork = cm.getActiveNetworkInfo();
        isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        return isConnected;
    }
}
