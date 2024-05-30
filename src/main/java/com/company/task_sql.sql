-- 1.  Query for adding a new book.
insert into book(title, author, publisher, publisher_year, copy_number)
values (
        'war and piece',
        'Leo Tolstoy',
        'Oxford University Press, USA',
        '2010-1-1',500
        );
-- 2.  Query for registering a new reader.
insert into reader(first_name, last_name, address, phone_number, email)
values (
        'Shamil',
        'Azaxov',
        'Baku',
        '050-990-90-90',
        'shamil@gmail.com'
       );
-- 3. Query for issuing a book to a reader.
insert into loan(book_id, reader_id, loan_date, return_date)
VALUES (
        6,4,'2024-5-27', '2024-7-30'
       );
-- 4.  Query for returning a book from a reader.
delete from loan where id = 1;
-- 5.  Query for searching books based on various criteria.
select * from book where publisher_year between '1900-1-1' and '2020-1-1';
select * from book where author in ('Leo Tolstoy', 'Charles Dickens', 'Arthur Conan Doyle');
-- 6.  Query for searching currently available books.

-- 7. Query for searching popular books among readers.
    select b.title from book b, loan l where l.book_id = b.id
-- 8. Query for searching books read by a specific reader.
-- 9. Query for searching books written by a specific author.
-- 10. Query for updating book information.
-- 11. Query for deleting a book from the library.
-- 12. Query for searching books by genre.
-- 13. Query for calculating the total number of books borrowed by a reader.
-- 14. Query for finding the most borrowed book in the library.
-- 15. Query for updating reader information