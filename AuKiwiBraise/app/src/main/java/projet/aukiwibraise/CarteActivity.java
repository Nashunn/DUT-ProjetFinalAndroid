package projet.aukiwibraise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CarteActivity extends Activity {
    //Instanciation
    Spinner spinner;
    ArrayAdapter adapter;
    List liste_entree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carte);

        String commande = Commande.formule;

        if(commande.equals("Le Plumé") || commande.equals("KiwiManjaro"))
        {
            spinner = (Spinner) findViewById(R.id.list_e);
            liste_entree = new ArrayList();
            liste_entree.add("Celeri de kiwis");
            liste_entree.add("Tomate cerise et kiwis");
            liste_entree.add("Salade de kiwis");
            liste_entree.add("Tartine de fromage-kiwi");
            liste_entree.add("Patte de kiwi panés");
            liste_entree.add("Brochette de kiwi");

            adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,liste_entree);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setVisibility(spinner.GONE);
            spinner.setAdapter(adapter);

        }


        if(commande.equals("Le Fruité") || commande.equals("KiwiManjaro"))
        {
            spinner = (Spinner) findViewById(R.id.list_d);
            List liste_dessert = new ArrayList();
            liste_dessert.add("Glace kiwi-chantilly");
            liste_dessert.add("Crème brulée au kiwi");
            liste_dessert.add("Kiwi-caramel");
            liste_dessert.add("Baba au rhum et son kiwi");
            liste_dessert.add("Barbe à kiwi");
            liste_dessert.add("Tournicoti de kiwis");

            adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,liste_dessert);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setVisibility(spinner.GONE);
            spinner.setAdapter(adapter);

        }


        spinner = (Spinner) findViewById(R.id.list_p);
        List liste_plat = new ArrayList();
        liste_plat.add("Kiwi à la braise");
        liste_plat.add("Pizza 4 kiwis");
        liste_plat.add("Kiwi bolognaise");
        liste_plat.add("Kiwi sauce samuraï");
        liste_plat.add("Tartare de kiwi");
        liste_plat.add("Curry au kiwi");
        liste_plat.add("Retournée de kiwi");

        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,liste_plat);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setVisibility(spinner.GONE);
        spinner.setAdapter(adapter);


        if(commande.equals("Le Plumé"))
        {

            TextView dessert = (TextView) findViewById(R.id.tw_d);
            dessert.setVisibility(View.GONE);
            Spinner spinner_desser = (Spinner) findViewById(R.id.list_d);
            spinner_desser.setVisibility(View.GONE);

        }

        else if(commande.equals("Le Fruité"))
        {
            TextView entree = (TextView) findViewById(R.id.tw_e);
            entree.setVisibility(View.GONE);
            Spinner spinner_entree = (Spinner) findViewById(R.id.list_e);
            spinner_entree.setVisibility(View.GONE);

        }
    }

    public void affiche_entree(View w)
    {
        Spinner spinner = (Spinner) findViewById(R.id.list_e);
        if(spinner.getVisibility()==View.GONE)
            spinner.setVisibility(View.VISIBLE);
    }

    public void affiche_plat(View w)
    {
        Spinner spinner = (Spinner) findViewById(R.id.list_p);
        if(spinner.getVisibility()==View.GONE)
            spinner.setVisibility(View.VISIBLE);
    }

    public void affiche_dessert(View w)
    {
        Spinner spinner = (Spinner) findViewById(R.id.list_d);
        if(spinner.getVisibility()==View.GONE)
            spinner.setVisibility(View.VISIBLE);
    }

    public void valide_compo_menu(View v)
    {
        Spinner spinner_dessert = (Spinner) findViewById(R.id.list_d);
        Spinner spinner_plat = (Spinner) findViewById(R.id.list_p);
        Spinner spinner_entree = (Spinner) findViewById(R.id.list_e);

        if(Commande.formule.equals("KiwiManjaro") || Commande.formule.equals("Le Fruité"))
            Commande.setDessert(spinner_dessert.getSelectedItem().toString());
        if(Commande.formule.equals("KiwiManjaro") || Commande.formule.equals("Le Plumé"))
            Commande.setEntree(spinner_entree.getSelectedItem().toString());

        Commande.setPlat(spinner_plat.getSelectedItem().toString());
        Log.i("Info",Commande.affiche_resume());

        Intent intent=new Intent(CarteActivity.this,DrinksActivity.class);
        finish();
        startActivity(intent);
    }

    public void return_btn(View view) {
        Intent intent=new Intent(CarteActivity.this,FormuleActivity.class);
        finish();
        startActivity(intent);
    }
}
