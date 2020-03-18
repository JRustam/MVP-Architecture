package com.example.main;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Comment {

    private int postId;
    private int id;
    private String name;
    private String email;

    @SerializedName("body")
    private String text;



}
