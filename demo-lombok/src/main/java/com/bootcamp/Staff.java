package com.bootcamp;

import lombok.NonNull;

public class Staff {
  private String name;
  private double salary;

  public Staff(@NonNull String name, @NonNull double salary){
    this.name= name;
    this.salary = salary;
  }

  public void work (@NonNull String detail){
    System.out.println("Staff is working on" +detail);

  }
  public static void main(String[] args) {
    
  Staff staff1 = new Staff ();
  }