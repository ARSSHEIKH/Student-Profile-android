package com.example.profileproject1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddProfile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    Button btnSubmit;
    EditText name, batch, aboutInfo;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddProfile() {

//        // Required empty public constructor
//        YourNewFragment ldf = new YourNewFragment ();
//        Bundle args = new Bundle();
//        args.putString("YourKey", "YourValue");
//        ldf.setArguments(args);
//
////Inflate the fragment
//        getFragmentManager().beginTransaction().add(R.id.container, ldf).commit();
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddProfile.
     */
    // TODO: Rename and change types and number of parameters
    public static AddProfile newInstance(String param1, String param2) {
        AddProfile fragment = new AddProfile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_profile, container, false);
        name = v.findViewById(R.id.txtName);
        batch = v.findViewById(R.id.txtBatch);
        aboutInfo = v.findViewById(R.id.txtAboutYourself);
        btnSubmit = v.findViewById(R.id.btnAddProfile);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("name", name.getText().toString());
                bundle.putString("batch", batch.getText().toString());
                bundle.putString("aboutInfo", aboutInfo.getText().toString());

                ViewProfile f2 = new ViewProfile();
                f2.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.frameLay_Main, f2).commit();
            }
        });
        return v;
    }
}