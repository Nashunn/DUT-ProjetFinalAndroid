package projet.aukiwibraise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormuleActivity extends Activity {
    //Instanciation
    public static String menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formule);
    }

    //Fonction pour choisir la formule
    public void choisir_formule(View w)
    {
        int id_view = w.getId();
        Button button_choix = (Button)findViewById(id_view);

        Button bouton_epd = (Button)findViewById(R.id.b_epd);
        Button bouton_ep = (Button)findViewById(R.id.b_ep);
        Button bouton_pd = (Button)findViewById(R.id.b_pd);

        if(button_choix.getId()==bouton_epd.getId())
            menu = "KiwiManjaro";
        else if(button_choix.getId()==bouton_ep.getId())
            menu = "Le Plumé";
        else
            menu="Le Fruité";

        Commande.formule = menu;
        //Lien vers les vins (a enlever pour faire le lien vers la carte formule)
        Intent intent=new Intent(FormuleActivity.this,CarteActivity.class);
        finish();
        startActivity(intent);
    }

    //Methodes de retour
    public void retour_btn(View view) {
        Intent intent_back=new Intent(FormuleActivity.this,KiwiActivity.class);
        finish();
        startActivity(intent_back);
    }
}