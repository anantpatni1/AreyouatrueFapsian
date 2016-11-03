package fapisan.anvtech.anant.areyouatruefapsian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.*;


public class HomePage extends AppCompatActivity {


    Button play,instructions,about,hack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        addListenerOnButton();

    }



    public void addListenerOnButton() {

        final Context context =this;
        play=(Button)findViewById(R.id.button);
        instructions=(Button)findViewById(R.id.button2);
        about=(Button)findViewById(R.id.button3);
        hack=(Button)findViewById(R.id.button8);


        hack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,passed.class);
                startActivity(intent);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,q1.class);
                startActivity(intent);
            }
        });
                instructions.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context,help.class);
                        startActivity(intent);
                                                    }
                                                }

                    );

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,about.class);
                startActivity(intent);
                                            }
                                        }

        );

    }
}
