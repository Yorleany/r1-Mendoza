USE reto_back;

CREATE TABLE IF NOT EXISTS account(
    client_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    client_name VARCHAR(32) NOT NULL,
    client_account VARCHAR(64) NOT NULL,
    acc_balance FLOAT(8,4),
    acc_status VARCHAR(12)
);

INSERT INT account("s","s",12.30,"ok")