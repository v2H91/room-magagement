package vn.roommanagement.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
@Table(schema = "Model")
public class Model {
    @Id
    private BigInteger id;

    private String name;

    private double address;

    private boolean status;
}
