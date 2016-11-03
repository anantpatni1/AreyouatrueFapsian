package fapisan.anvtech.anant.areyouatruefapsian;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class q7 extends AppCompatActivity {
    Button four,three,two,one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context =this;
        four=(Button)findViewById(R.id.button5);
        two=(Button)findViewById(R.id.button4);
        three=(Button)findViewById(R.id.button6);
        one=(Button)findViewById(R.id.button7);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Congratulations!You have been promoted to class VIII :D", Toast.LENGTH_SHORT).show();

                                         Intent intent=new Intent(context,q8.class);//q3 is in fact q2
                                         startActivity(intent);
                                         finish();

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Toast.makeText(getApplicationContext(), "Sorry! You have failed :(", Toast.LENGTH_SHORT).show();
                                                finish();

                                            }
                                        }

        );

        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                                Toast.makeText(getApplicationContext(), "Sorry! You have failed :(", Toast.LENGTH_SHORT).show();
                                                finish();
                                         
                                     }
                                 }

        );
        one.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Toast.makeText(getApplicationContext(), "Sorry! You have failed :(", Toast.LENGTH_SHORT).show();
                                         finish();

                                     }
                                 }

        );

    }
}
