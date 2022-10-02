package p4n.com.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button_reset;
    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.btn_01);
        button2=findViewById(R.id.btn_02);
        button3=findViewById(R.id.btn_03);
        button4=findViewById(R.id.btn_04);
        button5=findViewById(R.id.btn_05);
        button6=findViewById(R.id.btn_06);
        button7=findViewById(R.id.btn_07);
        button8=findViewById(R.id.btn_08);
        button9=findViewById(R.id.btn_09);
        button_reset=findViewById(R.id.btn_reset);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0)
                {
                    button1.setText("X");
                    flag=1;
                }
                else
                {
                    button1.setText("O");
                    flag=0;
                }
                button1.setEnabled(false);
                Result();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0)
                {
                    button2.setText("X");
                    flag=1;
                }
                else
                {
                    button2.setText("O");
                    flag=0;
                }
                button2.setEnabled(false);
                Result();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    button3.setText("X");
                    flag=1;
                }
                else
                {
                    button3.setText("O");
                    flag=0;
                }
                button3.setEnabled(false);
                Result();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0)
                {
                    button4.setText("X");
                    flag=1;
                }
                else
                {
                    button4.setText("O");
                    flag=0;
                }
                button4.setEnabled(false);
                Result();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    button5.setText("X");
                    flag=1;
                }
                else
                {
                    button5.setText("O");
                    flag=0;
                }
                button5.setEnabled(false);
                Result();            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0)
                {
                    button6.setText("X");
                    flag=1;
                }
                else
                {
                    button6.setText("O");
                    flag=0;
                }
                button6.setEnabled(false);
                Result();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0)
                {
                    button7.setText("X");
                    flag=1;
                }
                else
                {
                    button7.setText("O");
                    flag=0;
                }
                button7.setEnabled(false);
                Result();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0)
                {
                    button8.setText("X");
                    flag=1;
                }
                else
                {
                    button8.setText("O");
                    flag=0;
                }
                button8.setEnabled(false);
                Result();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0)
                {
                    button9.setText("X");
                    flag=1;
                }
                else
                {
                    button9.setText("O");
                    flag=0;
                }
                button9.setEnabled(false);
                Result();
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setText(" ");
                button2.setText(" ");
                button3.setText(" ");
                button4.setText(" ");
                button5.setText(" ");
                button6.setText(" ");
                button7.setText(" ");
                button8.setText(" ");
                button9.setText(" ");
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
            }
        });
    }

        void Result()
        {
            String s1=button1.getText().toString();
            String s2=button2.getText().toString();
            String s3=button3.getText().toString();
            String s4=button4.getText().toString();
            String s5=button5.getText().toString();
            String s6=button6.getText().toString();
            String s7=button7.getText().toString();
            String s8=button8.getText().toString();
            String s9=button9.getText().toString();


            if(s1 == s2 && s2 == s3 && s3 != " ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s1+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }
            else if(s4 == s5 && s5 == s6 && s6 !=" ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s4+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }
            else if(s7 == s8 && s8 == s9 && s9 !=" ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s7+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

            else if(s1 == s4 && s4 == s7 && s7 !=" ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s1+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

            else if(s2 == s5 && s5 == s8 && s8 !=" ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s2+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

            else if(s3 == s6 && s6 == s9 && s9 !=" ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s3+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

            else if(s1 == s5 && s5 == s9 && s9 !=" ")
            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s1+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

            else if(s3 == s5 && s5 == s7 && s7 !=" ")

            {
                Toast.makeText(getApplicationContext(),"Bingo...."+s3+"wins",Toast.LENGTH_LONG).show();
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

        }
    }