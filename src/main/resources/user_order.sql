CREATE TABLE user_order (
     order_id INT AUTO_INCREMENT PRIMARY KEY,
     user_id INT NOT NULL,
     product_id INT NOT NULL,
     quantity INT NOT NULL,
     unit_price DOUBLE NOT NULL,
     total_price DOUBLE NOT NULL,
     timestamp TIMESTAMP not null
);