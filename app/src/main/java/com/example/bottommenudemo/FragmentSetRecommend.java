package com.example.bottommenudemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSetRecommend extends Fragment {


    private TextView tvUrl;
    private Button btnName;
    private String url="";
    private String name = "";

    public FragmentSetRecommend() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        tvUrl = (TextView) view.findViewById(R.id.tvUrl);
        btnName = (Button) view.findViewById(R.id.btnName);
        tvUrl.setText(url);
        btnName.setText(name);
        return view;
    }

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        url = args.getString("url" ,"");
        name = args.getString("name","");


    }
}
