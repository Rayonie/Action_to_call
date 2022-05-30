package sg.edu.rp.c346.id21045028.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button callSon;
    Button callDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callSon = findViewById(R.id.button);
        callDaughter = findViewById(R.id.button2);

        callSon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 12345678));
                startActivity(intentCall);
            }
        });

        callDaughter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 87654321));
                startActivity(intentCall);
            }
        });

    }
}