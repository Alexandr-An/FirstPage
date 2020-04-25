package com.memeses.firstpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

private Context mContext;
private List<Book> mData;

    public RecyclerViewAdapter(Context context, List<Book> mData) {
        this.mContext = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder{

       TextView tv_book_title;
       ImageView img_book_thumbnail;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_book_title = (TextView)itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail = (ImageView)itemView.findViewById(R.id.book_image_id);
        }
    }
}
