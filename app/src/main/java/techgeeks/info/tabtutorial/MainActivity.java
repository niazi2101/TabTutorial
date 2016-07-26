package techgeeks.info.tabtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_icon_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.menu_home:
                // Single menu item is selected do something
                // Ex: launching new activity/screen or show alert message
                Toast.makeText(MainActivity.this, "Home is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_photos:
                Toast.makeText(MainActivity.this, "Photos is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_pages:
                Toast.makeText(MainActivity.this, "Pages is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_communities:
                Toast.makeText(MainActivity.this, "Communities is Selected", Toast.LENGTH_SHORT).show();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
