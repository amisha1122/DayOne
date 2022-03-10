package amisha.project.dayone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//1+1=2
    int a,b,c=0;
    EditText editText1,editText2;
    TextView textViewer,textViewsub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.num1);
        editText2=findViewById(R.id.num2);
        textViewer=findViewById(R.id.tvresult);
        textViewsub=findViewById(R.id.tvresult1);
        a=0;
        b=0;
     /* a= Integer.parseInt(editText1.getText().toString());
      b= Integer.parseInt(editText2.getText().toString());
      c= a+b;*/
      textViewsub.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             a= Integer.parseInt(editText1.getText().toString());
             b= Integer.parseInt(editText2.getText().toString());
             c= a-b;
             Toast.makeText(MainActivity.this,"SUB::"+c,Toast.LENGTH_SHORT).show();
            }
          });
      textViewer.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              a= Integer.parseInt(editText1.getText().toString());
              b= Integer.parseInt(editText2.getText().toString());
              c= a+b;

              Toast.makeText(MainActivity.this,"SUM::"+c,Toast.LENGTH_SHORT).show();
          }
      });



    }
}