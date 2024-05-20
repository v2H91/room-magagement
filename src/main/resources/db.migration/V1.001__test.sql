CREATE TABLE room (
                      id BIGINT PRIMARY KEY,
                      name VARCHAR(255),
                      price DOUBLE
);

INSERT INTO room (id, name, price) VALUES
                                       (1, 'Single Room', 50.0),
                                       (2, 'Double Room', 80.0),
                                       (3, 'Suite', 120.0);