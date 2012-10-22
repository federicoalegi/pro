package com.example.primoesercizio;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = new TextView(this);
        tv.setTextColor(Color.parseColor("#FF3333"));
        tv.setText("Un Somaro diceva: Anticamente,quanno nun cera la democrazzia,la classe nostra nun valeva gnente.Mi nonno, infatti, per ave raggione se coprì co la pelle dun Leone e fu trattato rispettosamente. So cambiati li tempi, amico caro:fece el Leone - ormai la pelle mia nun serve più nemmeno da riparo. Oggi, purtroppo, ho perso l infruenza, e ogni tanto so io che pe prudenza me copro co la pelle de somaro!" );
        setContentView(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
