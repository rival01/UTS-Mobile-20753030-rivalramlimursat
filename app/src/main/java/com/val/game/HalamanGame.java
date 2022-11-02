package com.val.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HalamanGame extends AppCompatActivity {

    TextView tvName, tvDescription;
    ImageView imgPhoto;
    Topup gameModel;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_game);

        tvName = findViewById(R.id.tv_name_detail);
        tvDescription = findViewById(R.id.tv_description_detail);
        imgPhoto = findViewById(R.id.iv_photo);
        intent = getIntent();

        if(intent != null) {
            gameModel = (Topup) intent.getParcelableExtra("data");
            String name = gameModel.getName();
            String description = gameModel.getDescription();

            tvName.setText(name);
            tvDescription.setText(description);
            imgPhoto.setImageResource(gameModel.getPhoto());
        }
    }
}