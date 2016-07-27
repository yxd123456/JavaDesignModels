package asus.observermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_newspaper;

    NewspaperOffice office;
    Jim jim;
    LiLei liLei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        office = new NewspaperOffice();
        et_newspaper = (EditText) findViewById(R.id.et_newspaper);
        jim = new Jim(office);
        liLei = new LiLei(office);
    }

    public void send(View v){
        office.sendNewspaper(et_newspaper.getText().toString());
    }

}
