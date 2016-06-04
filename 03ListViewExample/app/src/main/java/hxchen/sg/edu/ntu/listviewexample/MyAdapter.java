package hxchen.sg.edu.ntu.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View theView = inflater.inflate(R.layout.row_layout2, parent, false);
        String tvShow = getItem(position);
        TextView textView = (TextView) theView.findViewById(R.id.textView2);
        textView.setText(tvShow);
//        ImageView imageView = (ImageView) theView.findViewById(R.id.imageIt);
//        imageView.setImageResource(R.drawable.dot);
        return theView;
    }

    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, R.id.textView2, values);
    }
}
