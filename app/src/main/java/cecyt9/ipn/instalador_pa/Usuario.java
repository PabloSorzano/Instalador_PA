package cecyt9.ipn.instalador_pa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class Usuario extends AppCompatActivity {
    EditText nombre, aPat, aMat, cel, email, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(getApplicationContext(), "Agregar usuario", Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        nombre = (EditText)findViewById(R.id.nombre);
        aPat = (EditText)findViewById(R.id.aPat);
        aMat = (EditText)findViewById(R.id.aMat);
        cel = (EditText)findViewById(R.id.cel);
        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
    }
}
