package sg.edu.rp.c346.id20028636.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button daughter;
    Button son;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daughter = findViewById(R.id.buttonCallDaughter);
        son = findViewById(R.id.buttonCallSon);

        daughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 89675543));
                startActivity(intentCall);

            }
        });

        son.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 92230336));
                startActivity(intentCall);

            }
        });
    }


}