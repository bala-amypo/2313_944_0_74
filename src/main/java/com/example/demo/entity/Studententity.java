package com.example.demo.entity;

import java.time.LocalDate;

public class Studententity {
      private  String name;
        private int roll;
        private LocalDate dOB;
        private Float cGPA;
        public String getName() {
            return name;
        }
        public void setName(String name) {
           this. name = name;
        }
        public int getRoll() {
            return roll;
        }
        public void setRoll(int roll) {
            this.roll = roll;
        }
        public LocalDate getDOB() {
            return dOB;
        }
        public void setDOB(LocalDate dOB) {
            this.dOB = dOB;
        }
        public Float getCGPA() {
            return cGPA;
        }
        public void setCGPA(Float cGPA) {
           this. cGPA = cGPA;
        }
        public Studententity(String name, int roll, LocalDate dOB, Float cGPA) {
           this. name = name;
            this.roll = roll; 
           this. dOB = dOB;
            this.cGPA = cGPA;
        }
        public Studententity() {
        }
      
    }

