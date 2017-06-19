package comriyagharat.github.androidpackageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Riya on 6/12/2017.
 * UNF, N00901846
 */

public class PackageFormActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_package_form);
    }

    public void onClickNext(View v) {
        Toast.makeText(this, "Go to Receiver Form", Toast.LENGTH_LONG).show();
        Intent i = new Intent(PackageFormActivity.this, PackFormActivityNext.class);
        startActivity(i);
    }

    public void onClickBack (View v) {
        Toast.makeText(this, "Go Back", Toast.LENGTH_LONG).show();
        Intent i = new Intent(PackageFormActivity.this, MainActivity.class);
        startActivity(i);
    }
}
