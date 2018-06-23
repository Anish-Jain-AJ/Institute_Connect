package aj.nuconnect;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class LoginFirst extends AppCompatActivity {

    RadioButton student,faculty;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_first);
        student=(RadioButton) findViewById(R.id.student);
        faculty=(RadioButton) findViewById(R.id.faculty);
        login=(Button) findViewById(R.id.login);
        RelativeLayout constraintLayout = (RelativeLayout) findViewById(R.id.root_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(student.isChecked()){
                    Intent intent = new Intent(LoginFirst.this, student_first.class);
                    startActivity(intent);
                }
                else if(faculty.isChecked()){
                    Intent intent = new Intent(LoginFirst.this, faculty_first.class);
                    startActivity(intent);
                }
            }
        });


    }
}
