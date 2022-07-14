package com.symatechlabs.javaandroidconcepts.views.contacts;

import static com.symatechlabs.javaandroidconcepts.JavaAndroidConcepts.appDatabase;
import static com.symatechlabs.javaandroidconcepts.common.Constants.INTENT_CONTACTS_DATABASE;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.symatechlabs.javaandroidconcepts.data.Contacts;
import com.symatechlabs.javaandroidconcepts.databinding.ContactsActivityBinding;
import com.symatechlabs.javaandroidconcepts.model.contacts.Contact;
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
    List<Contacts> contacts = new ArrayList<>();

    public ContactsMvc(LayoutInflater inflater, ViewGroup parent, Bundle bundle) {

        binding = ContactsActivityBinding.inflate(inflater);
        rootView = binding.getRoot();

        getContacts(bundle);
        bindContacts();

    }


    @Override
    public View getRootView() {
        return rootView;
    }
    @Override
    public Context getContext(){
        return rootView.getContext();
    }

    @Override
    public void getContacts(Bundle bundle) {
        contactList = new ArrayList<>();
        if(bundle != null){
            if(isSourceRoom(bundle)){
                contacts = appDatabase.contactsDao().getContacts();
                for(int i = 0; i < contacts.size(); i++){
                    Contact contact = new Contact();
                    contact.setName(contacts.get(i).contactName);
                    contact.setId(contacts.get(i).contactID);
                    contactList.add(contact);
                }
                contactsAdapter = new ContactsAdapter(contactList);
                binding.contactList.setAdapter(contactsAdapter);
                binding.contactList.setLayoutManager(new LinearLayoutManager(getContext()));
            }
        }else{
            contactsRepository = new ContactsRepository(getContext());
            contactList = contactsRepository.getContacts(contactList);
            contactsAdapter = new ContactsAdapter(contactList);
            binding.contactList.setAdapter(contactsAdapter);
            binding.contactList.setLayoutManager(new LinearLayoutManager(getContext()));
        }
    }

    @Override
    public void bindContacts() {
        binding.contactList.setAdapter(contactsAdapter);
        binding.contactList.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public boolean isSourceRoom(Bundle bundle) {
        return bundle.getBoolean(INTENT_CONTACTS_DATABASE);
    }

}
