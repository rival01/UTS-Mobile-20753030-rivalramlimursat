package com.val.game;

import android.os.Parcel;
import android.os.Parcelable;

public class Topup implements Parcelable {
    private String name;
    private String description;
    private Integer photo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPhoto() {
        return photo;
    }
    public void setPhoto(Integer photo) {
        this.photo = photo;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeInt(this.photo);
    }
    Topup() {
    }
    private Topup(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.photo = in.readInt();
    }

    public static final Creator<Topup> CREATOR = new
            Creator<Topup>() {
                @Override
                public Topup createFromParcel(Parcel source) {
                    return new Topup(source);
                }
                @Override
                public Topup[] newArray(int size) {
                    return new Topup[size];
                }
            };
}
