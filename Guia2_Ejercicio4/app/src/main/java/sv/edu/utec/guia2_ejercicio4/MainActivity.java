package sv.edu.utec.guia2_ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Se definen 2 objetos de la clase EditText
    EditText etValor,etMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Se inicializan los objetos definidos en el XML
        etValor = findViewById(R.id.edtValor);
        etMostrar = findViewById(R.id.edtMostrar);
    }

    //Este metodo es el que el boton utilizará para realizar el proceso solicitado
    public void Procedimiento(View v){

        //Se limpia el EditText que mostrará el resultado por si se ejecuta varias veces
        etMostrar.setText("");
        // Se obtiene el valor del EditText
        int valor = Integer.parseInt(etValor.getText().toString());
        //Variable para realizar el calculo
        int calculo = 0;
        // Se crea una variable de resultado para asignar cada resultado de las operaciones
        String resultado = "";
        //Primer proceso ingrementar N en 77
        calculo = valor + 77;
        resultado = "Incrementar N en 77: \n" + valor + " + 77 = " + calculo;
        //Decrementar en 3
        resultado = resultado + " \nDecrementar en 3: \n" + calculo + " - 3 = ";
        calculo = calculo - 3;
        resultado = resultado + calculo;
        //Duplicar su valor
        resultado = resultado + " \nDuplicar su valor: \n" + calculo + " * 2 = ";
        calculo = calculo * 2;
        resultado = resultado + calculo;

        //Mostrar la información en el EditText
        etMostrar.append(resultado);
    }
}