create table categories(
                           id serial primary key,
                           name varchar
);

create table products(
                         id serial primary key,
                         categoryId int,
                         name varchar,
                         price decimal(10,2),
                         quantity int,
                         description text,
                         foreign key(categoryId) references categories(id)
);

create table customers(
                          id serial primary key,
                          firstName varchar,
                          lastName varchar,
                          address varchar,
                          email varchar,
                          numPhone varchar
);

create table orders(
                       id serial primary key,
                       customerId int,
                       orderDate date,
                       foreign key(customerId) references customers(id)
);

create table orders_details(
                               id serial primary key,
                               orderId int,
                               productId int,
                               quantity int,
                               foreign key(orderId) references orders(id),
                               foreign key(productId) references products(id)

);

-- 1
select * from products;
-- 2
select * from categories;
-- 3
select * from customers;
-- 4
select * from orders;
-- 5
select * from orders_details;
-- 6
select * from products where id = 5;
-- 7
select * from products left join categories c on products.categoryId = c.id where categoryId = 3;
-- 8
select * from customers where id = 8;
-- 9
select * from orders left join customers c on c.id = orders.customerId where customerId = 6;
-- 10
select * from orders_details left join orders o on o.id = orders_details.orderId where orderId = 8;
-- 11
update products set price = 30.9 where id = 19;
-- 12
insert into products(categoryId, name, price, quantity, description)
VALUES (2, 'candy', 12.8, 500, 'seety things');
-- 13
delete from products where id = 12;