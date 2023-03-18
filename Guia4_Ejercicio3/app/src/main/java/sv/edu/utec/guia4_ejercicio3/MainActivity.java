package sv.edu.utec.guia4_ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvDesc,tvSuma;
    EditText edtNum, edtMuestra;
    Button btnAgrega;
    Integer[] listaNumeros = new Integer[10];
    int i = 0;
    int suma = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDesc = findViewById(R.id.tvDescripcion);
        tvSuma = findViewById(R.id.tvSuma);

        edtNum = findViewById(R.id.edtNumero);
        edtMuestra = findViewById(R.id.edtMostrar);
        edtMuestra.append("Los numeros ingresados son: \n");
    }

    public void Agregar (View view){

        int valor = Integer.parseInt(edtNum.getText().toString());
        if(i<10){
            listaNumeros[i] = valor;
            edtMuestra.append(listaNumeros[i] + "\n");
            i = i+1;
            if (i > 9){
                for (int x = 5; x<10; x++){
                    suma = suma + listaNumeros[x];
                }
                tvSuma.append("La suma de los ultimos 5 digitos es de: " + suma);
            }
        }else{
            Toast.makeText(this,"Ya se han agregado los 10 digitos", Toast.LENGTH_SHORT).show();
        }
    }


    public void Limpiar(View v){
        listaNumeros = null;
        listaNumeros = new Integer[10];
        edtMuestra.setText("Los numeros ingresados son: \n");
        tvSuma.setText("");
        i = 0;
        suma = 0;
    }

}