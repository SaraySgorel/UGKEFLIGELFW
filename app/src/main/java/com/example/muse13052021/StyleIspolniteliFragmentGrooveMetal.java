package com.example.muse13052021;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class StyleIspolniteliFragmentGrooveMetal extends Fragment {
    List<String> listData;
    ArrayAdapter<String> adapterGenre;
    public DatabaseReference mDataBase; // объект, который хранит ссылку на бд
    public String USER_KEY = "ALBUMS"; // группа для бд

    //конструктор класса
    public StyleIspolniteliFragmentGrooveMetal() {

    }

    public static Fragment newInstance() {
        return new StyleIspolniteliFragmentGrooveMetal();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ispolniteli_groovemetal, container, false);
        ListView lv_groovemetal = (ListView) view.findViewById(R.id.lv_ispolniteli_groovemetal);
        listData = new ArrayList<>();
        mDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);// получили бд
        //String[] genre = getResources().getStringArray(R.array.genre);
        // Считываем исполнителей рока из базы данных
        //

        // Создание адаптера для ListView
        adapterGenre = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, listData);
        lv_groovemetal.setAdapter(adapterGenre);
        // Обработка нажатия на кнопку

        return view;
    }


}