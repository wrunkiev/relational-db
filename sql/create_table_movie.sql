CREATE TABLE MOVIE(
ID NUMBER,
CONSTRAINT MOVIE_ID PRIMARY KEY(ID),
TITLE NVARCHAR2(50) NOT NULL UNIQUE,
DIRECTOR NVARCHAR2(20) NOT NULL,
YEAR NUMBER CHECK(YEAR >= 1900 AND YEAR <= 2019),
LENGTH_MINS NUMBER CHECK(LENGTH_MINS >= 10 AND LENGTH_MINS <= 200));