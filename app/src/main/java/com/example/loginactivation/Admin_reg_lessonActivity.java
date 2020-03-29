package com.example.loginactivation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Admin_reg_lessonActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] faculty = {"None","Engineering", "Economics and Management", "Sciences", "Theology", "Veterinary Medicine", "Tourism and Hotel Management", "Communication", "Humanities", "Fine Arts", "Agriculture", "Agriculture"};
    String[] department = {"None", "Computer Engineering", "Chemical Engineering", "Environmental Engineering", "Food Engineering", "Industrial Department", ""};
    String[] teacher = {"None", "Computer Engineering", "Chemical Engineering", "Environmental Engineering", "Food Engineering", "Industrial Department", ""};
    String[] status = {"None", "Computer Engineering", "Chemical Engineering", "Environmental Engineering", "Food Engineering", "Industrial Department", ""};

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_reg_lesson);

        Spinner spin_fac = (Spinner) findViewById(R.id.fac);
        spin_fac.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        Spinner spin_dep = (Spinner) findViewById(R.id.dep);
        spin_dep.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        Spinner spin_teacher = (Spinner) findViewById(R.id.teacher_spin);
        spin_fac.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        Spinner spin_status = (Spinner) findViewById(R.id.status_spin);
        spin_dep.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, faculty);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin_fac.setAdapter(aa);


        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_spinner_item, department);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin_dep.setAdapter(a);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, teacher);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin_fac.setAdapter(bb);


        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter b = new ArrayAdapter(this, android.R.layout.simple_spinner_item, status);
        b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin_dep.setAdapter(b);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),faculty[position] , Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),department[position] , Toast.LENGTH_LONG).show();
    }



    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
