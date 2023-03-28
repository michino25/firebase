package michittio.ueh.firebase.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import michittio.ueh.firebase.R;


public class SignInActivity extends AppCompatActivity {

    private LinearLayout layoutSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        
         //initUi();
//        initListenner();
    }


//    private void initUi() {
//        layoutSignUp = findViewById(R.id.layout_sign_up);
//    }
//    private void initListenner() {
//        layoutSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
}