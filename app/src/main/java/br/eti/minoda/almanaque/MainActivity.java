package br.eti.minoda.almanaque;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

import br.eti.minoda.almanaque.negocio.DaoItem;

public class MainActivity extends Activity {

    final MainActivity mainActivity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configuraBotoes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);

        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_about:
                openAbout();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void configuraBotoes() {
        ImageButton btnPessoas = (ImageButton) findViewById(R.id.btnPessoas);
        btnPessoas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicou em Pessoas!", Toast.LENGTH_SHORT).show();

                // Run next activity
                Intent intent = new Intent();
                intent.setClass(mainActivity, ItemListActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnEventos = (ImageButton) findViewById(R.id.btnEventos);
        btnEventos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicou em Eventos!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btnViagens = (ImageButton) findViewById(R.id.btnViagens);
        btnViagens.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicou em Viagens!", Toast.LENGTH_SHORT).show();

            }
        });

        ImageButton btnInfo = (ImageButton) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicou em Info!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void openAbout() {
        Intent intent = new Intent();
        intent.setClass(this, AboutActivity.class);
        startActivity(intent);
    }

    private void openSettings() {

    }

}
