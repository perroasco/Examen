package org.fer.examen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;

public class ClaseAdapter extends BaseAdapter{

        private ArrayList<ListViewItem> items;

        public ClaseAdapter(ArrayList<ListViewItem> items){
            this.items = items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public ListViewItem getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null){
                view = LayoutInflater.
                        from(viewGroup.getContext()).
                        inflate(R.layout.listview, viewGroup, false);
            }
            decorateWith(view, items.get(i));
            return view;
        }

        private void decorateWith(View view, ListViewItem claseListView) {
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView = view.findViewById(R.id.textView);
            imageView.setImageResource(claseListView.getImageResource());

            textView.setText(claseListView.getTitle());
            imageView.setColorFilter(ContextCompat.getColor(view.getContext(), claseListView.getColorId()));
        }
}
