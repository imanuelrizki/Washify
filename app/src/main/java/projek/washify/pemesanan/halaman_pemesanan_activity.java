package projek.washify.pemesanan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import projek.washify.R;
import projek.washify.pemesanan.LayananLaundry.SelectServiceActivity;
import projek.washify.pemesanan.pickupschedule.MainPickupSchedule;

public class halaman_pemesanan_activity extends Activity {


    private View _bg__halaman_pemesanan_ek2;
    private TextView order;
    private TextView your_clothes;
    private View rectangle_15;
    private View rectangle_22;
    private TextView payment;
    private TextView t_shirt;
    private TextView gold_member;
    private TextView _5;
    private TextView rp_500;
    private TextView man;
    private ImageView tshirt_5510120_1;
    private View ellipse_5;
    private View ellipse_6;
    private TextView __;
    private TextView ___ek1;
    private View rectangle_23;
    private TextView pants;
    private TextView _3;
    private TextView rp_500_ek1;
    private TextView man_ek1;
    private View ellipse_7;
    private View ellipse_8;
    private TextView ___ek2;
    private TextView ___ek3;
    private View rectangle_24;
    private View rectangle_25;
    private TextView comments;
    private View rectangle_26;
    private TextView outerwear;
    private TextView _1;
    private TextView rp_500_ek2;
    private TextView man_ek2;
    private View ellipse_9;
    private View ellipse_10;
    private TextView ___ek4;
    private TextView ___ek5;
    private ImageView arrow_forward;
    private ImageView image_8;
    private ImageView trouser_10770140_2;
    private ImageView hoodie_2122562_2;
    private TextView tolong_untuk_rapih_ya____;
    private Button btPickupschedule;
    private Button btLayananLaundry;


    ImageView arrow_back;
    ImageView add;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_halaman_pemesanan);

        arrow_back = (ImageView) findViewById(R.id.arrow_back2);

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembaliKePemesanan = new Intent(getApplicationContext(), halaman_pemesanan.class);
                startActivity(kembaliKePemesanan);
            }
        });

        add = (ImageView) findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Listbanyakbaju = new Intent(getApplicationContext(), MainPemesanan.class);
                startActivity(Listbanyakbaju);
            }
        });



        _bg__halaman_pemesanan_ek2 = (View) findViewById(R.id._bg__halaman_pemesanan_ek2);
        order = (TextView) findViewById(R.id.order);
        your_clothes = (TextView) findViewById(R.id.your_clothes);
        rectangle_15 = (View) findViewById(R.id.rectangle_15);
        rectangle_22 = (View) findViewById(R.id.rectangle_22);
        payment = (TextView) findViewById(R.id.payment);
        t_shirt = (TextView) findViewById(R.id.tvjenisbaju);
        _5 = (TextView) findViewById(R.id._5);
        rp_500 = (TextView) findViewById(R.id.tvharga);
        man = (TextView) findViewById(R.id.tvgender);
        tshirt_5510120_1 = (ImageView) findViewById(R.id.tshirt_5510120_1);
        rectangle_23 = (View) findViewById(R.id.rectangle_23);
        pants = (TextView) findViewById(R.id.pants);
        _3 = (TextView) findViewById(R.id._3);
        rp_500_ek1 = (TextView) findViewById(R.id.rp_500_ek1);
        man_ek1 = (TextView) findViewById(R.id.man_ek1);
        rectangle_24 = (View) findViewById(R.id.rectangle_24);
        outerwear = (TextView) findViewById(R.id.outerwear);
        _1 = (TextView) findViewById(R.id._1);
        rp_500_ek2 = (TextView) findViewById(R.id.rp_500_ek2);
        man_ek2 = (TextView) findViewById(R.id.man_ek2);
        arrow_forward = (ImageView) findViewById(R.id.arrow_forward);
        add = (ImageView) findViewById(R.id.add);
        trouser_10770140_2 = (ImageView) findViewById(R.id.trouser_10770140_2);
        hoodie_2122562_2 = (ImageView) findViewById(R.id.hoodie_2122562_2);
        btPickupschedule = (Button) findViewById(R.id.btpickupschedule);
        btLayananLaundry = (Button) findViewById(R.id.btnlayananlaundry);

        btPickupschedule.setOnClickListener(view -> {
            Intent Pickupschedule = new Intent(getApplicationContext(), MainPickupSchedule.class);
            startActivity(Pickupschedule);
        });

        btLayananLaundry.setOnClickListener(view -> {
            Intent LayananLaundry = new Intent(getApplicationContext(), SelectServiceActivity.class);
            startActivity(LayananLaundry);
        });
    }
}


