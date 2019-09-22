CREATE TABLE HOTELS(
ID NUMBER,
CONSTRAINT HOTEL_ID PRIMARY KEY(ID),
COUNTRY NVARCHAR2(50) DEFAULT 'N/A',
CONSTRAINT CHECK_COUNTRIES CHECK(COUNTRY != 'Romania' AND COUNTRY != 'Belgium' AND COUNTRY != 'China' AND COUNTRY != 'Ukraine'),
CITY NVARCHAR2(50) NOT NULL,
STREET NVARCHAR2(50)
);