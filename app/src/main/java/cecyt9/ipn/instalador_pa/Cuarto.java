package cecyt9.ipn.instalador_pa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Cuarto extends AppCompatActivity {
    agregaCuarto agCu = new agregaCuarto();

    int idUsr = getIntent().getExtras().getInt("idUsr"), idCasa = getIntent().getExtras().getInt("idCasa");
    EditText numeroPiso, nombreCuarto;
    ImageButton foco, puerta, camara, clima;
    Button cerrar;
    
    boolean conD = true, namaC, numPi, tipoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto);
        agCu.setIdCasa(idCasa);

        numeroPiso = (EditText)findViewById(R.id.numeroPiso);
        nombreCuarto = (EditText)findViewById(R.id.nombreCuarto);
        
        foco = (ImageButton)findViewById(R.id.foco);
        puerta = (ImageButton)findViewById(R.id.puerta);
        camara = (ImageButton)findViewById(R.id.camara);
        clima = (ImageButton)findViewById(R.id.clima);
        
        cerrar = (Button)findViewById(R.id.cerrar);
        
    }
    
    public void agregaFoco(View view){
        namaC = agCu.setNombreCuarto(nombreCuarto.getText().toString().trim());
        numPi = agCu.setNumero_Piso(Integer.parseInt(numeroPiso.getText().toString().trim()));
        tipoD = agCu.setTipoDisp(1);

        if(!namaC){
            Toast.makeText(getApplicationContext(), "Nombre incorrecto", Toast.LENGTH_SHORT).show();
            nombreCuarto.setText("");
            conD = false;
        } else if(!numPi){
            Toast.makeText(getApplicationContext(), "Numero incorrecto", Toast.LENGTH_SHORT).show();
            numeroPiso.setText("");
            conD = false;
        } else if (!tipoD){
            Toast.makeText(getApplicationContext(), "Tipo incorrecto", Toast.LENGTH_SHORT).show();
            conD = false;
        } else{
            conD = true;
            if(conD){
                Toast.makeText(getApplicationContext(), "Cuarto dado de alta", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), agCu.agregaCu(), Toast.LENGTH_LONG).show();

            }
        }
    }
    
    public void agregaPuerta(View view){
        namaC = agCu.setNombreCuarto(nombreCuarto.getText().toString().trim());
        numPi = agCu.setNumero_Piso(Integer.parseInt(numeroPiso.getText().toString().trim()));
        tipoD = agCu.setTipoDisp(2);

        if(!namaC){
            Toast.makeText(getApplicationContext(), "Nombre incorrecto", Toast.LENGTH_SHORT).show();
            nombreCuarto.setText("");
            conD = false;
        } else if(!numPi){
            Toast.makeText(getApplicationContext(), "Numero incorrecto", Toast.LENGTH_SHORT).show();
            numeroPiso.setText("");
            conD = false;
        } else if (!tipoD){
            Toast.makeText(getApplicationContext(), "Tipo incorrecto", Toast.LENGTH_SHORT).show();
            conD = false;
        } else{
            conD = true;
            if(conD){
                Toast.makeText(getApplicationContext(), "Cuarto dado de alta", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), agCu.agregaCu(), Toast.LENGTH_LONG).show();

            }
        }
    }
    
    public void agregaCamara(View view){
        namaC = agCu.setNombreCuarto(nombreCuarto.getText().toString().trim());
        numPi = agCu.setNumero_Piso(Integer.parseInt(numeroPiso.getText().toString().trim()));
        tipoD = agCu.setTipoDisp(3);

        if(!namaC){
            Toast.makeText(getApplicationContext(), "Nombre incorrecto", Toast.LENGTH_SHORT).show();
            nombreCuarto.setText("");
            conD = false;
        } else if(!numPi){
            Toast.makeText(getApplicationContext(), "Numero incorrecto", Toast.LENGTH_SHORT).show();
            numeroPiso.setText("");
            conD = false;
        } else if (!tipoD){
            Toast.makeText(getApplicationContext(), "Tipo incorrecto", Toast.LENGTH_SHORT).show();
            conD = false;
        } else{
            conD = true;
            if(conD){
                Toast.makeText(getApplicationContext(), "Cuarto dado de alta", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), agCu.agregaCu(), Toast.LENGTH_LONG).show();

            }
        }
    }
    
    public void agregaClima(View view){
        namaC = agCu.setNombreCuarto(nombreCuarto.getText().toString().trim());
        numPi = agCu.setNumero_Piso(Integer.parseInt(numeroPiso.getText().toString().trim()));
        tipoD = agCu.setTipoDisp(4);

        if(!namaC){
            Toast.makeText(getApplicationContext(), "Nombre incorrecto", Toast.LENGTH_SHORT).show();
            nombreCuarto.setText("");
            conD = false;
        } else if(!numPi){
            Toast.makeText(getApplicationContext(), "Numero incorrecto", Toast.LENGTH_SHORT).show();
            numeroPiso.setText("");
            conD = false;
        } else if (!tipoD){
            Toast.makeText(getApplicationContext(), "Tipo incorrecto", Toast.LENGTH_SHORT).show();
            conD = false;
        } else{
            conD = true;
            if(conD){
                Toast.makeText(getApplicationContext(), "Cuarto dado de alta", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), agCu.agregaCu(), Toast.LENGTH_LONG).show();

            }
        }
    }

    public void cerrar(View view){
        finish();
    }
}
