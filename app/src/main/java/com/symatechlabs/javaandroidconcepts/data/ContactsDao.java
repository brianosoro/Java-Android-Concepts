package com.symatechlabs.javaandroidconcepts.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface ContactsDao {

    @Query("SELECT * FROM contacts")
    List<Contacts> getContacts();

    @Insert
    void insertContact(Contacts contact);

    @Update
    void updateContact(Contacts contact);

    @Query("DELETE FROM contacts")
    void deleteContacts();


}
