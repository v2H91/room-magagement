package vn.roommanagement.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Room {

    @Id
    private long id;

    private String name;

    private double price;

}
