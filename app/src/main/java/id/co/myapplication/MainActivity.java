package id.co.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
    }
    public void launchHelloActivity(View view) {
        Intent tampilHello = new Intent(MainActivity.this, MainHello.class);
        startActivity(tampilHello);
    }
    public void launchToastActivity(View view){
        Intent tampilToast = new Intent(MainActivity.this, MainToast.class);
        startActivity(tampilToast);
    }
    public void launchSianidaActivity(View view){
        Intent tampilSianida = new Intent(MainActivity.this, MainSianida.class);
        startActivity(tampilSianida);
    }
    public void lauchTwoActivity(View view){
        Intent tampilTwo = new Intent(MainActivity.this, MainFirstActivity.class);
        startActivity(tampilTwo);
    }
    public void createAlarm2(View view) {
        ArrayList<Integer> alarmDays = new ArrayList<>();
        alarmDays.add(2);
        alarmDays.add(3);
        alarmDays.add(4);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_DAYS, alarmDays)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Wake up!")
                .putExtra(AlarmClock.EXTRA_HOUR, 7)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30)
                .putExtra(AlarmClock.EXTRA_VIBRATE, false)
                .putExtra(AlarmClock.EXTRA_RINGTONE, "VALUE_RINGTONE_SILENT");

        if (intent.resolveActivity(getPackageManager()) != null) {

            startActivity(intent);

        }
    }
}
