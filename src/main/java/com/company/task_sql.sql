-- 1
SELECT Product, SUM(Quantity) AS Total_Quantity, AVG(Price) AS Average_Price FROM Sales GROUP BY Product;
-- 2
SELECT SUM(quantity) sum_of_quantity,
       avg(quantity) avg_of_quantity,
       min(price) min_price,
       max(price) max_price,
       count(product)
FROM sales group by product;
-- 3
select sum(amount), avg(amount) from expenses group by category;
-- 4
select min(price) min_price, max(price) max_price from products;
-- 5
select s.name from students s left join grades g on s.id = g.student_id where g.grade > (select avg(grade) from grades);
--6
select * from femalestudents
UNION
select * from malestudents;

select * from femalestudents
INTERSECT
select * from malestudents;

select * from femalestudents
EXCEPT
select * from malestudents;
