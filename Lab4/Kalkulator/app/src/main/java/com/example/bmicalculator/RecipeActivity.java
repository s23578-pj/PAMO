package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        Button goToBmiCalculatorButton = findViewById(R.id.goToBmiCalculatorButton);
        goToBmiCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        final ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe(
                "Kurczak z ryżem i warzywami",
                "Dla prawdziwych dzików.",
                "Składniki:\n- Filet z kurczaka\n- Ryż brązowy\n- Marchew\n- Groszek\n- Papryka",
                "Sposób przygotowania:\n1. Ugotuj ryż według instrukcji na opakowaniu.\n2. Pokrój kurczaka na kawałki i usmaż na patelni.\n3. Pokrój warzywa i podsmaż na patelni.\n4. Podawaj kurczaka i warzywa na ugotowanym ryżu.\n\n Wartości odżywcze (na 100g)\n- Białko: 30g\n- Węglowodany: 40g\n- Tłuszcz: 10g\n- Błonnik: 5g\n- Kalorie: około 350-400 kcal"));

        recipes.add(new Recipe(
                "Smoothie owocowe",
                "Orzeźwiający napój owocowy.",
                "Składniki:\n- banan\n- truskawki\n- jogurt naturalny\n- miód",
                "Sposób przygotowania:\n1. Wszystkie składniki umieść w blenderze.\n2. Blenduj do uzyskania gładkiej konsystencji.\n\n Wartości odżywcze (na 100g)\n- Białko: 5g\n- Węglowodany: 35g\n- Tłuszcz: 3g\n- Błonnik: 4g\n- Kalorie: około 150-250 kcal"));
        recipes.add(new Recipe(
                "Sałatka z tuńczykiem",
                "Pyszna Sałatka z tuńczykiem - bogate w kwasy OMEGA",
                "Składniki:\n- Sałata mix\n- Tuńczyk w wodzie\n- Pomidory koktajlowe\n- jajko na twardo\n- Ogórek\n- Awokado",
                "Sposób przygotowania:\n1. Pokrój wszystkie składniki.\n2. Wymieszaj razem w dużej misce.\n3. Dodaj tuńczyka.\n4. Posyp startym jajkiem na wierzchu.\n\n Wartości odżywcze (na 100g)\n- Białko: 25g\n- Węglowodany: 3.5g\n- Tłuszcz: 10g\n- Błonnik: 5g\n- Kalorie: około 250-300 kcal"));
        recipes.add(new Recipe(
                "Twaróg 0% tłuszczu na słodko",
                "Posiłek deserowy z ogromną ilością białka",
                "Składniki:\n- kostka twarogu 0% 250g\n- dżem 0% cukru dowolny smak\n- Opcjonalnie: banan, borówki, ananas",
                "Sposób przygotowania:\n1. Twaróg wsadź do miski.\n2. Dodaj dżemu w proporcji 1/5 twarogu.\n3. dorzuć swoje ulubione owoce dla wzbogacenia smaku i gotowe!.\n\n Wartości odżywcze (na 100g)\n- Białko: 19g\n- Węglowodany: 15g\n- Tłuszcz: >1g\n- Błonnik: 0g\n- Kalorie: 100 kcal"));

        ListView listView = findViewById(R.id.recipeListView);
        ArrayAdapter<Recipe> adapter = new ArrayAdapter<Recipe>(this, android.R.layout.simple_list_item_1, recipes) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
                }
                TextView textView = convertView.findViewById(android.R.id.text1);
                textView.setText(getItem(position).getName());
                return convertView;
            }
        };
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Recipe recipe = recipes.get(position);
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(RecipeActivity.this);
                dialogBuilder.setTitle(recipe.getName());
                dialogBuilder.setMessage(recipe.getDescription() + "\n\n" + recipe.getIngredients() + "\n\n" + recipe.getInstructions());
                dialogBuilder.setPositiveButton("OK", null);
                dialogBuilder.show();
            }
        });

    }
}
