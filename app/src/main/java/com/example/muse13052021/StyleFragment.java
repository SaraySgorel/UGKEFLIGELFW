package com.example.muse13052021;


import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class StyleFragment extends Fragment {
    EditText search;
    String[] genre, genresearch;
    Button searchBt;
    ArrayAdapter<String> adapterGenre;




    //конструктор класса
    public StyleFragment() {

    }

    public static androidx.fragment.app.Fragment newInstance() {
        return new StyleFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_style, container, false);
        ListView lv_genre = (ListView) view.findViewById(R.id.lv_ispolniteli);
        search = (EditText) view.findViewById(R.id.search);
        genre = getResources().getStringArray(R.array.genre);
        genresearch = new String[59];
        // Создание адаптера для ListView
        adapterGenre = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, genre);
        lv_genre.setAdapter(adapterGenre);
        // Обработка нажатия на кнопку
        lv_genre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentRock fragment = new StyleIspolniteliFragmentRock(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction.replace(R.id.fl_content, fragment); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction.commit();
                        break;
                    case 1:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentElectronic fragment1 = new StyleIspolniteliFragmentElectronic(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction1 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction1.replace(R.id.fl_content, fragment1); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction1.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction1.commit();
                        break;
                    case 2:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentJazz fragment2 = new StyleIspolniteliFragmentJazz(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction2.replace(R.id.fl_content, fragment2); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction2.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction2.commit();
                        break;
                    case 3:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentBlues fragment3 = new StyleIspolniteliFragmentBlues(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction3.replace(R.id.fl_content, fragment3); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction3.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction3.commit();
                        break;
                    case 4:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentHipHop fragment4 = new StyleIspolniteliFragmentHipHop(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction4 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction4.replace(R.id.fl_content, fragment4); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction4.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction4.commit();
                        break;
                    case 5:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentPop fragment5 = new StyleIspolniteliFragmentPop(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction5 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction5.replace(R.id.fl_content, fragment5); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction5.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction5.commit();
                        break;
                    case 6:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentMetal fragment6 = new StyleIspolniteliFragmentMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction6 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction6.replace(R.id.fl_content, fragment6); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction6.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction6.commit();
                        break;
                    case 7:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentRap fragment7 = new StyleIspolniteliFragmentRap(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction7 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction7.replace(R.id.fl_content, fragment7); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction7.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction7.commit();
                        break;
                    case 8:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentIndie fragment8 = new StyleIspolniteliFragmentIndie(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction8 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction8.replace(R.id.fl_content, fragment8); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction8.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction8.commit();
                        break;
                    case 9:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentAlternative fragment9 = new StyleIspolniteliFragmentAlternative(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction9 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction9.replace(R.id.fl_content, fragment9); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction9.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction9.commit();
                        break;
                    case 10:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentRandB fragment10 = new StyleIspolniteliFragmentRandB(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction10 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction10.replace(R.id.fl_content, fragment10); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction10.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction10.commit();
                        break;
                    case 11:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentClassic fragment11 = new StyleIspolniteliFragmentClassic(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction11 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction11.replace(R.id.fl_content, fragment11); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction11.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction11.commit();
                        break;
                    case 12:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentCountryMusic fragment12 = new StyleIspolniteliFragmentCountryMusic(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction12 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction12.replace(R.id.fl_content, fragment12); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction12.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction12.commit();
                        break;
                    case 13:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentFunk fragment13 = new StyleIspolniteliFragmentFunk(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction13 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction13.replace(R.id.fl_content, fragment13); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction13.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction13.commit();
                        break;
                    case 14:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentSoul fragment14 = new StyleIspolniteliFragmentSoul(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction14 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction14.replace(R.id.fl_content, fragment14); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction14.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction14.commit();
                        break;
                    case 15:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentFolk fragment15 = new StyleIspolniteliFragmentFolk(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction15 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction15.replace(R.id.fl_content, fragment15); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction15.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction15.commit();
                        break;
                    case 16:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentAvangardMetal fragment16 = new StyleIspolniteliFragmentAvangardMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction16 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction16.replace(R.id.fl_content, fragment16); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction16.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction16.commit();
                        break;
                    case 17:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentBlackMetal fragment17 = new StyleIspolniteliFragmentBlackMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction17 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction17.replace(R.id.fl_content, fragment17); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction17.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction17.commit();
                        break;
                    case 18:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentHeavyMetal fragment18 = new StyleIspolniteliFragmentHeavyMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction18 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction18.replace(R.id.fl_content, fragment18); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction18.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction18.commit();
                        break;
                    case 19:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentSpeedMetal fragment19 = new StyleIspolniteliFragmentSpeedMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction19 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction19.replace(R.id.fl_content, fragment19); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction19.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction19.commit();
                        break;
                    case 20:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentTrashMetal fragment20 = new StyleIspolniteliFragmentTrashMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction20 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction20.replace(R.id.fl_content, fragment20); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction20.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction20.commit();
                        break;
                    case 21:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentAlternativeMetal fragment21 = new StyleIspolniteliFragmentAlternativeMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction21 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction21.replace(R.id.fl_content, fragment21); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction21.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction21.commit();
                        break;
                    case 22:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentIndustrialMetal fragment22 = new StyleIspolniteliFragmentIndustrialMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction22 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction22.replace(R.id.fl_content, fragment22); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction22.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction22.commit();
                        break;
                    case 43:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentAlternativeDance fragment43 = new StyleIspolniteliFragmentAlternativeDance(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction43 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction43.replace(R.id.fl_content, fragment43); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction43.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction43.commit();
                        break;
                    case 24:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentMetalcore fragment24 = new StyleIspolniteliFragmentMetalcore(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction24 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction24.replace(R.id.fl_content, fragment24); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction24.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction24.commit();
                        break;
                    case 25:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentNuMetal fragment25 = new StyleIspolniteliFragmentNuMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction25 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction25.replace(R.id.fl_content, fragment25); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction25.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction25.commit();
                        break;
                    case 26:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentChristianMetal fragment26 = new StyleIspolniteliFragmentChristianMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction26 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction26.replace(R.id.fl_content, fragment26); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction26.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction26.commit();
                        break;
                    case 27:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentFunkMetal fragment27 = new StyleIspolniteliFragmentFunkMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction27 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction27.replace(R.id.fl_content, fragment27); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction27.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction27.commit();
                        break;
                    case 28:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentRapMetal fragment28 = new StyleIspolniteliFragmentRapMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction28 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction28.replace(R.id.fl_content, fragment28); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction28.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction28.commit();
                        break;
                    case 29:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentDeathMetal fragment29 = new StyleIspolniteliFragmentDeathMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction29 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction29.replace(R.id.fl_content, fragment29); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction29.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction29.commit();
                        break;
                    case 30:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentDoomMetal fragment30 = new StyleIspolniteliFragmentDoomMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction30 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction30.replace(R.id.fl_content, fragment30); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction30.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction30.commit();
                        break;
                    case 31:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentGrooveMetal fragment31 = new StyleIspolniteliFragmentGrooveMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction31 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction31.replace(R.id.fl_content, fragment31); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction31.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction31.commit();
                        break;
                    case 32:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentGlamMetal fragment32 = new StyleIspolniteliFragmentGlamMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction32 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction32.replace(R.id.fl_content, fragment32); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction32.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction32.commit();
                        break;
                    case 33:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentDarkMetal fragment33 = new StyleIspolniteliFragmentDarkMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction33 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction33.replace(R.id.fl_content, fragment33); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction33.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction33.commit();
                        break;
                    case 34:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentPowerMetal fragment34 = new StyleIspolniteliFragmentPowerMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction34 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction34.replace(R.id.fl_content, fragment34); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction34.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction34.commit();
                        break;
                    case 35:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentProgressiveMetal fragment35 = new StyleIspolniteliFragmentProgressiveMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction35 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction35.replace(R.id.fl_content, fragment35); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction35.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction35.commit();
                        break;
                    case 36:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentSymphonicMetal fragment36 = new StyleIspolniteliFragmentSymphonicMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction36 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction36.replace(R.id.fl_content, fragment36); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction36.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction36.commit();
                        break;
                    case 37:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentSludgeMetal fragment37 = new StyleIspolniteliFragmentSludgeMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction37 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction37.replace(R.id.fl_content, fragment37); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction37.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction37.commit();
                        break;
                    case 38:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentStonerMetal fragment38 = new StyleIspolniteliFragmentStonerMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction38 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction38.replace(R.id.fl_content, fragment38); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction38.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction38.commit();
                        break;
                    case 39:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentGothicMetal fragment39 = new StyleIspolniteliFragmentGothicMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction39 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction39.replace(R.id.fl_content, fragment39); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction39.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction39.commit();
                        break;
                    case 40:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentPostMetal fragment40 = new StyleIspolniteliFragmentPostMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction40 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction40.replace(R.id.fl_content, fragment40); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction40.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction40.commit();
                        break;
                    case 41:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentDeathDoomMetal fragment41 = new StyleIspolniteliFragmentDeathDoomMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction41 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction41.replace(R.id.fl_content, fragment41); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction41.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction41.commit();
                        break;
                    case 42:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentMathMetal fragment42 = new StyleIspolniteliFragmentMathMetal(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction42 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction42.replace(R.id.fl_content, fragment42); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction42.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction42.commit();
                        break;
                    case 44:
                        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                                Toast.LENGTH_SHORT).show();
                        // подключаем FragmentManager
                        StyleIspolniteliFragmentAlternativeRock fragment44 = new StyleIspolniteliFragmentAlternativeRock(); // Фрагмент, которым собираетесь заменить первый фрагмент

                        FragmentTransaction transaction44 = getFragmentManager().beginTransaction(); // Или getSupportFragmentManager(), если используете support.v4
                        transaction44.replace(R.id.fl_content, fragment44); // Заменяете вторым фрагментом. Т.е. вместо метода `add()`, используете метод `replace()`
                        transaction44.addToBackStack(null); // Добавляете в backstack, чтобы можно было вернутся обратно

                        transaction44.commit();
                        break;
                    default:
                }
            }
        });

        /*searchBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String sssearch = search.getText().toString();
                    for (int i = 0; i < 59; i++) {
                        if (sssearch.equals(genre[i])) {
                            genresearch[i] = genre[i];
                            adapterGenre = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, genresearch);
                            lv_genre.setAdapter(adapterGenre);
                        } else {
                            Toast toast = Toast.makeText(getContext(),
                                    "Совпадений не найдено", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                }


        });*/
        return view;
    }

}