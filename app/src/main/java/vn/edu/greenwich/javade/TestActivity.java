package vn.edu.greenwich.javade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView ipName = findViewById(R.id.ipName_test);
        TextView ipAddress = findViewById(R.id.ipAddress_test);
        TextView ipCity = findViewById(R.id.ipCity_test);
        TextView ipDistrict = findViewById(R.id.ipDistrict_test);
        TextView ipWard = findViewById(R.id.ipWard_test);
        TextView ipType = findViewById(R.id.ipType_test);
        TextView ipFurniture = findViewById(R.id.ipFurniture_test);
        TextView ipBedroom = findViewById(R.id.ipBedroom_test);
        TextView ipPrice = findViewById(R.id.ipPrice_test);
        TextView ipReporter = findViewById(R.id.ipReporter_test);
        TextView ipNote = findViewById(R.id.ipNote_test);

        String name = "";
        String address = "";
        String city = "";
        String district = "";
        String ward = "";
        String type = "";
        String furniture = "";
        String bedroom = "";
        String price = "";
        String reporter = "";
        String note = "";


        Intent intent = getIntent();

        // 1st method to receive data.
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            name = bundle.getString("name");
            address = bundle.getString("address");
            city = bundle.getString("city");
            district = bundle.getString("district");
            ward = bundle.getString("ward");
            type = bundle.getString("type");
            furniture = bundle.getString("furniture");
            bedroom = bundle.getString("bedroom");
            price = bundle.getString("price");
            reporter = bundle.getString("reporter");
            note = bundle.getString("note");

        }

        // 2nd method to receive data.
        //username = intent.getStringExtra("username");
        //password = intent.getStringExtra("password");

        ipName.setText(name);
        ipAddress.setText(address);
        ipCity.setText(city);
        ipDistrict.setText(district);
        ipWard.setText(ward);
        ipType.setText(type);
        ipFurniture.setText(furniture);
        ipBedroom.setText(bedroom);
        ipPrice.setText(price);
        ipReporter.setText(reporter);
        ipNote.setText(note);


    }
}