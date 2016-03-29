package gameapps.chinesechess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class main extends AppCompatActivity implements View.OnClickListener{
    private Button btnPlay;
    private TextView tvresult;
    private EditText num1,num2;

    @Override
    protected void onCreate (Bundle SavedInstanceState)  {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnPlay = (Button)findViewById(R.id.playbtn);
        btnPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Board.class);
        startActivity(intent);
    }
}