CREATE TABLE urun (
  ID   SERIAL PRIMARY KEY ,
name VARCHAR(255) UNIQUE NOT NULL,
  imagefront TEXT NOT NULL ,
  imageback TEXT NOT NULL ,
  fiyat INTEGER DEFAULT 0

)