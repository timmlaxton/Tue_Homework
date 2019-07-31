package com.codeclan.Homework.TueHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

public class User {

        @Entity
        @Table(name = "users")
        public class User {

        @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @JsonIgnoreProperties("folders")
        @OneToMany(mappedBy = "uder")
        private List<Folder> folders;

        public User(String name){
            this.name = name;
        }

        public User(){

        }
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Folder> getFolders() {
            return folders;
        }

        public void setFolders(List<Folder> folders) {
            this.folders = folders;
        }

        public void addFolder(Folder folder) {
            this.folders.add(folder);
        }
    }
    }


}
