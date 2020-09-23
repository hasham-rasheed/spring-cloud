package com.handson.microservices.moviesinfo;

import javax.persistence.*;

/** @author Hasham Rasheed 21-09-2020 */
@Entity
@Table(name = "MOVIE")
public class Movie {
  @Id
  @Column(name = "ID")
  @GeneratedValue
  private long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "DESC")
  private String desc;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}
