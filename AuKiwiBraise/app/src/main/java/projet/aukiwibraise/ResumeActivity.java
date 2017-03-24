package projet.aukiwibraise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ResumeActivity extends Activity {
    //instanciation
    TextView resume_textV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        TextView formule = (TextView) findViewById(R.id.tw_fomule);
        TextView nom_form = (TextView) findViewById(R.id.nomformule);
        TextView choix = (TextView) findViewById(R.id.choix);
        TextView tw_boisson = (TextView) findViewById(R.id.tw_boisson);
        TextView laboisson = (TextView) findViewById(R.id.la_boisson);
        TextView total = (TextView) findViewById(R.id.total);

        formule.setText("Formule - "+Commande.prix_formule);
        nom_form.setText(Commande.formule);
        choix.setText(Commande.getEntree()+"\n"+Commande.getPlat()+"\n"+Commande.getDessert());
        tw_boisson.setText("Boisson - "+Commande.prix_boisson);
        laboisson.setText(Commande.boisson);
        total.setText("Total : "+Commande.prix);
    }
}
