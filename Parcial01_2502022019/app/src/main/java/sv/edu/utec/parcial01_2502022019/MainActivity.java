package sv.edu.utec.parcial01_2502022019;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {

    Button btnSesion;
    EditText edtUser, edtContra;
    TextView tvMsj;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSesion = findViewById(R.id.btnLogin);
        edtUser = findViewById(R.id.edtUsuario);
        edtContra = findViewById(R.id.edtContraseña);
        tvMsj = findViewById(R.id.tvMensaje);

        btnSesion.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(getApplicationContext(), CalcularIMC.class);
                //validación de inicio de sesión
                if (edtUser.getText().toString().equals("parcialETps1") && edtContra.getText().toString().equals("p4rC14l#tp$")){
                    startActivity(intento);
                }else{
                    tvMsj.setText("contraseña y usuario no son correctos");
                }
            }
        });


    }
}