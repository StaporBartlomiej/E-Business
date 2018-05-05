# --- !Ups

create table "product" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null,
  "description" text not null,
  category int not null,
  foreign key(category) references category(id)
);
create table "category" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null
);

CREATE TABLE "basket"
(
  id INTEGER NOT NULL PRIMARY KEY autoincrement,
  customer INTEGER NOT NULL
);

CREATE TABLE "basket_content"
(
  id INTEGER NOT NULL PRIMARY KEY,
  product INTEGER NOT NULL,
  quantity INT DEFAULT 1 NOT NULL,
  FOREIGN KEY (id) REFERENCES basket(id),
  FOREIGN KEY (product) REFERENCES product(id)
);
CREATE TABLE "orders"
(
  id INTEGER NOT NULL PRIMARY KEY autoincrement,
  "basket" INTEGER NOT NULL,
  "date" DATE NOT NULL,
  "address" VARCHAR(50) NOT NULL,
  customer_name VARCHAR(20) NOT NULL,
  customer_surname VARCHAR(40) NOT NULL,
  FOREIGN KEY (basket) REFERENCES basket (id)
);
CREATE TABLE "payment"
(
  id INTEGER NOT NULL PRIMARY KEY autoincrement,
  "basket" INTEGER NOT NULL,
  "value" REAL NOT NULL,
  "date" DATE NOT NULL,
  FOREIGN KEY (basket) REFERENCES basket (id)
);
CREATE TABLE "opinions"
(
  product INTEGER NOT NULL PRIMARY KEY autoincrement,
  opinion INT NOT NULL,
  FOREIGN KEY(product) REFERENCES product(id)
);
CREATE TABLE "product_type"
(
  id INTEGER NOT NULL PRIMARY KEY autoincrement,
  name VARCHAR(25) NOT NULL
);

CREATE TABLE "keyword"
(
  id INTEGER NOT NULL PRIMARY KEY autoincrement,
  value VARCHAR(40) NOT NULL
);


# --- !Downs

drop table "product";
drop table "category";
drop table "basket";
drop table "basket_content";
drop TABLE "keyword";
drop table "opinions";
drop table "orders";
drop table "payment";
drop table "product_type";

