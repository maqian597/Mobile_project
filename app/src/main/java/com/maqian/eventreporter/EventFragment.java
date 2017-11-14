package com.maqian.eventreporter;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment; //need to be attention that not android.app.fragment.
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_event, container, false);
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        //from parent to child cast. down cast is better
        ListView listView = (ListView) view.findViewById(R.id.event_list);
        //get the whole ListView
        listView.setAdapter(new EventAdapter(getActivity()));
        //manage multiple fragments, only need brief ListView.

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mCallback.onItemSelected(i);
            }
        });

        return view;
    }



    OnItemSelectListener mCallback;
    // Container Activity must implement this interface
    public interface OnItemSelectListener {
        public void onItemSelected(int position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallback = (OnItemSelectListener) context;
        } catch (ClassCastException e) {
            //do something
        }
    }


}
