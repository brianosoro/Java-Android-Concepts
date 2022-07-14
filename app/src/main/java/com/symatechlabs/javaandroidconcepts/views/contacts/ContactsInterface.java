package com.symatechlabs.javaandroidconcepts.views.contacts;

import android.os.Bundle;

import com.symatechlabs.javaandroidconcepts.views.BaseInterface;

public interface ContactsInterface extends BaseInterface {

    void getContacts(Bundle bundle);
    void bindContacts();
    boolean isSourceRoom(Bundle bundle);
}
