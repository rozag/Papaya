package com.yastart.papaya.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.yastart.papaya.Model.Book;
import com.yastart.papaya.R;
import com.yastart.papaya.adapters.view_holders.BooksGridViewHolder;

import java.util.ArrayList;

public class ProfileBooksListAdapter extends RecyclerView.Adapter<BooksGridViewHolder> {

    private final Context mContext;
    private ArrayList<Book> books;
    private final View.OnClickListener listener;

        public ProfileBooksListAdapter(final Context context, final ArrayList<Book> books, final View.OnClickListener listener){
            mContext = context;
            this.books = books;
            this.listener = listener;
        }


    @Override
    public BooksGridViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profilebooks_list, viewGroup, false);
        return new BooksGridViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(BooksGridViewHolder viewHolder, int i) {
        final Book book = books.get(i);
        //Glide.with(mContext).load(book.getUrl()).into(viewHolder.bookImage);
        //viewHolder.bookName.setText(...);
        //viewHolder.author.setText(...);
        //viewHolder.textBackground ...

        Glide.with(mContext)
                .load(book.getCoverUrl())
                .into(viewHolder.bookImage);
        viewHolder.bookName.setText(books.get(i).getTitle());
        viewHolder.author.setText(books.get(i).getAuthors());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

}
