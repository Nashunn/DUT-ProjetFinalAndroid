package projet.aukiwibraise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormuleActivity extends AppCompatActivity {
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
            menu = "epd";
        else if(button_choix.getId()==bouton_ep.getId())
            menu = "ep";
        else
            menu="pd";


        Toast.makeText(FormuleActivity.this,button_choix.getText(), Toast.LENGTH_LONG).show();
    }
}