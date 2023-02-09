package sv.edu.utec.controleslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spPais;
    EditText etNombres, etApellidos,etInfo;
    RadioButton rbFem, rbMasc,rbOtr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombres = findViewById(R.id.edtNombres);
        etApellidos = findViewById(R.id.edtApellidos);
        etInfo = findViewById(R.id.edtInfo);
        spPais = findViewById(R.id.spnPais);

        //Llenando el dropdown o spinning
        //Creando la lista del spinner
        String[] opciones ={"Seleccione un País","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panama"};
        //Creando el adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);
        //Asignando adaptador
        spPais.setAdapter(adaptador);

    }

    public void Almacenar(View v){
        String datos="";
        String seleccion = spPais.getSelectedItem().toString();

        etInfo.setText("");

        if (seleccion.equals("Seleccione un País")){
            datos = "No seleccionó ningún país";
        }else{
            if (seleccion.equals("Guatemala")) {
                datos = "Guatemala";
            } else if (seleccion.equals("El Salvador")) {
                datos = "El Salvador";
            } else if (seleccion.equals("Honduras")) {
                datos = "Honduras";
            } else if (seleccion.equals("Nicaragua")) {
                datos = "Nicaragua";
            } else if (seleccion.equals("Costa Rica")) {
                datos = "Costa Rica";
            } else if (seleccion.equals("Panama")) {
                datos = "Panama";
            }

            etInfo.append(datos);

        }

    }

}