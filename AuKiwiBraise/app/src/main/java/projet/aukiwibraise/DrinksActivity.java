package projet.aukiwibraise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    //Methodes de retour
    public void retour_btn(View view) {
        Intent intent_back=new Intent(DrinksActivity.this,FormuleActivity.class);
        finish();
        startActivity(intent_back);
    }

    public void bar_click(View view) {
        //Lien vers les vins (a enlever pour faire le lien vers la carte formule)
        Intent intent=new Intent(DrinksActivity.this,CarteActivity.class);
        finish();
        startActivity(intent);
    }
}
