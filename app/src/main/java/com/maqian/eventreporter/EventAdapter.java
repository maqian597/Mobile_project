package com.maqian.eventreporter;

import android.content.*;
import android.view.*;
import android.widget.*;

import java.util.*;


/**
 * Created by maqian on 11/8/17.
 */

public class EventAdapter extends BaseAdapter {
    Context context;
    List<Event> eventData;
    //Map<String, Integer> map;

    public EventAdapter(Context context) {
        this.context = context;
        eventData = DataService.getEventData();
    }

    @Override
    public int getCount() {
        return eventData.size();
    }

    @Override
    public Event getItem(int position) {
        return eventData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    //because getVire only return the view. no matter how many it is.
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.event_item,
                    parent, false);
        }
        ImageView image = (ImageView) convertView.findViewById(
                R.id.image);
        TextView eventName = (TextView) convertView.findViewById(
                R.id.event_name);
        TextView eventTitle = (TextView) convertView.findViewById(
                R.id.event_title);
        TextView eventAddress = (TextView) convertView.findViewById(
                R.id.event_address);
        TextView eventDescription = (TextView) convertView.findViewById(
                R.id.event_description);

        Event r = eventData.get(position);
        eventName.setText(r.getName());
        eventTitle.setText(r.getTitle());
        eventAddress.setText(r.getAddress());
        eventDescription.setText(r.getDescription());

        //different image resources
        String imageName = r.getName();
        int resID = context.getResources().getIdentifier(imageName , "drawable", context.getPackageName());
        image.setImageResource(resID);

        return convertView;
    }
}
