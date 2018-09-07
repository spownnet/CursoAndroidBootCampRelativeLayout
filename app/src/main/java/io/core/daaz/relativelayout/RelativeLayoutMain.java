package io.core.daaz.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelativeLayoutMain extends AppCompatActivity {

    double rst;
    String lastsymbol;
    StringBuilder rs;
    TextView tv;
    Button btncero;
    Button btnuno;
    Button btndos;
    Button btntres;
    Button btncuatro;
    Button btncinco;
    Button btnseis;
    Button btnsiete;
    Button btnocho;
    Button btnnueve;
    Button btnsignomas;
    Button btnsignomenos;
    Button btndividir;
    Button btnpor;
    Button btnpunto;
    Button btnigual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout_experiment);
        lastsymbol = "";
        rst = 0.00;
        rs = new StringBuilder();
        tv = findViewById(R.id.txtresult);
        btncero = findViewById(R.id.btnzero);
        btnuno = findViewById(R.id.btnone);
        btndos = findViewById(R.id.btntwo);
        btntres = findViewById(R.id.btnthree);
        btncuatro = findViewById(R.id.btncuatro);
        btncinco = findViewById(R.id.btncinco);
        btnseis = findViewById(R.id.btnseis);
        btnsiete = findViewById(R.id.btnsiete);
        btnocho = findViewById(R.id.btnocho);
        btnnueve = findViewById(R.id.btnnueve);
        btnsignomas = findViewById(R.id.btnplus);
        btnsignomenos = findViewById(R.id.btnmenos);
        btndividir = findViewById(R.id.btnplusminus);
        btnpor = findViewById(R.id.btnpor);
        btnpunto = findViewById(R.id.btnpoint);
        btnigual = findViewById(R.id.btnequal);


        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnsignomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo - Investigar para corregir
                //rst = Double.parseDouble(getTextView());
                //lastsymbol = ((Button)v).getText().toString();
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnsignomenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs.append(((Button)v).getText());
                setTextView(rs.toString());
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextView(rs.toString());
            }
        });
    }

    public void setTextView (String s){
        tv.setText(s);
    }
    public String getTextView (){
        return tv.getText().toString();
    }
}
