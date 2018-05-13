package com.brett.beam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.brett.beam.models.Form;
import com.brett.beam.models.Form_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

public class DetailActivity extends AppCompatActivity {

    TextView tv_company, tv_nom, tv_prenom, tv_phone, tv_email, tv_web ;
    Form contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_company = (TextView) findViewById(R.id.tv_company);
        tv_nom = (TextView) findViewById(R.id.tv_nom);
        tv_prenom = (TextView) findViewById(R.id.tv_prenom);

        tv_phone = (TextView) findViewById(R.id.tv_phone);
        tv_email = (TextView) findViewById(R.id.tv_email);
        tv_web = (TextView) findViewById(R.id.tv_web);

        Long id = getIntent().getLongExtra("ID", 0);

        contact = SQLite.select()
                .from(Form.class)
                .where(Form_Table.id.eq(id))
                .querySingle();

        if (contact != null){

            tv_company.setText(contact.getCompagnie());
            tv_nom.setText(contact.getNom());
            tv_prenom.setText(contact.getPrenom());

            tv_phone.setText(contact.getPhone());
            tv_email.setText(contact.getEmail());
            tv_web.setText(contact.getWeb());



        }else {

            Toast.makeText(this, "Contact not found!", Toast.LENGTH_LONG).show();
            finish();

        }
    }
}
