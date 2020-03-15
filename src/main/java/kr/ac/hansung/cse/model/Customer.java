package kr.ac.hansung.cse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@NoArgsConstructor
public class Customer implements Serializable {
    private static final long serialVersionUID = 4577239542252345341L;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private long id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}