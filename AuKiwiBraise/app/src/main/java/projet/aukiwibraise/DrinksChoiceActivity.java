package projet.aukiwibraise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DrinksChoiceActivity extends Activity {
    //Instanciation
    ListView listeVue = null;
    String[][] vins = new String[][] {
            {"Vins de table (25cl)", "7€"},
            {"Vin fruité (25cl)", "15€"},
            {"Vin de kiwi (30cl)", "22€"},
            {"Vin des îles (35cl)", "30€"},
            {"Almarone della Valpolicella (25cl)", "65€"}
    };
    String[][] boissons = new String[][] {
            {"Eau (33cl)", "1€"},
            {"Coca-cola (33cl)", "3€"},
            {"Vin fruité (25cl)", "15€"},
            {"Vin de kiwi (30cl)", "22€"},
            {"Vin des îles (35cl)", "30€"},
            {"Almarone della Valpolicella (25cl)", "65€"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_choice);

        listeVue = (ListView) findViewById(R.id.main_list);

        //Si on choisit un vin
        if(Commande.isWine) {
            //On insere données dans ArrayList avec HashMap
            List<HashMap<String, String>> liste = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> element;
            for (int i = 0; i < vins.length; i++) {
                element = new HashMap<String, String>();
                element.put("vins1", vins[i][0]);
                element.put("vins2", vins[i][1]);
                liste.add(element);
            }

            //On fait l'adapter
            String[] from = new String[]{"vins1", "vins2"};
            int[] to = new int[]{android.R.id.text1, android.R.id.text2};
            ListAdapter adapter = new SimpleAdapter(this, liste, android.R.layout.simple_list_item_2, from, to);
            listeVue.setAdapter(adapter);
        }
        //sinon
        else {
            //On insere données dans ArrayList avec HashMap
            List<HashMap<String, String>> liste = new ArrayList<HashMap<String, String>>();
            HashMap<String, String> element;
            for (int i = 0; i < boissons.length; i++) {
                element = new HashMap<String, String>();
                element.put("boissons1", boissons[i][0]);
                element.put("boissons2", boissons[i][1]);
                liste.add(element);
            }

            //On fait l'adapter
            String[] from = new String[]{"boissons1", "boissons2"};
            int[] to = new int[]{android.R.id.text1, android.R.id.text2};
            ListAdapter adapter = new SimpleAdapter(this, liste, android.R.layout.simple_list_item_2, from, to);
            listeVue.setAdapter(adapter);
        }
    }

    public void valide_btn(View view) {
        Intent intent=new Intent(DrinksChoiceActivity.this,ResumeActivity.class);
        finish();
        startActivity(intent);
    }

    public void return_btn(View view) {
        Intent intent_back=new Intent(DrinksChoiceActivity.this,DrinksActivity.class);
        finish();
        startActivity(intent_back);
    }
}
