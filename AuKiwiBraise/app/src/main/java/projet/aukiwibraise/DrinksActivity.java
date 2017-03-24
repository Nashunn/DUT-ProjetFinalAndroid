package projet.aukiwibraise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DrinksActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    //Methodes de retour
    public void retour_btn(View view) {
        Intent intent_back=new Intent(DrinksActivity.this,CarteActivity.class);
        finish();
        startActivity(intent_back);
    }

    public void btn_click_wines(View view) {
        Commande.isWine=true;
        Intent intent=new Intent(DrinksActivity.this,DrinksChoiceActivity.class);
        finish();
        startActivity(intent);
    }
    public void btn_click_drinks(View view) {
        Commande.isWine=false;
        Intent intent=new Intent(DrinksActivity.this,DrinksChoiceActivity.class);
        finish();
        startActivity(intent);
    }
}
