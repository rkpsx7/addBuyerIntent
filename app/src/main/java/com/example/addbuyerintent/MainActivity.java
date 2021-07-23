package com.example.addbuyerintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton mBtnGo;
    private EditText mEtOrganizationName,  mEtCustomerName,  mEtMobileNumber, mEtMail,  mEtAddress,  mEtManufacturer, mEtTaxId, mEtCompanyId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
mBtnGo.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,LastScreen.class);
        intent.putExtra("organisationName",mEtOrganizationName.getText().toString());
        intent.putExtra("name",mEtCustomerName.getText().toString());
        intent.putExtra("mobile",mEtMobileNumber.getText().toString());
        intent.putExtra("email",mEtMail.getText().toString());
        intent.putExtra("address",mEtAddress.getText().toString());
        intent.putExtra("manuf",mEtManufacturer.getText().toString());
        intent.putExtra("taxId",mEtTaxId.getText().toString());
        intent.putExtra("compId",mEtCompanyId.getText().toString());
        startActivity(intent);
    }
});

    }

    private void initViews() {
        mEtOrganizationName = findViewById(R.id.etOrganisationName);
        mBtnGo = findViewById(R.id.BtnLetsGo);
        mEtMobileNumber =findViewById(R.id.etPhone2);
        mEtAddress = findViewById(R.id.etAddress2);
        mEtCompanyId = findViewById(R.id.etFinger2);
        mEtCustomerName = findViewById(R.id.etName2);
        mEtMail = findViewById(R.id.etEmail2);
        mEtManufacturer = findViewById(R.id.etManufacturer2);
        mEtTaxId = findViewById(R.id.etTaxId2);
    }
}