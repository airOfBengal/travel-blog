package com.airofbengal.travelblog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class BlogDetailsActivity extends AppCompatActivity {
    public static final String IMAGE_URL =
            "https://bitbucket.org/dmytrodanylyk/travel-blog-resources/raw/" +
                    "3436e16367c8ec2312a0644bebd2694d484eb047/images/sydney_image.jpg";
    public static final String AVATAR_URL =
            "https://bitbucket.org/dmytrodanylyk/travel-blog-resources/raw/" +
                    "3436e16367c8ec2312a0644bebd2694d484eb047/avatars/avatar1.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_details);

        ImageView imageMain = findViewById(R.id.imageMain);
        Glide.with(this)
                .load(IMAGE_URL)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageMain);

        ImageView imageAvatar = findViewById(R.id.imageAvatar);
        Glide.with(this)
                .load(AVATAR_URL)
                .transform(new CircleCrop())
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageAvatar);

        TextView textTitle = findViewById(R.id.textTitle);
        textTitle.setText("G'day from Sydney");

        TextView textDate = findViewById(R.id.textDate);
        textDate.setText("August 2, 2019");

        TextView textAuthor = findViewById(R.id.textAuthor);
        textAuthor.setText("Grayson Wells");

        TextView textRating = findViewById(R.id.textRating);
        textRating.setText("4.4");

        TextView textViews = findViewById(R.id.textViews);
        textViews.setText("(2687 views)");

        TextView textDescription = findViewById(R.id.textDescription);
        textDescription.setText("Australia is one of the most popular travel destinations in the world.");

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(4.4f);

        ImageView imageBack = findViewById(R.id.imageBack);
        imageBack.setOnClickListener(v -> finish());
    }
}