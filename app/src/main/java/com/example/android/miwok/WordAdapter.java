package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColourResourceId;

    public WordAdapter(Activity Context, ArrayList<Word> arrayList, int mColourResourceId){
        super(Context,0,arrayList);
        this.mColourResourceId = mColourResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView textView1 = (TextView) listItemView.findViewById(R.id.original_text_view);
        textView1.setText(currentWord.getmMiwokTranslation());
        TextView textView2 = (TextView) listItemView.findViewById(R.id.english_text_view);
        textView2.setText(currentWord.getmDefaultTranslation());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int colour = ContextCompat.getColor(getContext(),mColourResourceId);
        textContainer.setBackgroundColor(colour);

        return listItemView;
    }
}
