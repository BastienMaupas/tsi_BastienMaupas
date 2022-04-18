create table if not exists product (
    ID int primary key not null,
    name varchar(30),
    description varchar(200),
    price float,
    pictureUrl varchar(100)

);

INSERT INTO product (ID, name, description, price, pictureUrl) VALUES(1, 'Acer Computer', 'Very good computer which you can greatly work with', 499.99, 'http://AcerComputer.com')
INSERT INTO product (ID, name, description, price, pictureUrl) VALUES(2, 'Samsung Galaxy S11', 'Great Smartphone that allows to explore all you can imagine', 1199.99, 'http://SamsungGalaxyS11.com')
INSERT INTO product (ID, name, description, price, pictureUrl) VALUES(3, 'Google Home', 'Great smart home device that can help you in your daily tasks', 599.99, 'http://GoogleHome.com')