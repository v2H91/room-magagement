CREATE TABLE IF NOT EXISTS user
(
    id             VARCHAR(36) ,
    name          varchar(255)         DEFAULT NULL,
    phone         varchar(20)          DEFAULT NULL,
    birthday      timestamp NULL DEFAULT NULL,
    address       varchar(255)         DEFAULT NULL,
    email         varchar(99)          DEFAULT NULL,
    password      varchar(50),
    roles_id      smallint             DEFAULT NULL,
    url_avatar    varchar(255)         DEFAULT '',
    delete_flag   tinyint(1) NOT NULL DEFAULT '0' COMMENT 'Delete status is 1',
    status        tinyint     NOT NULL DEFAULT '1',
    PRIMARY KEY (id)
    );


CREATE TABLE IF NOT EXISTS user_token_temp (
                                               id_token VARCHAR(36),
    token VARCHAR(255),
    is_active BOOLEAN,
    user_id VARCHAR(36),
    expired_time TIMESTAMP,
    PRIMARY KEY (id_token)
    );