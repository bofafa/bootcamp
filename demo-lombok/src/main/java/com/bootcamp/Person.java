package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//1.class level annotation
@Data
public class Person {

  //2. annotation can be attribute level
  @NonNull
  private String name;
  private String emailAddress;

  public static void main(String[] args) {
    Person p = new Person ("john") ;
  }
}
