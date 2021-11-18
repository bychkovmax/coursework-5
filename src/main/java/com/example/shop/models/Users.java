package com.example.shop.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Users {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String name,email,message;



        public Users() {

        }

        public Users( String name, String email, String message) {
            this.id=id;
            this.name = name;
            this.email = email;
            this.message = message;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }



        public void setEmail(String email) {
            this.email = email;
        }

        public void setMessage(String message){this.message=message;}

        public String getMessage(){        return message;        }


    }

