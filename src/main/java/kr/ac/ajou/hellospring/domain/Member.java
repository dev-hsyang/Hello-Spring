package kr.ac.ajou.hellospring.domain;

import javax.persistence.*;

@Entity // jpa가 관리하는 entity가 되게하는 annotation
public class Member { // 회원 객체

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "username") // DB 에 있는 column명이 username과 매핑이 되게 하는 annotation
    private String name;

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
}
