package sv.edu.utec.guia2_ejercicio1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText texto;
    TextView Resultado;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.edtnombre ) ;
        Resultado =findViewById(R.id.txvMensaje);
      }

    @NonNull

    public void SaludaronClick (View v){

         String tex1=texto.getText().toString();
         String res=String.valueOf(tex1);
         Resultado.setText("Bienvenido(a)  "+res);
      }

    }
