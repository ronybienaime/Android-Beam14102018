package com.brett.beam;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.brett.beam.models.Form;
import com.brett.beam.models.Form_Table;
import com.raizlabs.android.dbflow.sql.language.From;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_company, et_nom, et_prenom, et_phone, et_email, et_web ;
    Form contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_company = (EditText) findViewById(R.id.et_company);
        et_nom = (EditText) findViewById(R.id.et_nom);
        et_prenom = (EditText) findViewById(R.id.et_prenom);

        et_phone = (EditText) findViewById(R.id.et_phone);
        et_email = (EditText) findViewById(R.id.et_email);
        et_web = (EditText) findViewById(R.id.et_web);


        findViewById(R.id.btn_save).setOnClickListener(this);


        List<Form> forms = SQLite.select()
                .from(Form.class)
                .where(Form_Table.type.is(1))
                .queryList();

        if (forms.size() > 0)
            contact = forms.get(0);
        else {
            contact = new Form();
            contact.setType(1);
        }


        et_company.setText(contact.getCompagnie());
        et_nom.setText(contact.getNom());
        et_prenom.setText(contact.getPrenom());

        et_phone.setText(contact.getPhone());
        et_email.setText(contact.getEmail());
        et_web.setText(contact.getWeb());

    }

    void save(){

        contact.setCompagnie(et_company.getText().toString());
        contact.setNom(et_nom.getText().toString());
        contact.setPrenom(et_prenom.getText().toString());

        contact.setPhone(et_phone.getText().toString());
        contact.setEmail(et_email.getText().toString());
        contact.setWeb(et_web.getText().toString());

        contact.save();

        Toast.makeText(this, "Profile save successfully", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_save:
                save();
                break;
        }
    }
}
