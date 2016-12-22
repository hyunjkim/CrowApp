package nyc.c4q.hyun.crowapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import nyc.c4q.hyun.crowapp.fragment.AnimalFragment;
import nyc.c4q.hyun.crowapp.network.NetworkAvailability;

public class AnimalMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_main);

        if (networkAvailable()) {
            if(savedInstanceState == null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.animal_main, new AnimalFragment())
                        .commit();
            }
        } else {
            Toast.makeText(this, "network unavailable", Toast.LENGTH_LONG).show();
        }
    }

    private boolean networkAvailable() {
        return NetworkAvailability.checkNetwork(getApplicationContext());
    }
}
