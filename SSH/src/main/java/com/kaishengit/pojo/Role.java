package com.kaishengit.pojo;

import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;


@Named
@Entity
@Table(name="t_role")
public class Role implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

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


}
