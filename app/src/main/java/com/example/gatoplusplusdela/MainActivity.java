package com.example.gatoplusplusdela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno,cont,conta=0;
    String letra;

    EditText Et_Ganador;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22;
    Button b23,b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, bR, bS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1.setOnClickListener(this);    b7.setOnClickListener(this);    b13.setOnClickListener(this);
        b2.setOnClickListener(this);    b8.setOnClickListener(this);    b14.setOnClickListener(this);
        b3.setOnClickListener(this);    b9.setOnClickListener(this);    b15.setOnClickListener(this);
        b4.setOnClickListener(this);    b10.setOnClickListener(this);   b16.setOnClickListener(this);
        b5.setOnClickListener(this);    b11.setOnClickListener(this);   b17.setOnClickListener(this);
        b6.setOnClickListener(this);    b12.setOnClickListener(this);   b18.setOnClickListener(this);

        b19.setOnClickListener(this);   b25.setOnClickListener(this);   b31.setOnClickListener(this);
        b20.setOnClickListener(this);   b26.setOnClickListener(this);   b32.setOnClickListener(this);
        b21.setOnClickListener(this);   b27.setOnClickListener(this);   b33.setOnClickListener(this);
        b22.setOnClickListener(this);   b28.setOnClickListener(this);   b34.setOnClickListener(this);
        b23.setOnClickListener(this);   b29.setOnClickListener(this);   b35.setOnClickListener(this);
        b24.setOnClickListener(this);   b30.setOnClickListener(this);   b36.setOnClickListener(this);

        bR.setOnClickListener(this);
        bS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cont++;
        turno=cont%2;

        if(turno == 1){
            imprimirXO('X', v);
        }

        else{
            imprimirXO('O', v);
        }
    }
    public void imprimirXO(char letra, View v){

        if(v.getId() == R.id.bR){
            Et_Ganador.setEnabled(true);
            Et_Ganador.setText("");

            b1.setEnabled(true);
            b1.setText("");

            b2.setEnabled(true);
            b2.setText("");

            b3.setEnabled(true);
            b3.setText("");

            b4.setEnabled(true);
            b4.setText("");

            b5.setEnabled(true);
            b5.setText("");

            b6.setEnabled(true);
            b6.setText("");

            b7.setEnabled(true);
            b7.setText("");

            b8.setEnabled(true);
            b8.setText("");

            b9.setEnabled(true);
            b9.setText("");

            b10.setEnabled(true);
            b10.setText("");

            b11.setEnabled(true);
            b11.setText("");

            b12.setEnabled(true);
            b12.setText("");

            b13.setEnabled(true);
            b13.setText("");

            b14.setEnabled(true);
            b14.setText("");

            b15.setEnabled(true);
            b15.setText("");

            b16.setEnabled(true);
            b16.setText("");

            b17.setEnabled(true);
            b17.setText("");

            b18.setEnabled(true);
            b18.setText("");

            b19.setEnabled(true);
            b19.setText("");

            b20.setEnabled(true);
            b20.setText("");

            b21.setEnabled(true);
            b21.setText("");

            b22.setEnabled(true);
            b22.setText("");

            b23.setEnabled(true);
            b23.setText("");

            b24.setEnabled(true);
            b24.setText("");

            b25.setEnabled(true);
            b25.setText("");

            b26.setEnabled(true);
            b26.setText("");

            b27.setEnabled(true);
            b27.setText("");

            b28.setEnabled(true);
            b28.setText("");

            b29.setEnabled(true);
            b29.setText("");

            b30.setEnabled(true);
            b30.setText("");

            b31.setEnabled(true);
            b31.setText("");

            b32.setEnabled(true);
            b5.setText("");

            b33.setEnabled(true);
            b33.setText("");

            b33.setEnabled(true);
            b33.setText("");

            b34.setEnabled(true);
            b34.setText("");

            b35.setEnabled(true);
            b35.setText("");

            b36.setEnabled(true);
            b36.setText("");
        }

        if(v.getId() == R.id.bS){
            System.exit(0);
        }

        if(v.getId() == R.id.b1){
            b1.setText(letra+"");
            b1.setEnabled(false);
        }
        else if(v.getId() == R.id.b2){
            b2.setText(letra+"");
            b2.setEnabled(false);
        }
        else if(v.getId() == R.id.b3){
            b3.setText(letra+"");
            b3.setEnabled(false);
        }
        else if(v.getId() == R.id.b4){
            b4.setText(letra+"");
            b4.setEnabled(false);
        }
        else if(v.getId() == R.id.b5){
            b5.setText(letra+"");
            b5.setEnabled(false);
        }
        else if(v.getId() == R.id.b6){
            b6.setText(letra+"");
            b6.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b7.setText(letra+"");
            b7.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b8.setText(letra+"");
            b8.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b9.setText(letra+"");
            b9.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b10.setText(letra+"");
            b10.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b11.setText(letra+"");
            b11.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b12.setText(letra+"");
            b12.setEnabled(false);
        }
        else if(v.getId() == R.id.b6){
            b13.setText(letra+"");
            b13.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b14.setText(letra+"");
            b14.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b15.setText(letra+"");
            b15.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b16.setText(letra+"");
            b16.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b17.setText(letra+"");
            b17.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b18.setText(letra+"");
            b18.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b19.setText(letra+"");
            b19.setEnabled(false);
        }
        else if(v.getId() == R.id.b6){
            b20.setText(letra+"");
            b20.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b21.setText(letra+"");
            b21.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b22.setText(letra+"");
            b22.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b23.setText(letra+"");
            b23.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b24.setText(letra+"");
            b24.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b25.setText(letra+"");
            b25.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b26.setText(letra+"");
            b26.setEnabled(false);
        }
        else if(v.getId() == R.id.b6){
            b27.setText(letra+"");
            b27.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b28.setText(letra+"");
            b28.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b29.setText(letra+"");
            b29.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b30.setText(letra+"");
            b30.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b31.setText(letra+"");
            b31.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b32.setText(letra+"");
            b32.setEnabled(false);
        }
        else if(v.getId() == R.id.b9){
            b33.setText(letra+"");
            b33.setEnabled(false);
        }
        else if(v.getId() == R.id.b7){
            b34.setText(letra+"");
            b34.setEnabled(false);
        }
        else if(v.getId() == R.id.b8){
            b35.setText(letra+"");
            b35.setEnabled(false);
        }
        else if(v.getId() == R.id.b9) {
            b36.setText(letra + "");
            b36.setEnabled(false);
        }
        Ganador(letra);
    }

    public void Ganador(char letra){

        if(b1.getText().toString().equals(letra+"") && (b2.getText().toString().equals(letra+"")) && (b3.getText().toString().equals(letra+"")) && (b4.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false);  b15.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b11.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b7.setEnabled(false);   b12.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b8.setEnabled(false);   b13.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b9.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b2.getText().toString().equals(letra+"") && (b3.getText().toString().equals(letra+"")) && (b4.getText().toString().equals(letra+"")) && (b5.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b10.setEnabled(false);  b15.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b11.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b7.setEnabled(false);   b12.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b8.setEnabled(false);   b13.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b9.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b3.getText().toString().equals(letra+"") && (b4.getText().toString().equals(letra+"")) && (b5.getText().toString().equals(letra+"")) && (b6.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b10.setEnabled(false);  b15.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b2.setEnabled(false);   b11.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b7.setEnabled(false);   b12.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b8.setEnabled(false);   b13.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b9.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b7.getText().toString().equals(letra+"") && (b8.getText().toString().equals(letra+"")) && (b9.getText().toString().equals(letra+"")) && (b10.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b15.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b11.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b12.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b13.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b8.getText().toString().equals(letra+"") && (b9.getText().toString().equals(letra+"")) && (b10.getText().toString().equals(letra+"")) && (b11.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b15.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b12.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b13.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b9.getText().toString().equals(letra+"") && (b10.getText().toString().equals(letra+"")) && (b11.getText().toString().equals(letra+"")) && (b12.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b15.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b13.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b13.getText().toString().equals(letra+"") && (b14.getText().toString().equals(letra+"")) && (b15.getText().toString().equals(letra+"")) && (b16.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b14.getText().toString().equals(letra+"") && (b15.getText().toString().equals(letra+"")) && (b16.getText().toString().equals(letra+"")) && (b17.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b15.getText().toString().equals(letra+"") && (b16.getText().toString().equals(letra+"")) && (b17.getText().toString().equals(letra+"")) && (b18.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b19.getText().toString().equals(letra+"") && (b20.getText().toString().equals(letra+"")) && (b21.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b20.getText().toString().equals(letra+"") && (b21.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+"")) && (b23.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b21.getText().toString().equals(letra+"") && (b22.getText().toString().equals(letra+"")) && (b23.getText().toString().equals(letra+"")) && (b24.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if(b25.getText().toString().equals(letra+"") && (b26.getText().toString().equals(letra+"")) && (b27.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b33.setEnabled(false);

        }else if(b26.getText().toString().equals(letra+"") && (b27.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+"")) && (b29.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b33.setEnabled(false);

        }else if(b27.getText().toString().equals(letra+"") && (b28.getText().toString().equals(letra+"")) && (b29.getText().toString().equals(letra+"")) && (b30.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b33.setEnabled(false);

        }else if(b31.getText().toString().equals(letra+"") && (b32.getText().toString().equals(letra+"")) && (b33.getText().toString().equals(letra+"")) && (b34.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);

        }else if(b31.getText().toString().equals(letra+"") && (b32.getText().toString().equals(letra+"")) && (b33.getText().toString().equals(letra+"")) && (b34.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);

        }else if(b32.getText().toString().equals(letra+"") && (b33.getText().toString().equals(letra+"")) && (b34.getText().toString().equals(letra+"")) && (b35.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);

        }else if(b33.getText().toString().equals(letra+"") && (b34.getText().toString().equals(letra+"")) && (b35.getText().toString().equals(letra+"")) && (b36.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b5.setEnabled(false);  b11.setEnabled(false);  b15.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);
            b6.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b19.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);
            //fin horizontal

        }else if (b1.getText().toString().equals(letra+"") && (b7.getText().toString().equals(letra+"")) && (b13.getText().toString().equals(letra+"")) && (b19.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false);  b15.setEnabled(false);  b4.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b6.setEnabled(false);   b11.setEnabled(false);  b16.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b12.setEnabled(false);  b17.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b8.setEnabled(false);   b3.setEnabled(false);  b18.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b9.setEnabled(false);   b14.setEnabled(false);  b18.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b7.getText().toString().equals(letra+"") && (b13.getText().toString().equals(letra+"")) && (b19.getText().toString().equals(letra+"")) && (b25.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);                          b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b13.getText().toString().equals(letra+"") && (b19.getText().toString().equals(letra+"")) && (b25.getText().toString().equals(letra+"")) && (b31.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b7.setEnabled(false);   b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);                          b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b2.getText().toString().equals(letra+"") && (b8.getText().toString().equals(letra+"")) && (b14.getText().toString().equals(letra+"")) && (b20.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b13.setEnabled(false);  b19.setEnabled(false); b25.setEnabled(false);  b31.setEnabled(false);  b7.setEnabled(false);   b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);                          b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b26.getText().toString().equals(letra+"") && (b8.getText().toString().equals(letra+"")) && (b14.getText().toString().equals(letra+"")) && (b20.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b13.setEnabled(false);  b19.setEnabled(false); b25.setEnabled(false);  b31.setEnabled(false);  b7.setEnabled(false);   b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b2.setEnabled(false);                          b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b26.getText().toString().equals(letra+"") && (b32.getText().toString().equals(letra+"")) && (b14.getText().toString().equals(letra+"")) && (b20.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b13.setEnabled(false);  b19.setEnabled(false); b25.setEnabled(false);  b31.setEnabled(false);  b7.setEnabled(false);   b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b2.setEnabled(false);                          b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b8.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b3.getText().toString().equals(letra+"") && (b9.getText().toString().equals(letra+"")) && (b15.getText().toString().equals(letra+"")) && (b21.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b13.setEnabled(false);  b19.setEnabled(false); b25.setEnabled(false);  b31.setEnabled(false);  b7.setEnabled(false);   b30.setEnabled(false);  b35.setEnabled(false);
            b26.setEnabled(false);  b32.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b2.setEnabled(false);                          b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false);  b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b8.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);

        }else if (b9.getText().toString().equals(letra+"") && (b15.getText().toString().equals(letra+"")) && (b21.getText().toString().equals(letra+"")) && (b27.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b15.getText().toString().equals(letra+"") && (b21.getText().toString().equals(letra+"")) && (b27.getText().toString().equals(letra+"")) && (b33.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b9.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b4.getText().toString().equals(letra+"") && (b10.getText().toString().equals(letra+"")) && (b16.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b15.setEnabled(false);  b21.setEnabled(false); b27.setEnabled(false);  b33.setEnabled(false);  b28.setEnabled(false);  b9.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b4.getText().toString().equals(letra+"") && (b10.getText().toString().equals(letra+"")) && (b16.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b15.setEnabled(false);  b21.setEnabled(false); b27.setEnabled(false);  b33.setEnabled(false);  b28.setEnabled(false);  b9.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b10.getText().toString().equals(letra+"") && (b16.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b15.setEnabled(false);  b21.setEnabled(false); b27.setEnabled(false);  b33.setEnabled(false);  b4.setEnabled(false);  b9.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b16.getText().toString().equals(letra+"") && (b22.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+"")) && (b34.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b15.setEnabled(false);  b21.setEnabled(false); b27.setEnabled(false);  b33.setEnabled(false);  b4.setEnabled(false);  b9.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b10.setEnabled(false);

        }else if (b5.getText().toString().equals(letra+"") && (b11.getText().toString().equals(letra+"")) && (b17.getText().toString().equals(letra+"")) && (b23.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b11.getText().toString().equals(letra+"") && (b17.getText().toString().equals(letra+"")) && (b23.getText().toString().equals(letra+"")) && (b29.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b5.setEnabled(false);  b34.setEnabled(false);

        }else if (b17.getText().toString().equals(letra+"") && (b23.getText().toString().equals(letra+"")) && (b29.getText().toString().equals(letra+"")) && (b35.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b11.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b5.setEnabled(false);  b34.setEnabled(false);

        }else if (b6.getText().toString().equals(letra+"") && (b12.getText().toString().equals(letra+"")) && (b18.getText().toString().equals(letra+"")) && (b24.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b17.setEnabled(false);   b23.setEnabled(false); b29.setEnabled(false);  b35.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b12.getText().toString().equals(letra+"") && (b18.getText().toString().equals(letra+"")) && (b24.getText().toString().equals(letra+"")) && (b30.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b6.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b17.setEnabled(false);   b23.setEnabled(false); b29.setEnabled(false);  b35.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b18.getText().toString().equals(letra+"") && (b24.getText().toString().equals(letra+"")) && (b30.getText().toString().equals(letra+"")) && (b36.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b6.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b12.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b17.setEnabled(false);   b23.setEnabled(false); b29.setEnabled(false);  b35.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            //verticales

        }else if (b4.getText().toString().equals(letra+"") && (b9.getText().toString().equals(letra+"")) && (b14.getText().toString().equals(letra+"")) && (b19.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b20.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b15.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b5.getText().toString().equals(letra+"") && (b10.getText().toString().equals(letra+"")) && (b15.getText().toString().equals(letra+"")) && (b20.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b10.getText().toString().equals(letra+"") && (b15.getText().toString().equals(letra+"")) && (b20.getText().toString().equals(letra+"")) && (b25.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b5.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b6.getText().toString().equals(letra+"") && (b11.getText().toString().equals(letra+"")) && (b16.getText().toString().equals(letra+"")) && (b21.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b5.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b11.getText().toString().equals(letra+"") && (b16.getText().toString().equals(letra+"")) && (b21.getText().toString().equals(letra+"")) && (b26.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b6.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b5.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b16.getText().toString().equals(letra+"") && (b21.getText().toString().equals(letra+"")) && (b26.getText().toString().equals(letra+"")) && (b31.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b6.setEnabled(false);  b11.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b15.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b5.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b12.getText().toString().equals(letra+"") && (b17.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+"")) && (b27.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b4.setEnabled(false);   b9.setEnabled(false); b15.setEnabled(false);  b21.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b17.getText().toString().equals(letra+"") && (b22.getText().toString().equals(letra+"")) && (b27.getText().toString().equals(letra+"")) && (b32.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b19.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b12.setEnabled(false);
            b4.setEnabled(false);   b9.setEnabled(false); b15.setEnabled(false);  b21.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b18.getText().toString().equals(letra+"") && (b23.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+"")) && (b33.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b34.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b29.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b13.setEnabled(false);  b36.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);
            b4.setEnabled(false);   b9.setEnabled(false); b14.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b15.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);

        }else if (b3.getText().toString().equals(letra+"") && (b10.getText().toString().equals(letra+"")) && (b17.getText().toString().equals(letra+"")) && (b24.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b16.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b34.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b29.setEnabled(false);  b35.setEnabled(false);
            b18.setEnabled(false);  b8.setEnabled(false); b13.setEnabled(false);  b36.setEnabled(false);  b33.setEnabled(false);  b30.setEnabled(false);
            b4.setEnabled(false);   b9.setEnabled(false); b14.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);
            b5.setEnabled(false);   b28.setEnabled(false); b15.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);

        }else if (b2.getText().toString().equals(letra+"") && (b9.getText().toString().equals(letra+"")) && (b16.getText().toString().equals(letra+"")) && (b23.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b33.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b34.setEnabled(false);
            b18.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b29.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b13.setEnabled(false);  b36.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);
            b4.setEnabled(false);   b28.setEnabled(false); b14.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b15.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);

        }else if (b9.getText().toString().equals(letra+"") && (b16.getText().toString().equals(letra+"")) && (b23.getText().toString().equals(letra+"")) && (b30.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b33.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b34.setEnabled(false);
            b18.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b17.setEnabled(false);  b22.setEnabled(false);  b29.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b13.setEnabled(false);  b36.setEnabled(false);  b24.setEnabled(false);  b2.setEnabled(false);
            b4.setEnabled(false);   b28.setEnabled(false); b14.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b15.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);

        }else if (b1.getText().toString().equals(letra+"") && (b8.getText().toString().equals(letra+"")) && (b15.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);

        }else if (b8.getText().toString().equals(letra+"") && (b15.getText().toString().equals(letra+"")) && (b22.getText().toString().equals(letra+"")) && (b29.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b1.setEnabled(false);  b34.setEnabled(false);

        }else if (b15.getText().toString().equals(letra+"") && (b22.getText().toString().equals(letra+"")) && (b29.getText().toString().equals(letra+"")) && (b36.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false);  b14.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b31.setEnabled(false);  b15.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b21.setEnabled(false);  b27.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b28.setEnabled(false);  b33.setEnabled(false);
            b6.setEnabled(false);   b12.setEnabled(false); b18.setEnabled(false);  b24.setEnabled(false);  b1.setEnabled(false);  b34.setEnabled(false);

        }else if (b7.getText().toString().equals(letra+"") && (b14.getText().toString().equals(letra+"")) && (b21.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);  b36.setEnabled(false);
            b2.setEnabled(false);   b8.setEnabled(false);  b13.setEnabled(false);  b19.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);  b24.setEnabled(false);
            b3.setEnabled(false);   b9.setEnabled(false); b15.setEnabled(false);  b20.setEnabled(false);  b27.setEnabled(false);  b33.setEnabled(false);
            b4.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b5.setEnabled(false);   b11.setEnabled(false); b17.setEnabled(false);  b23.setEnabled(false);  b30.setEnabled(false);  b35.setEnabled(false);

        }else if (b14.getText().toString().equals(letra+"") && (b21.getText().toString().equals(letra+"")) && (b28.getText().toString().equals(letra+"")) && (b35.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b34.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b13.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);
            b4.setEnabled(false);   b9.setEnabled(false); b15.setEnabled(false);  b20.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b27.setEnabled(false);  b33.setEnabled(false);

        }else if (b13.getText().toString().equals(letra+"") && (b20.getText().toString().equals(letra+"")) && (b27.getText().toString().equals(letra+"")) && (b34.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            b1.setEnabled(false);   b6.setEnabled(false);  b11.setEnabled(false);  b17.setEnabled(false);  b23.setEnabled(false);  b29.setEnabled(false);  b35.setEnabled(false);
            b2.setEnabled(false);   b7.setEnabled(false);  b12.setEnabled(false);  b18.setEnabled(false);  b24.setEnabled(false);  b30.setEnabled(false);  b36.setEnabled(false);
            b3.setEnabled(false);   b8.setEnabled(false); b14.setEnabled(false);  b19.setEnabled(false);  b25.setEnabled(false);  b31.setEnabled(false);
            b4.setEnabled(false);   b9.setEnabled(false); b15.setEnabled(false);  b21.setEnabled(false);  b26.setEnabled(false);  b32.setEnabled(false);
            b5.setEnabled(false);   b10.setEnabled(false); b16.setEnabled(false);  b22.setEnabled(false);  b28.setEnabled(false);  b3.setEnabled(false);
        }else if(conta<9){
            conta++;
        }else {
            Et_Ganador.setText("Empate");
        }
    }
}