package mixr.mixr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    Button GoToHomeScreen;
    Button GoToCreateAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        GoToHomeScreen = (Button)findViewById(R.id.button1);
        GoToCreateAccount = (Button)findViewById(R.id.textView4);


        GoToHomeScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(WelcomeScreen.this, HomeScreen.class);
                startActivity(intent);

            }
        });

        GoToCreateAccount.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(WelcomeScreen.this, CreateAccount.class);
//                Intent intent = new Intent(WelcomeScreen.this, AddMeal.class);
                startActivity(intent);

            }
        });
    }
}
//package mixr.mixr;
//
//        import android.app.Activity;
//        import android.content.Intent;
//        import android.support.v7.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.view.Menu;
//        import android.view.MenuItem;
//        import android.view.View;
//        import android.widget.Button;
//
//public class WelcomeScreen extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome_screen);
//    }
//
//}
