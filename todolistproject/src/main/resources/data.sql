  DROP TABLE IF EXISTS category;

  CREATE TABLE category (
    id INT PRIMARY KEY,
    NAME VARCHAR(250) NOT NULL
  );

  INSERT INTO category (ID, NAME) VALUES
    (1, 'shopping'),
    (2, 'food'),
    (3, 'housekeeping');

DROP TABLE IF EXISTS task;

CREATE TABLE task (
  id INT PRIMARY KEY,
  TITLE VARCHAR(250) NOT NULL,
  DESCRIPTION VARCHAR(250) NOT NULL,
  START_DATE TIMESTAMP NOT NULL,
  END_DATE TIMESTAMP,
  IS_REPEATED BIT NOT NULL,
  PACE INT,
  STATUS VARCHAR(250) NOT NULL,
  CATEGORY_ID INT NOT NULL,
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE

);


