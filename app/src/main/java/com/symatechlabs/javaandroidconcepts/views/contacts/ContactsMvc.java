package com.symatechlabs.javaandroidconcepts.views.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.symatechlabs.javaandroidconcepts.databinding.ContactsActivityBinding;
import com.symatechlabs.javaandroidconcepts.model.Contact;
import com.symatechlabs.javaandroidconcepts.model.service.ContactsRepository;
import com.symatechlabs.javaandroidconcepts.views.adapters.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContactsMvc implements ContactsInterface{

    View rootView;

    ContactsActivityBinding binding;
    ContactsRepository contactsRepository;
    List<Contact> contactList;
    ContactsAdapter contactsAdapter;

    public ContactsMvc(LayoutInflater inflater, ViewGroup parent) {

        binding = ContactsActivityBinding.inflate(inflater);
        rootView = binding.getRoot();

        contactsRepository = new ContactsRepository(getContext());
        contactList = new ArrayList<>();
        contactList = contactsRepository.getContacts(contactList);
        contactsAdapter = new ContactsAdapter(contactList);
        binding.contactList.setAdapter(contactsAdapter);
        binding.contactList.setLayoutManager(new LinearLayoutManager(getContext()));

    }


    @Override
    public View getRootView() {
        return rootView;
    }
    @Override
    public Context getContext(){
        return rootView.getContext();
    }
}
