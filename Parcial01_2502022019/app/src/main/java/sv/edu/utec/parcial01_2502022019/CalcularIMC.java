package sv.edu.utec.parcial01_2502022019;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalcularIMC extends AppCompatActivity {

    EditText edtPs, edtEst;
    TextView tvRes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_imc);

        edtPs = findViewById(R.id.edtPeso);
        edtEst = findViewById(R.id.edtEstatura);
        tvRes = findViewById(R.id.tvResultado);
    }

    public void Calcular(View v){
        tvRes.setText("");
        Double IMC = 0.00;
        Double Peso = Double.valueOf(edtPs.getText().toString());
        Double Estatura = Double.valueOf(edtEst.getText().toString());

        //Darle formato al numero decimal resultante
        DecimalFormat df = new DecimalFormat("#.00");

        IMC = (Peso)/(Estatura*Estatura);

        //Evaluar el resultado para mostrar la información correcta
        if (IMC <= 10.5){
            tvRes.append("IMC = " + df.format(IMC) + " - Críticamente Bajo de Peso");
        }else if (IMC > 10.5 && IMC <= 15.9){
            tvRes.append("IMC = " + df.format(IMC) + " - Severamente Bajo de Peso");
        }else if (IMC > 15.9 && IMC <= 18.5){
            tvRes.append("IMC = " + df.format(IMC) + " - Bajo de Peso");
        }else if(IMC > 18.5 && IMC <= 25){
            tvRes.append("IMC = " + df.format(IMC) + " - Normal (peso saludable)");
        }else if(IMC > 25 && IMC <= 30){
            tvRes.append("IMC = " + df.format(IMC) + " - Sobrepeso");
        }else if(IMC > 30 && IMC <=35){
            tvRes.append("IMC = " + df.format(IMC) + " - Obesidad Clase 1 - Moderadamente Obeso");
        }else if(IMC > 35 && IMC <= 40){
            tvRes.append("IMC = " + df.format(IMC) + " - Obesidad Clase 2 - Severamente Obeso");
        }else if(IMC>40){
            tvRes.append("IMC = " + df.format(IMC) + " - Obesidad Clase 3 - Críticamente Obeso");
        }

    }
}