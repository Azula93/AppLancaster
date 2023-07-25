package www.colegiolancaster.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalificacionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);
    }
    public void logoutNotas(View view){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}