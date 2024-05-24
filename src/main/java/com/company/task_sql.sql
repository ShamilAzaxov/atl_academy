--------------------------------------------------------- 1
-- Create the Sales table
CREATE TABLE Sales (
                       ID serial PRIMARY KEY,
                       Product varchar(255) NOT NULL,
                       Quantity integer NOT NULL,
                       Price decimal(10, 2) NOT NULL
);

-- Insert sample data into the Sales table
INSERT INTO Sales (Product, Quantity, Price) VALUES
                                                 ('ProductA', 10, 20.00),
                                                 ('ProductB', 5, 30.00),
                                                 ('ProductA', 7, 22.50),
                                                 ('ProductC', 3, 40.00),
                                                 ('ProductB', 2, 29.00),
                                                 ('ProductA', 8, 21.00),
                                                 ('ProductC', 4, 35.00);

SELECT Product, SUM(Quantity) AS Total_Quantity, AVG(Price) AS Average_Price FROM Sales GROUP BY Product;
-----------------------------------------------------------------------2
SELECT SUM(quantity) sum_of_quantity,
       avg(quantity) avg_of_quantity,
       min(price) min_price,
       max(price) max_price,
       count(product)
FROM sales group by product;
-- 3
-- Create the Expenses table
CREATE TABLE Expenses (
                          ID serial PRIMARY KEY,
                          Category varchar(255) NOT NULL,
                          Amount decimal(10, 2) NOT NULL
);

-- Insert sample data into the Expenses table
INSERT INTO Expenses (Category, Amount) VALUES
                                            ('Rent', 1000.00),
                                            ('Utilities', 200.00),
                                            ('Groceries', 150.00),
                                            ('Entertainment', 80.00),
                                            ('Transportation', 50.00),
                                            ('Rent', 1000.00),
                                            ('Utilities', 210.00),
                                            ('Groceries', 160.00),
                                            ('Entertainment', 90.00),
                                            ('Transportation', 55.00);

select sum(amount), avg(amount) from expenses group by category;
------------------------------------------------------------------------4
-- Create the Products table
CREATE TABLE Products (
                          ID serial PRIMARY KEY,
                          Name varchar(255) NOT NULL,
                          Price decimal(10, 2) NOT NULL
);

-- Insert sample data into the Products table
INSERT INTO Products (Name, Price) VALUES
                                       ('Laptop', 999.99),
                                       ('Smartphone', 599.99),
                                       ('Tablet', 399.99),
                                       ('Headphones', 89.99),
                                       ('Smartwatch', 199.99),
                                       ('Keyboard', 49.99),
                                       ('Mouse', 29.99),
                                       ('Monitor', 199.99),
                                       ('Printer', 149.99),
                                       ('Camera', 549.99);

select min(price) min_price, max(price) max_price from products;
---------------------------------------------------------------------------------------- 5
-- Create the Students table
CREATE TABLE Students (
                          ID serial PRIMARY KEY,
                          Name varchar(255) NOT NULL,
                          Age integer NOT NULL
);

-- Create the Grades table
CREATE TABLE Grades (
                        ID serial PRIMARY KEY,
                        Student_ID integer NOT NULL,
                        Course varchar(255) NOT NULL,
                        Grade integer NOT NULL,
                        FOREIGN KEY (Student_ID) REFERENCES Students(ID)
);

-- Insert sample data into the Students table
INSERT INTO Students (Name, Age) VALUES
                                     ('Alice Johnson', 20),
                                     ('Bob Smith', 22),
                                     ('Charlie Brown', 21),
                                     ('Diana Prince', 23),
                                     ('Ethan Hunt', 20);

-- Insert sample data into the Grades table
INSERT INTO Grades (Student_ID, Course, Grade) VALUES
                                                   (1, 'Mathematics', 95),
                                                   (1, 'Physics', 88),
                                                   (2, 'Mathematics', 76),
                                                   (2, 'Chemistry', 89),
                                                   (3, 'Biology', 92),
                                                   (3, 'Physics', 85),
                                                   (4, 'Mathematics', 78),
                                                   (4, 'Chemistry', 70),
                                                   (5, 'Biology', 91),
                                                   (5, 'Physics', 93);

select s.name from students s left join grades g on s.id = g.student_id where g.grade > (select avg(grade) from grades);
-------------------------------------------------------------------------------6
-- Create the MaleStudents table
CREATE TABLE MaleStudents (
                              ID serial PRIMARY KEY,
                              Name varchar(255) NOT NULL,
                              Age integer NOT NULL,
                              Major varchar(255) NOT NULL
);

-- Create the FemaleStudents table
CREATE TABLE FemaleStudents (
                                ID serial PRIMARY KEY,
                                Name varchar(255) NOT NULL,
                                Age integer NOT NULL,
                                Major varchar(255) NOT NULL
);

-- Insert sample data into the MaleStudents table
INSERT INTO MaleStudents (Name, Age, Major) VALUES
                                                ('John Doe', 21, 'Computer Science'),
                                                ('Michael Smith', 22, 'Mechanical Engineering'),
                                                ('David Brown', 20, 'Physics'),
                                                ('James Wilson', 23, 'Mathematics'),
                                                ('Robert Johnson', 21, 'Biology');

-- Insert sample data into the FemaleStudents table
INSERT INTO FemaleStudents (Name, Age, Major) VALUES
                                                  ('Emily Davis', 20, 'Chemistry'),
                                                  ('Sophia Wilson', 22, 'Electrical Engineering'),
                                                  ('Olivia Johnson', 21, 'Physics'),
                                                  ('Isabella Martinez', 23, 'Mathematics'),
                                                  ('Mia Anderson', 20, 'Biology');

select * from femalestudents
UNION
select * from malestudents;

select * from femalestudents
INTERSECT
select * from malestudents;

select * from femalestudents
EXCEPT
select * from malestudents;