package com.symatechlabs.javaandroidconcepts.model.service;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import com.symatechlabs.javaandroidconcepts.model.Contact;

import java.util.List;


public class ContactsRepository {

    Context context;
    Cursor cursor;


    public ContactsRepository(Context context) {
        this.context = context;
    }

    public ContentResolver getResolver(){
        return context.getContentResolver();
    }

    public List<Contact> getContacts(List<Contact> contacts){

        try{
            cursor = getResolver().query(ContactsContract.Contacts.CONTENT_URI,
                    null, null, null,  ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC");
            while (cursor.moveToNext()){

                Contact contact = new Contact();
                contact.setId(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID)));
                contact.setName(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));
                contacts.add(contact);
            }
        }catch (Exception e){
            Log.d("Contacts_Exception", e.getMessage());
        }

        return contacts;
    }


}
