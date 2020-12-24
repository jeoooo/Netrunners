package com.example.netrunners;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProductDatabase extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "Products.db";
    private static final int DATABASE_VERSION = 4;

    private static final String PRODUCTS_TABLE = "Products";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_IMAGE = "image";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_CATEGORY = "category";
    private static final String COLUMN_PRICE = "price";
    private static final String COLUMN_STOCK = "stock";
    private static final String COLUMN_DESCRIPTION = "description";

    private static final String CART_TABLE = "Cart";
    private static final String COLUMN_CART_ID = "cart_id";
    private static final String COLUMN_QUANTITY = "quantity";

    public ProductDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Product table
        String query = "CREATE TABLE " + PRODUCTS_TABLE +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_IMAGE + " INTEGER, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_CATEGORY + " TEXT, " +
                COLUMN_PRICE + " DOUBLE, " +
                COLUMN_STOCK + " INTEGER, " +
                COLUMN_DESCRIPTION + " TEXT);";
        db.execSQL(query);
        // Cart table
        query = "CREATE TABLE " + CART_TABLE +
                " (" + COLUMN_CART_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_ID + " INTEGER, " +
                COLUMN_IMAGE + " INTEGER, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_CATEGORY + " TEXT, " +
                COLUMN_PRICE + " DOUBLE, " +
                COLUMN_QUANTITY + " INTEGER);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + PRODUCTS_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + CART_TABLE);
        onCreate(db);
    }

    // For product table
    public void addProduct(String image, String name, String category, String price, String stock, String description) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_IMAGE, image);
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_CATEGORY, category);
        cv.put(COLUMN_PRICE, price);
        cv.put(COLUMN_STOCK, stock);
        cv.put(COLUMN_DESCRIPTION, description);

        long result = db.insert(PRODUCTS_TABLE, null, cv);
        if(result == -1) {
            //Toast.makeText(context, "Failed to save data", Toast.LENGTH_SHORT).show();
        }
        else {
            //Toast.makeText(context, "Save data successful", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }

    // For product table
    // To check if table 1 or Products table exist
    public boolean table1Exist() {
        boolean rtn;
        String query = "SELECT * FROM " + PRODUCTS_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        if(cursor.getCount() > 0) {
            rtn = true;
        }
        else {
            rtn = false;
        }
        cursor.close();
        db.close();
        return rtn;
    }

    // For product table
    public ArrayList<MyProduct> getDBArrayList() {
        ArrayList<MyProduct> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + PRODUCTS_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                int image = cursor.getInt(1);
                String name = cursor.getString(2);
                String category = cursor.getString(3);
                double price = cursor.getInt(4);
                int stock = cursor.getInt(5);
                String description = cursor.getString(6);

                returnList.add(new MyProduct(id, image, name, category, price, stock, description));

            } while(cursor.moveToNext());
        }
        else {

        }
        cursor.close();
        db.close();
        return returnList;
    }

    // For product table
    public void updateProductData(String id, String stock) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_ID, id);
        //cv.put(COLUMN_NAME, name);
        //cv.put(COLUMN_CATEGORY, category);
        //cv.put(COLUMN_PRICE, price);
        cv.put(COLUMN_STOCK, stock);

        long result = db.update(PRODUCTS_TABLE, cv, "id=?", new String[]{id});
        if(result == -1) {
            //Toast.makeText(context, "Failed update product data", Toast.LENGTH_SHORT).show();
        } else {
            //Toast.makeText(context, "Product data updated", Toast.LENGTH_SHORT).show();
        }
    }

    // All cart table here

    public void addCart(String id, String image, String name, String category, String price, String quantity) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_ID, id);
        cv.put(COLUMN_IMAGE, image);
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_CATEGORY, category);
        cv.put(COLUMN_PRICE, price);
        cv.put(COLUMN_QUANTITY, quantity);

        long result = db.insert(CART_TABLE, null, cv);
        if(result == -1) {
            Toast.makeText(context, "add cart error", Toast.LENGTH_LONG).show();
        }
        else {

        }
        db.close();
    }

    public ArrayList<MyProduct> getCartArrayList() {
        ArrayList<MyProduct> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + CART_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()) {
            do {
                int cart_id = cursor.getInt(0);
                int id = cursor.getInt(1);
                int image = cursor.getInt(2);
                String name = cursor.getString(3);
                String category = cursor.getString(4);
                double price = cursor.getInt(5);
                int quantity = cursor.getInt(6);

                returnList.add(new MyProduct(cart_id, id, image, name, category, price, quantity));

            } while(cursor.moveToNext());
        }
        else {

        }
        cursor.close();
        db.close();
        return returnList;
    }

    // Part of identifying if the product is already in the cart
    // This add quantity to the existing product instead of adding other one
    public void updateCart(String id, String quantity) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_ID, id);
        cv.put(COLUMN_QUANTITY, quantity);

        long result = db.update(CART_TABLE, cv, "id=?", new String[]{id});
        if(result == -1) {
            //Toast.makeText(context, "Failed update product data", Toast.LENGTH_SHORT).show();
        } else {
            //Toast.makeText(context, "Product data updated", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }

    public void deleteCartRow(String cart_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_CART_ID, cart_id);

        long result = db.delete(CART_TABLE, "cart_id=?", new String[]{cart_id});
        if(result == -1) {
            //Toast.makeText(context, "Failed update product data", Toast.LENGTH_SHORT).show();
        } else {
            //Toast.makeText(context, "Product data updated", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }

}
