
CREATE TABLE room (
                      id BIGINT PRIMARY KEY,
                      name VARCHAR(255),
                      price DOUBLE
);


CREATE TABLE Model
(
    id          BIGINT PRIMARY KEY,
    name        VARCHAR(255),
    address     VARCHAR(1000),
    room_number INT,
    status      BOOLEAN
);

