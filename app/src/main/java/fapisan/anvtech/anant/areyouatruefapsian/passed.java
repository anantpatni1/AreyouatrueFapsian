package fapisan.anvtech.anant.areyouatruefapsian;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.*;


public class passed extends AppCompatActivity {


    Button share,retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passed);
        addListenerOnButton();

    }

    public void addListenerOnButton() {

        final Context context =this;
        share=(Button)findViewById(R.id.button9);
        retry=(Button)findViewById(R.id.button);


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.facebook.com/dialog/feed?%20%20%20app_id=1182836865096506&%20%20%20picture=http://i1378.photobucket.com/albums/ah101/anantpatni1/cover_zps46cjcke4.jpg~original&%20%20%20name=Are%20you%20a%20true%20Fapsian?%20&%20%20%20description=Yes!%20I%20have%20passed%20all%2012%20stages%20and%20I'm%20a%20true%20Fapsian!%20&caption=%20I've%20passed%20this%20test!%20&%20%20%20redirect_uri=https%3A%2F%2Fwww.facebook.com&to&display=touch&_rdr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

                finish();
            }
        });
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
               

    }
}
