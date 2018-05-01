package cecyt9.ipn.instalador_pa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    Button inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        inicio = (Button) findViewById(R.id.inicio);
    }

    public void start(View view){
        Intent cambio = new Intent(getApplicationContext(),Usuario.class);
        finish();
        startActivity(cambio);
    }
}
