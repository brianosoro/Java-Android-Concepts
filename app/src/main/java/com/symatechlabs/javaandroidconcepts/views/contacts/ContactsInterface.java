package com.symatechlabs.javaandroidconcepts.views.contacts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.symatechlabs.javaandroidconcepts.model.Contact;
import com.symatechlabs.javaandroidconcepts.views.BaseInterface;

import java.util.List;

public interface ContactsInterface extends BaseInterface {

    void getContacts(Bundle bundle);
    void bindContacts();
    boolean isSourceRoom(Bundle bundle);
}
