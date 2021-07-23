package com.example.addbuyerintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LastScreen extends AppCompatActivity {
    private TextView mEtOrganizationName, mEtCustomerName, mEtMobileNumber, mEtMail, mEtAddress, mEtManufacturer, mEtTaxId, mEtCompanyId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);
        initViews();

        Intent intent = getIntent();
        String organisationName = intent.getStringExtra("organisationName");
        mEtOrganizationName.setText(organisationName);
        String name = intent.getStringExtra("name");
        mEtCustomerName.setText(name);
        String mobile = intent.getStringExtra("mobile");
        mEtMobileNumber.setText(mobile);
        String email = intent.getStringExtra("email");
        mEtMail.setText(email);
        String address = intent.getStringExtra("address");
        mEtAddress.setText(address);
        String manuf = intent.getStringExtra("manuf");
        mEtManufacturer.setText(manuf);
        String taxId = intent.getStringExtra("taxId");
        mEtTaxId.setText(taxId + "");
        String compId = intent.getStringExtra("compId");
        mEtCompanyId.setText(compId + "");
    }

    private void initViews() {
        mEtMobileNumber = findViewById(R.id.etPhone2);
        mEtOrganizationName = findViewById(R.id.orgName);
        mEtAddress = findViewById(R.id.etAddress2);
        mEtCompanyId = findViewById(R.id.etFinger2);
        mEtCustomerName = findViewById(R.id.etName2);
        mEtMail = findViewById(R.id.etEmail2);
        mEtManufacturer = findViewById(R.id.spinner1);
        mEtTaxId = findViewById(R.id.etTaxId2);
    }
}