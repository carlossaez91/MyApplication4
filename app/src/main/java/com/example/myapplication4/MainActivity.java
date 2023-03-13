package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void showImagePopup(View view) {
            // Crea un diálogo personalizado
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.custom_dialog);

            // Busca el ImageView en el diálogo personalizado
            ImageView imageView = dialog.findViewById(R.id.imageView);

            // Carga la imagen desde la URL utilizando Glide
            String url = "https://www.amazon.com/images/P/B07Z9PPYSH";
            Glide.with(this).load(url).into(imageView);

            // Muestra el diálogo personalizado
            dialog.show();
        }
    }

