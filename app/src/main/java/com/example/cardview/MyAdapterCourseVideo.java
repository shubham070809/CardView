package com.example.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class MyAdapterCourseVideo extends RecyclerView.Adapter<MyAdapterCourseVideo.MyViewHolder>{

    //2
    ArrayList<String> arrayList;
    // constructor to get the data source where we make the object as adapter is the one that passes the data to individual recycler item view in recyclerview
    public MyAdapterCourseVideo(ArrayList<String> arrayList){
        this.arrayList = arrayList;
        //this.context=context;

    }

    // this actually inflates the layout in each recycler view item and at this time the recycler view item are in their default state as
    // in the rowitem.xml
    //3
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcoursevideo , parent , false);
        return new MyViewHolder(view);
    }


    // this binds the view to the recycler item view i.e attaches the content for each recycler view item
    //4
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        String data = arrayList.get(position);
        holder.youTubeView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = data;
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

    }

    //5
    // gets the current index automatically of recycler item view
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //1
    // Here we initialize the views used in the the individual items in recycler view
    public class MyViewHolder extends RecyclerView.ViewHolder {
        YouTubePlayerView youTubeView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            youTubeView = itemView.findViewById(R.id.youTubeView);
        }
    }
}
