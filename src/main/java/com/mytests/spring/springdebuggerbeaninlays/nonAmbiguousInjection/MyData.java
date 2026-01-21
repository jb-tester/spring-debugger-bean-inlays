package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import jakarta.persistence.*;

@Entity
@Table(name = "foo")
public class MyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prop1;
    private String prop2;
    private int prop3;

    public MyData() {

    }

    public MyData(String prop1, String prop2, int prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public int getProp3() {
        return prop3;
    }

    public void setProp3(int prop3) {
        this.prop3 = prop3;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyData{" +
               "id=" + id +
               ", prop1='" + prop1 + '\'' +
               ", prop2='" + prop2 + '\'' +
               ", prop3=" + prop3 +
               '}';
    }
}
