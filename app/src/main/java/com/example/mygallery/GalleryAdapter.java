package com.example.mygallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder>{

    private Context context;
    private List<String> images;
    protected PhotoListener photoListener;

    public GalleryAdapter(Context context,List<String> images,PhotoListener photoListener){
        this.context = context;
        this.images = images;
        this.photoListener = photoListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        public ViewHolder(@NonNull View itemViet){
            super(itemViet);

            image = itemViet.findViewById(R.id.image);

        }
    }

    public interface PhotoListener{
        void onPhotoClick(String path);
    }
}
