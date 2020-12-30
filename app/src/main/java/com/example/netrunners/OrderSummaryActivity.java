package com.example.netrunners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderSummaryActivity extends AppCompatActivity {

    ImageButton imageButton_backToCart;
    TextView textView_total;
    Button button_placeOrder;
    ArrayList<MyProduct> order2 = MyCartActivity.order;
    EditText personFirstName, personLastName, personContactNumber, personAddress, personEmailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        imageButton_backToCart = findViewById(R.id.imageButton_backToCart);
        textView_total = findViewById(R.id.textView_total);
        button_placeOrder = findViewById(R.id.button_placeOrder);

        personFirstName = findViewById(R.id.editTextTextPersonName);
        personLastName = findViewById(R.id.editTextTextPersonName2);
        personContactNumber = findViewById(R.id.editTextTextPersonName3);
        personAddress = findViewById(R.id.editTextTextPersonName4);
        personEmailAddress = findViewById(R.id.editTextTextPersonName5);

        if(getIntent().hasExtra("total")) {
            textView_total.setText(String.valueOf(getIntent().getDoubleExtra("total", 0)));
        } else if(getIntent().hasExtra("id")) {
            textView_total.setText(String.valueOf(MyData.getProduct(getBaseContext(), getIntent().getIntExtra("id", 0)).getPrice()));
        }

        imageButton_backToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyCartActivity();
            }
        });

        button_placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductDatabase pdb = new ProductDatabase(getBaseContext());
                String firstName = personFirstName.getText().toString();
                String lastName = personLastName.getText().toString();
                String contactNumber = personContactNumber.getText().toString();
                String address = personAddress.getText().toString();
                String emailAddress = personEmailAddress.getText().toString();

                if(!firstName.isEmpty() && !lastName.isEmpty() && !contactNumber.isEmpty() && !address.isEmpty() && !emailAddress.isEmpty()) {
                    if (getIntent().hasExtra("id")) {
                        pdb.addOrder(String.valueOf(getIntent().getIntExtra("id", 0)),
                                String.valueOf(1),
                                firstName,
                                lastName,
                                contactNumber,
                                address,
                                emailAddress
                        );
                    } else {
                        for (int j = 0; j < order2.size(); j++) {
                            pdb.addOrder(String.valueOf(order2.get(j).getId()),
                                    String.valueOf(order2.get(j).getQuantity()),
                                    firstName,
                                    lastName,
                                    contactNumber,
                                    address,
                                    emailAddress
                            );
                        }
                    }
                    openHomeScreenActivity();
                }

            }
        });

    }

    public void openMyCartActivity() {
        Intent intent = new Intent(this, MyCartActivity.class);
        startActivity(intent);
    }

    public void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

}