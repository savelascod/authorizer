DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    active_card     BOOLEAN,
    available_limit BIGINT
);

DROP TABLE IF EXISTS TRANSACTION;

CREATE TABLE TRANSACTION
(
    id                 INT AUTO_INCREMENT PRIMARY KEY,
    destiny_account_id INT,
    merchant_name      VARCHAR,
    amount             BIGINT,
    date               TIMESTAMP WITH TIME ZONE,
    FOREIGN KEY (destiny_account_id) references ACCOUNT (id)
);
