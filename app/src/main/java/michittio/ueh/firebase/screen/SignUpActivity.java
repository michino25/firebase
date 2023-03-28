package michittio.ueh.firebase.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import michittio.ueh.firebase.MainActivity;
import michittio.ueh.firebase.R;

public class SignUpActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initUi();
//        initListener();
    }

    private void initUi() {
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        btnSignUp = findViewById(R.id.btn_sign_up);
    }

//    private void initListener() {
//        btnSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickSignUp();
//            }
//        });
//    }

//    private void onClickSignUp() {
//        String strEmail = edtEmail.getText().toString().trim();
//        String strPassword = edtPassword.getText().toString().trim();
//        FirebaseAuth mAuth = FirebaseAuth.getInstance();
//        mAuth.createUserWithEmailAndPassword(strEmail, strPassword)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
//                            startActivity(intent);
//                            finishAffinity();
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(SignUpActivity.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//
//                        }
//                    }
//                });
//    }

}