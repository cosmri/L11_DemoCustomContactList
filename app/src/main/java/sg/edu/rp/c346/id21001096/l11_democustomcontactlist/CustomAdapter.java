package sg.edu.rp.c346.id21001096.l11_democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;
    ImageView imgGender;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView name = rowView.findViewById(R.id.name);
        TextView cd = rowView.findViewById(R.id.cd);
        TextView number = rowView.findViewById(R.id.number);



        Contact currentItem = contactList.get(position);
        name.setText(currentItem.getName());
        cd.setText("+" + currentItem.getCountryCode());
        number.setText(currentItem.getPhoneNum() + "");

        ImageView imgGender = rowView.findViewById(R.id.imgGender);

        if (currentItem.getGender() == 'M') {
            imgGender.setImageResource(R.drawable.male);
        } else {
            imgGender.setImageResource(R.drawable.female);
        }



        return rowView;



    }

}
