package com.example.gradelist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        //here is where we call the super-class and the "concrete" class //this is actually from the super-class (ArrayAdapter) and here we are constructing using the default input param of 3 // resource = 0 cos we are inflating the resource in getView() method instead
        //this constructor is different to the constructor created in Word.class - this constructs from ArrayAdapter whereas Main.class doesn't extend from another class
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Here we are overriding a method from the ArrayAdapter class!
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        subjectTextView.setText(currentWord.getSubject());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView marksTextView = (TextView) listItemView.findViewById(R.id.marks_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        marksTextView.setText(currentWord.getMarks()+"%");

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView statusTextView = (TextView) listItemView.findViewById(R.id.status_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        statusTextView.setText(currentWord.getStatus()+"");

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        gradeTextView.setText(currentWord.getGrade());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
