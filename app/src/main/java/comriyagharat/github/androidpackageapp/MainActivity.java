package comriyagharat.github.androidpackageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    // On clicking this button, the user currently gets a pop up message on the screen for
    // confirm a delivery
    public void onClickConfirm(View v) {
        Toast.makeText(this, "Confirm a Package Delivery", Toast.LENGTH_LONG).show();
    }

    // On clicking this button, the user moves forward to the form screen and can proceed to
    // fill in the appropriate information
    public void onClickEnterPackage(View v){
        Toast.makeText(this, "Go to Enter Package Form", Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this, PackageFormActivity.class);
        startActivity(i);
    }

    // On clicking this button, the user currently gets a pop up message on the screen for
    // enter a last and first name to search for
    public void onClickViewPackage(View v){
        Toast.makeText(this, "Enter a First and Last Name", Toast.LENGTH_LONG).show();
    }

    // This section, is not being implemented yet, but it is the menu ellipses in the top right
    // Will be implemented eventually for easy navigation
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
