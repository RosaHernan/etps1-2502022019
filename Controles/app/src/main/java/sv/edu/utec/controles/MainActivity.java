package sv.edu.utec.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtValor, edtResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor = findViewById(R.id.edtTabla);
        edtResultado = findViewById(R.id.edtMTabla);
    }

    public void Tabla(View v){
        int valTabla = Integer.parseInt(edtValor.getText().toString());
        String Resultado;
        edtResultado.setText("");
        for (int i=0; i<= 10; i++){
            Resultado = String.valueOf(valTabla*i);
            edtResultado.append(valTabla + " * " + i + " = " + Resultado + "\n");
        }

    }

}