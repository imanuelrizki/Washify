package projek.washify.pemesanan;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import projek.washify.R;

public class halaman_pemesanan extends Activity {


    private View _bg__halaman_pemesanan_ek2;
    private View rectangle_11;
    private View rectangle_12;
    private View rectangle_1;
    private View rectangle_13;
    private View rectangle_2;
    private View rectangle_3;
    private View rectangle_4;
    private TextView services;
    private TextView welcome_back_;
    private TextView get_60__discount_in_premium_laundry;
    private TextView hey_radith_;
    private View tshirt_5510120_1;
    private View rectangle_9;
    private View ellipse_2;
    private View ellipse_3;
    private View _bg__setting_fill_ek1;
    private ImageView vector;
    private ImageView account_circle;
    private ImageView account_circle_ek1;
    private ImageView reviews;
    private ImageView reviews_ek1;
    private ImageView aq_indoor;
    private ImageView aq_indoor_ek1;
    private View rectangle_121;
    private TextView wash___iron;

    private View tshirt_5510120_2;
    private View rectangle_123;
    private TextView ironing;

    private View tshirt_5510120_3;
    private View rectangle_125;
    private TextView dry_wash;
    private View tshirt_5510120_4;
    private View rectangle_127;
    private TextView premium_laundry;
    private View rectangle_10;
    private ImageView local_laundry_service;
    private View rectangle_117;
    private TextView grab_the_deal_;
    private ImageView device_reset;
    private ImageView washing_machine_1104664_1;
    private ImageView steam_iron_3224589_1;
    private ImageView shirt_10725407_1;
    private TextView search_for_a_servies_and_package___;
    private ImageView image_9;

    View rectangle_14;
    View rectangle_5;
    View rectangle_122;
    View rectangle_124;
    View rectangle_126;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_halaman_pemesanan1);

        rectangle_14 = (View) findViewById(R.id.rectangle_14);

        rectangle_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaPemesananSelanjutnya = new Intent(getApplicationContext(), halaman_pemesanan_activity.class);
                startActivity(BukaPemesananSelanjutnya);
            }
        });

        rectangle_5 = (View) findViewById(R.id.rectangle_5);

        rectangle_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaLayanan1 = new Intent(getApplicationContext(), halaman_pemesanan_activity.class);
                startActivity(BukaLayanan1);
            }
        });

        rectangle_122 = (View) findViewById(R.id.rectangle_122);

        rectangle_122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaLayanan2 = new Intent(getApplicationContext(), halaman_pemesanan_activity.class);
                startActivity(BukaLayanan2);
            }
        });

        rectangle_124 = (View) findViewById(R.id.rectangle_124);

        rectangle_124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaLayanan3 = new Intent(getApplicationContext(), halaman_pemesanan_activity.class);
                startActivity(BukaLayanan3);
            }
        });

        rectangle_126 = (View) findViewById(R.id.rectangle_126);

        rectangle_126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaLayanan4 = new Intent(getApplicationContext(), KetersediaanActivity.class);
                startActivity(BukaLayanan4);
            }
        });


        rectangle_12 = (View) findViewById(R.id.rectangle_12);
        rectangle_13 = (View) findViewById(R.id.rectangle_13);
        rectangle_2 = (View) findViewById(R.id.rectangle_2);
        rectangle_3 = (View) findViewById(R.id.rectangle_3);
        rectangle_4 = (View) findViewById(R.id.rectangle_4);
        services = (TextView) findViewById(R.id.services);
        welcome_back_ = (TextView) findViewById(R.id.welcome_back_);
        get_60__discount_in_premium_laundry = (TextView) findViewById(R.id.get_60__discount_in_premium_laundry);
        hey_radith_ = (TextView) findViewById(R.id.hey_radith_);
        rectangle_5 = (View) findViewById(R.id.rectangle_5);
        rectangle_9 = (View) findViewById(R.id.rectangle_9);
        ellipse_2 = (View) findViewById(R.id.ellipse_2);
        ellipse_3 = (View) findViewById(R.id.ellipse_3);
        vector = (ImageView) findViewById(R.id.vector);
        account_circle_ek1 = (ImageView) findViewById(R.id.account_circle_ek1);
        reviews_ek1 = (ImageView) findViewById(R.id.reviews_ek1);
        aq_indoor_ek1 = (ImageView) findViewById(R.id.aq_indoor_ek1);
        rectangle_121 = (View) findViewById(R.id.rectangle_121);
        wash___iron = (TextView) findViewById(R.id.wash___iron);
        rectangle_122 = (View) findViewById(R.id.rectangle_122);
        rectangle_123 = (View) findViewById(R.id.rectangle_123);
        ironing = (TextView) findViewById(R.id.ironing);
        rectangle_124 = (View) findViewById(R.id.rectangle_124);
        rectangle_125 = (View) findViewById(R.id.rectangle_125);
        dry_wash = (TextView) findViewById(R.id.dry_wash);
        rectangle_126 = (View) findViewById(R.id.rectangle_126);
        rectangle_127 = (View) findViewById(R.id.rectangle_127);
        premium_laundry = (TextView) findViewById(R.id.premium_laundry);
        local_laundry_service = (ImageView) findViewById(R.id.local_laundry_service);
        rectangle_117 = (View) findViewById(R.id.rectangle_117);
        grab_the_deal_ = (TextView) findViewById(R.id.grab_the_deal_);
        device_reset = (ImageView) findViewById(R.id.device_reset);
        washing_machine_1104664_1 = (ImageView) findViewById(R.id.washing_machine_1104664_1);
        steam_iron_3224589_1 = (ImageView) findViewById(R.id.steam_iron_3224589_1);
        shirt_10725407_1 = (ImageView) findViewById(R.id.shirt_10725407_1);
        search_for_a_servies_and_package___ = (TextView) findViewById(R.id.search_for_a_servies_and_package___);
        image_9 = (ImageView) findViewById(R.id.image_9);




    }
}

