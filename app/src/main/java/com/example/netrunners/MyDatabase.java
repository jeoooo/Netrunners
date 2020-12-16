package com.example.netrunners;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

class CartDatabase extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "Products.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "Products";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_CATEGORY = "category";
    private static final String COLUMN_PRICE = "price";
    private static final String COLUMN_STOCK = "stock";

    CartDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_CATEGORY + " TEXT, " +
                COLUMN_PRICE + " DOUBLE, " +
                COLUMN_STOCK + " INTEGER);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addProduct(String name, String category, String price, String stock) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_CATEGORY, category);
        cv.put(COLUMN_PRICE, price);
        cv.put(COLUMN_STOCK, stock);
        long result = db.insert(TABLE_NAME, null, cv);
        if(result == -1) {
            Toast.makeText(context, "Failed to save data", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "Save data successful", Toast.LENGTH_SHORT).show();
        }
    }

    public Cursor readProductData() {
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if(db != null) {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    public void updateProductData(String id, String name, String price, String stock) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ID, id);
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_PRICE, price);
        cv.put(COLUMN_STOCK, stock);

        long result = db.update(TABLE_NAME, cv, "_id=?", new String[]{id});
        if(result == -1) {
            Toast.makeText(context, "Failed update product data", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Product data updated", Toast.LENGTH_SHORT).show();
        }
    }

}
