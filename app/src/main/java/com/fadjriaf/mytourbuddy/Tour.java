package com.fadjriaf.mytourbuddy;

import android.os.Parcel;
import android.os.Parcelable;

public class Tour implements Parcelable {
    private String tourImage, tourName, tourDescript, tourLoc, tourHours, tourTicket, tourActivity;

    public String getTourImage() {
        return tourImage;
    }

    public void setTourImage(String tourImage) {
        this.tourImage = tourImage;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourDescript() {
        return tourDescript;
    }

    public void setTourDescript(String tourDescript) {
        this.tourDescript = tourDescript;
    }

    public String getTourLoc() {
        return tourLoc;
    }

    public void setTourLoc(String tourLoc) {
        this.tourLoc = tourLoc;
    }

    public String getTourHours() {
        return tourHours;
    }

    public void setTourHours(String tourHours) {
        this.tourHours = tourHours;
    }

    public String getTourTicket() {
        return tourTicket;
    }

    public void setTourTicket(String tourTicket) {
        this.tourTicket = tourTicket;
    }

    public String getTourActivity() {
        return tourActivity;
    }

    public void setTourActivity(String tourActivity) {
        this.tourActivity = tourActivity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tourImage);
        dest.writeString(this.tourName);
        dest.writeString(this.tourDescript);
        dest.writeString(this.tourLoc);
        dest.writeString(this.tourHours);
        dest.writeString(this.tourTicket);
        dest.writeString(this.tourActivity);
    }

    Tour() {

    }

    private Tour(Parcel in) {
        this.tourImage = in.readString();
        this.tourName = in.readString();
        this.tourDescript = in.readString();
        this.tourLoc = in.readString();
        this.tourHours = in.readString();
        this.tourTicket = in.readString();
        this.tourActivity = in.readString();
    }

    public static final Creator<Tour> CREATOR = new Creator<Tour>() {
        @Override
        public Tour createFromParcel(Parcel source) {
            return new Tour(source);
        }

        @Override
        public Tour[] newArray(int size) {
            return new Tour[size];
        }
    };
}
