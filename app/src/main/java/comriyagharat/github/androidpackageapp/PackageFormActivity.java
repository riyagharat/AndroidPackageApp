package comriyagharat.github.androidpackageapp;

import android.content.Intent;
import android.opengl.EGLDisplay;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Riya on 6/12/2017.
 * UNF, N00901846
 */

public class PackageFormActivity extends AppCompatActivity{

    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextMiddleInitial;
    private EditText editTextRoad;
    private EditText editTextCity;
    private EditText editTextState;
    private EditText editTextZip;
    private EditText editTextArrival;
    private EditText editTextTracking;
    private EditText editTextOrganization;
    private Button buttonSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_package_form);
        buttonSubmit = (Button) findViewById(R.id.button5);
        editTextFirstName = (EditText) findViewById(R.id.editText);
        editTextLastName = (EditText) findViewById(R.id.editText2);
        editTextMiddleInitial = (EditText) findViewById(R.id.editText3);
        editTextRoad = (EditText) findViewById(R.id.editText4);
        editTextCity = (EditText) findViewById(R.id.editText5);
        editTextState = (EditText) findViewById(R.id.editText6);
        editTextZip = (EditText) findViewById(R.id.editText7);
        editTextArrival = (EditText) findViewById(R.id.editText8);
        editTextTracking = (EditText) findViewById(R.id.editText9);
        editTextOrganization =(EditText) findViewById(R.id.editText10);
    }

    // On clicking the button, this method takes the user to the Receiver form screen
    public void onClickNext(View v) {
        Toast.makeText(this, "Go to Receiver Form", Toast.LENGTH_LONG).show();
        Intent i = new Intent(PackageFormActivity.this, PackFormActivityNext.class);
        startActivity(i);
    }

    // On click the button, this method takes the user back to the main screen
    public void onClickBack (View v) {
        Toast.makeText(this, "Go Back", Toast.LENGTH_LONG).show();
        Intent i = new Intent(PackageFormActivity.this, MainActivity.class);
        startActivity(i);
    }
}
