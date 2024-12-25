package com.example.myapplication;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button button;// create button
private TextView textView;// create text_view
private EditText editText;// create edit_view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.button);// finding button by using the findViewById and using the Resoure class object with id variable
        textView=findViewById(R.id.textView);// finding textView by using the findViewById and using the Resource class object with id variable
        editText=findViewById(R.id.editText);// finding editText by using the findingViewByID and using the Resource class object with id variable


        // adding the actionListener
/*button.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View view) {
                                  Toast.makeText(MainActivity.this, "Respond_Submitted", Toast.LENGTH_SHORT).show();
                                  String s =editText.getText().toString();
                                  double w_kg =Double.parseDouble(s);
                                  double pound =w_kg*2.205;
                                  textView.setText("the_converted_weight_in_pounds"+pound);



                              }
                          }

);*/



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });


    }
    public void calculate(View view)
    {
        String s=editText.getText().toString();
        Double kg =Double.parseDouble(s);
        Double pound =kg*2.205;
        textView.setText("the_value_in_pounds is:"+pound);

    }
}