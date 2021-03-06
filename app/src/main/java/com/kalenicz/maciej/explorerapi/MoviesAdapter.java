package com.kalenicz.maciej.explorerapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by maciej on 26.08.2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    private List<Movie> movies;
    private int rowLayout;
    private Context context;


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(movies.get(position).getTitle());
        holder.movieYear.setText("Release date: " + movies.get(position).getReleaseDate());
        holder.movieRating.setText(movies.get(position).getVoteAverage().toString());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {

                //INTENT OBJ
                Intent i = new Intent(context, DetailActivity.class);

                //ADD DATA TO OUR INTENT
                i.putExtra("Name", movies.get(position).getTitle());
                i.putExtra("Image", movies.get(position).getPosterPath());
                i.putExtra("Date", movies.get(position).getReleaseDate());
                i.putExtra("Description", movies.get(position).getOverview());
                i.putExtra("Rating", movies.get(position).getVoteAverage().toString());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                //START DETAIL ACTIVITY
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView movieTitle;
        TextView movieYear;
        TextView movieRating;
        private ItemClickListener itemClickListener;

        public MovieViewHolder(View v) {
            super(v);
            movieTitle = (TextView) v.findViewById(R.id.name);
            movieYear = (TextView) v.findViewById(R.id.date_list_item);
            movieRating = (TextView) v.findViewById(R.id.rating_text);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClick(v, getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener ic) {
            this.itemClickListener = ic;
        }
    }

    public MoviesAdapter(List<Movie> movies, int rowLayout, Context context) {
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }
}
