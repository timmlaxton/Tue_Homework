package com.codeclan.Homework.TueHomework.projections;


@Projection(name = "userEmbed", types = User.class)
public class UserEmbed {
    String getName();
    Folder getFolders();
}
