package com.codeclan.Homework.TueHomework.models;


import javax.persistence.*;


@Entity
@Table(name = "pirates")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private int size;

    private Folder folder;




    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExstension() {
        return extension;
    }

    public void setExstension(String exstension) {
        this.extension = exstension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public long getId() {
        return id;
}

    public void setId(long id) {
        this.id = id;
    }
}




//    A File should have:
//        a name
//        extension (e.g. txt, rb, java, ppt)
//        size
//        folder
//
//
//        A User should have:
//        name
//        a list of folders
//
//
//        A Folder should have:
//        a title
//        list of files
//        a user