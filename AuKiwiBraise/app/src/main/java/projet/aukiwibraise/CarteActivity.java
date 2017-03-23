package projet.aukiwibraise;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class CarteActivity extends Activity {
    //Instanciation
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carte);

        spinner = (Spinner) findViewById(R.id.list_e);
        List liste_entree = new ArrayList();
        liste_entree.add("Entrée 1");
        liste_entree.add("Entrée 2");
        liste_entree.add("Entrée 3");
        liste_entree.add("Entrée 4");
        liste_entree.add("Entrée 5");
        liste_entree.add("Entrée 6");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,liste_entree);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setVisibility(spinner.GONE);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.list_p);
        List liste_plat = new ArrayList();
        liste_plat.add("Plat 1");
        liste_plat.add("Plat 2");
        liste_plat.add("Plat 3");
        liste_plat.add("Plat 4");
        liste_plat.add("Plat 5");
        liste_plat.add("Plat 6");

        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,liste_plat);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setVisibility(spinner.GONE);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.list_d);
        List liste_dessert = new ArrayList();
        liste_dessert.add("Dessert 1");
        liste_dessert.add("Dessert 2");
        liste_dessert.add("Dessert 3");
        liste_dessert.add("Dessert 4");
        liste_dessert.add("Dessert 5");
        liste_dessert.add("Dessert 6");

        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,liste_dessert);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setVisibility(spinner.GONE);
        spinner.setAdapter(adapter);
    }

    public void affiche_entree(View w)
    {
        Spinner spinner = (Spinner) findViewById(R.id.list_e);
        if(spinner.getVisibility()==View.GONE)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.GONE);
    }

    public void affiche_plat(View w)
    {
        Spinner spinner = (Spinner) findViewById(R.id.list_p);
        if(spinner.getVisibility()==View.GONE)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.GONE);
    }

    public void affiche_dessert(View w)
    {
        Spinner spinner = (Spinner) findViewById(R.id.list_d);
        if(spinner.getVisibility()==View.GONE)
            spinner.setVisibility(View.VISIBLE);
        else
            spinner.setVisibility(View.GONE);
    }
}
