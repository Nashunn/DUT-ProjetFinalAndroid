package projet.aukiwibraise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class KiwiActivity extends Activity {
    //instanciation
    LinearLayout accueil_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiwi);

        //On recupere le layout de l'accueil
        accueil_layout = (LinearLayout) findViewById(R.id.activity_kiwi);
        //On rajoute le listener
        accueil_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //On passe à l'ecran des formules
                Intent intent=new Intent(KiwiActivity.this,FormuleActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
