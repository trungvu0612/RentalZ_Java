package vn.edu.greenwich.javade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class AddPropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property);

        String btnCreateName = getResources().getString(R.string.btn_create);

        String noti_01 = getResources().getString(R.string.noti_01);


        Toast.makeText(this, noti_01, Toast.LENGTH_LONG).show();

        Button btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setText(btnCreateName);

        btnCreate.setOnClickListener(btnCreate_Click);
    }
    private View.OnClickListener btnCreate_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Boolean isValid = true;

            TextView showAlert = findViewById(R.id.showAlert);
            TextView ipName = findViewById(R.id.ipName);
            TextView ipAddress = findViewById(R.id.ipAddress);
            TextView ipCity = findViewById(R.id.ipCity);
            TextView ipDistrict = findViewById(R.id.ipDistrict);
            TextView ipWard = findViewById(R.id.ipWard);
            TextView ipType = findViewById(R.id.ipType);
            TextView ipFurniture = findViewById(R.id.ipFurniture);
            TextView ipBedroom = findViewById(R.id.ipBedrooms);
            TextView ipPrice = findViewById(R.id.ipPrice);
            TextView ipReporter = findViewById(R.id.ipReporter);
            TextView ipNote = findViewById(R.id.ipNote);


            String error = "";
            // Get content of textview "Name".
            String name = ipName.getText().toString();
            // Get content of textview "Address".
            String address = ipAddress.getText().toString();
            // Get content of textview "City".
            String city = ipCity.getText().toString();
            // Get content of textview "District".
            String district = ipDistrict.getText().toString();
            // Get content of textview "Ward".
            String ward = ipWard.getText().toString();
            // Get content of textview "Type".
            String type = ipType.getText().toString();
            // Get content of textview "Furniture".
            String furniture = ipFurniture.getText().toString();
            // Get content of textview "Bedrooms".
            String bedroom = ipBedroom.getText().toString();
            // Get content of textview "Price".
            String price = ipPrice.getText().toString();
            // Get content of textview "Reporter".
            String reporter = ipReporter.getText().toString();
            // Get content of textview "Note".
            String note = ipNote.getText().toString();
            String noti_02 = getResources().getString(R.string.noti_02);

            Toast.makeText(v.getContext(), noti_02, Toast.LENGTH_LONG).show();

            if (TextUtils.isEmpty(name)) {
                isValid = false;
                error += "* Username cannot be blank.\n";
            }

            if (TextUtils.isEmpty(address)) {
                isValid = false;
                error += "* Address cannot be blank.\n";
            }

            if (TextUtils.isEmpty(city)) {
                isValid = false;
                error += "* City cannot be blank.\n";
            }

            if (TextUtils.isEmpty(district)) {
                isValid = false;
                error += "* Distric cannot be blank.\n";
            }

            if (TextUtils.isEmpty(ward)) {
                isValid = false;
                error += "* Ward cannot be blank.\n";
            }

            if (TextUtils.isEmpty(type)) {
                isValid = false;
                error += "* Type cannot be blank.\n";
            }

            if (TextUtils.isEmpty(furniture)) {
                isValid = false;
                error += "* Furniture cannot be blank.\n";
            }

            if (TextUtils.isEmpty(bedroom)) {
                isValid = false;
                error += "* Bedrooms cannot be blank.\n";
            }

            if (TextUtils.isEmpty(price)) {
                isValid = false;
                error += "* Price cannot be blank.\n";
            }

            if (TextUtils.isEmpty(reporter)) {
                isValid = false;
                error += "* Reporter cannot be blank.\n";
            }

            if (TextUtils.isEmpty(note)) {
                isValid = false;
                error += "* Note cannot be blank.\n";
            }


            if (isValid) {

                Toast.makeText(v.getContext(), name, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), address, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), city, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), district, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), ward, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), type, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), furniture, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), bedroom, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), price, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), reporter, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), note, Toast.LENGTH_LONG).show();


                Bundle accountInfo = new Bundle();
                accountInfo.putString("name", name);
                accountInfo.putString("address", address);
                accountInfo.putString("city", city);
                accountInfo.putString("district", district);
                accountInfo.putString("ward", ward);
                accountInfo.putString("type", type);
                accountInfo.putString("furniture", furniture);
                accountInfo.putString("bedroom", bedroom);
                accountInfo.putString("price", price);
                accountInfo.putString("reporter", reporter);
                accountInfo.putString("note", note);

                Intent showActivity = new Intent(v.getContext(), ShowActivity.class);

                showActivity.putExtras(accountInfo);

                startActivity(showActivity);

                finish();
            } else {

                showAlert.setText(error);

                Log.e("Add Property Activity", error);
            }
        }
    };
}