CREATE TABLE ORDER_DETAILS(
ORDER_ID NUMBER,
PRODUCT_ID NUMBER,
UNIT_PRICE DECIMAL(7,2),
QUANTITY NUMBER,
DISCOUNT NUMBER,
CONSTRAINT ORDER_ID_FK FOREIGN KEY(ORDER_ID) REFERENCES ORDERS(ORDER_ID),
CONSTRAINT PRODUCT_ID_FK FOREIGN KEY(PRODUCT_ID) REFERENCES PRODUCTS(PRODUCT_ID));