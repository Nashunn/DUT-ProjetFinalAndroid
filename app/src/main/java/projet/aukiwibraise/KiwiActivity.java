package projet.aukiwibraise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class KiwiActivity extends AppCompatActivity {
    //instanciation
    LinearLayout accueil_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiwi);
        //On recupere le layout de l'accueil
        accueil_layout=(LinearLayout) findViewById(R.id.activity_kiwi);
        //On rajoute le listener
        accueil_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KiwiActivity.this, "This is my Toast message!", Toast.LENGTH_LONG).show();
                /*
                AJOUT : a ajouter pour passer d'une activité a l'autre

                Intent intent=new Intent(MainActivity.this,Second.class);
                finish();
                startActivity(intent);
                */
            }
    }
}
