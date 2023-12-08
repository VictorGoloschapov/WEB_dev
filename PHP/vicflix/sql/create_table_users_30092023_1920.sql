USE vikflix;

CREATE TABLE IF NOT EXISTS users (
	id INT PRIMARY KEY AUTO_INCREMENT, 
    firstName VARCHAR(25),
    lastName VARCHAR(25),
    username VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(255),
    signUpDate DATETIME DEFAULT CURRENT_TIMESTAMP(),
    isSubscribed TINYINT DEFAULT 0
);