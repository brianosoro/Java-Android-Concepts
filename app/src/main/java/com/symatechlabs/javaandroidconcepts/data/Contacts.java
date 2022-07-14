package com.symatechlabs.javaandroidconcepts.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Contacts {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "contact_name")
    public String contactName;

    @ColumnInfo(name = "contact_id")
    public String contactID;

}
