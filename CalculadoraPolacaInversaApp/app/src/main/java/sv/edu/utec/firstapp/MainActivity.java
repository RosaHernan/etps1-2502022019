package sv.edu.utec.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etval1,etval2,etvsigno ;
Button btnCalcular;
TextView twresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etval1=findViewById(R.id.edtValor1);
        etval2=findViewById(R.id.edtValor2);
        etvsigno=findViewById(R.id.edtSigno);

        btnCalcular=findViewById(R.id.btnCalcular);
        twresultado=findViewById(R.id.txvResultado);
    }

    public void Operar(View v)
    {
        int dato1,dato2;
        double resultado;
        String signo;
        dato1= Integer.parseInt(etval1.getText().toString());
        dato2=Integer.parseInt(etval2.getText().toString());
        signo=etvsigno.getText().toString();

        if (signo.equals("+")){
            resultado=dato1+dato2;
            twresultado.setText("El resultado es:"+String.valueOf(resultado));
        } else  if (signo.equals("-")){
            resultado=dato1-dato2;
            twresultado.setText("El resultado es:"+String.valueOf(resultado));
        }else  if (signo.equals("*")){
            resultado=dato1*dato2;
            twresultado.setText("El resultado es:"+String.valueOf(resultado));
        }else  if (signo.equals("/")){
            Double datod1= Double.parseDouble(etval1.getText().toString());
            Double datod2 =Double.parseDouble(etval2.getText().toString());
            resultado=datod1/datod2;
            twresultado.setText("El resultado es:"+String.valueOf(resultado));
        }else {
            twresultado.setText("No seleciono un operador valido");
        }

    }
}