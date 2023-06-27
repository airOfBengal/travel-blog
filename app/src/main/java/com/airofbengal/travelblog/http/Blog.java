package com.airofbengal.travelblog.http;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

public class Blog implements Parcelable {
    private String id;
    private Author author;
    private String title;
    private String date;
    private String image;
    private String description;
    private int views;
    private float rating;

    protected Blog(Parcel in) {
        id = in.readString();
        author = in.readParcelable(Author.class.getClassLoader());
        title = in.readString();
        date = in.readString();
        image = in.readString();
        description = in.readString();
        views = in.readInt();
        rating = in.readFloat();
    }

    public static final Creator<Blog> CREATOR = new Creator<Blog>() {
        @Override
        public Blog createFromParcel(Parcel in) {
            return new Blog(in);
        }

        @Override
        public Blog[] newArray(int size) {
            return new Blog[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImageURL() {
        return BlogHttpClient.BASE_URL + BlogHttpClient.PATH + getImage();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return views == blog.views && Float.compare(blog.rating, rating) == 0 && Objects.equals(id, blog.id) && Objects.equals(author, blog.author) && Objects.equals(title, blog.title) && Objects.equals(date, blog.date) && Objects.equals(image, blog.image) && Objects.equals(description, blog.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, date, image, description, views, rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeParcelable(author, i);
        parcel.writeString(title);
        parcel.writeString(date);
        parcel.writeString(image);
        parcel.writeString(description);
        parcel.writeInt(views);
        parcel.writeFloat(rating);
    }
}
