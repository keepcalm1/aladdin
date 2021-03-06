package org.phoenix.aladdin.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(length = 15,nullable = false)
    private String name;

    @Column(length = 15,nullable = false)
    private String password;//存储的密码是MD5值

    @Column(nullable = false)
    private String phoneNumber;

    @Column(length = 50)
    private String address="";

    @Column
    private Byte status=0;

    @Column
    private String wxOpenid="";

    public User(String name,String phoneNumber,String password){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.password=password;
    }


}
