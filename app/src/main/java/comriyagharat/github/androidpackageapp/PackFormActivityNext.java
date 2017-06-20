package comriyagharat.github.androidpackageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Riya on 6/13/2017.
 * UNF, N00901846
 */

public class PackFormActivityNext extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_package_form_2);
    }

    // On clicking this button, the user is taken back to the sender information screen
    public void onClickBackForm(View v) {
        Toast.makeText(this, "Go Back", Toast.LENGTH_LONG).show();
        Intent i = new Intent(PackFormActivityNext.this, PackageFormActivity.class);
        startActivity(i);
    }
}
