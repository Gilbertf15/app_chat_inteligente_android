package com.example.chatbot;
import android.util.Log;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestApiGroq {

    public static String enviarpergunta(String perguntausuario, EditText widet) {

        //String apiKey = "";
        new Thread(() -> {
            try {
                String url = "https://api.groq.com/openai/v1/chat/completions";
                String json = "{ \"model\": \"llama3-70b-8192\", \"messages\": [ { \"role\": \"user\", \"content\": \"" + perguntausuario + "\" } ] }";

                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Authorization", "Bearer " + apiKey);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setDoOutput(true);

                OutputStream os = conn.getOutputStream();
                os.write(json.getBytes());
                os.flush();
                os.close();

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder resposta = new StringBuilder();
                String linha;
                while ((linha = reader.readLine()) != null) {
                    resposta.append(linha);
                }
                reader.close();
                System.out.println(resposta);
                String respostastring = resposta.toString();
                //JSONObject response = resposta;
                Log.d("GROQ_API", "Resposta: " + resposta);
                JSONObject jsonob = new JSONObject(respostastring);

                JSONArray arraychoice =  jsonob.getJSONArray("choices");
                JSONObject messagellm =  arraychoice.getJSONObject(0);

                JSONObject message =  messagellm.getJSONObject("message");
                String content = message.getString("content");
                widet.setText(content);

            } catch (Exception e) {
                Log.e("GROQ_API", "Erro na requisição", e);
            }

        }).start();
        return "nada agora";
    }
}