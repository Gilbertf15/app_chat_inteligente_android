package com.example.chatbot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText inputtext;
    EditText textarea;
    Button buttonbot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        componentes();
        chamarrequest();

    }

    //  método de chamar a requisição
    private void chamarrequest() {
        buttonbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String response = RequestApiGroq.enviarpergunta("responda em portugues a proxima frase depoias dos dois pontos, sem caractere especial e sem quebra de linha, uma resposta robusta e completa:"+inputtext.getText().toString() , textarea);
                System.out.println(response);
            }
        });

    }

    // declaração dos componentes
    private void componentes() {
        textarea = findViewById(R.id.textarea);
        inputtext = findViewById(R.id.inputText);
        buttonbot = findViewById(R.id.buttonbot);
    }

    //String teste = RequestApiGroq.enviarpergunta("oi");

    //requestapi.enviarpergunta("oi");
}