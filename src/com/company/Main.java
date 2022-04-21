package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sixth Project done!!!");
--0
select * from supplier;
select * from product;
select * from orders;
select * from order_item;
select * from customer;
--1
SELECT * FROM customer WHERE country = 'Canada';
--2
SELECT country FROM customer ORDER BY country;
--3
SELECT count(quantity) FROM order_item;
--4
SELECT MAX(unit_price) FROM order_item;
--5
SELECT SUM(total_amount) FROM orders;
--6
SELECT SUM(total_amount) FROM orders WHERE order_date BETWEEN to_timestamp('Jan  1 2014 ', 'MON DD YYYY') AND to_timestamp('Dec 31 2014', 'MON DD YYYY');
--7
SELECT AVG(total_amount) FROM orders;
--8
SELECT AVG(total_amount) FROM orders;
--9
SELECT * FROM customer WHERE country IN ('Brazil', 'Spain') ORDER BY country;
--10
SELECT * FROM orders WHERE order_date
    BETWEEN to_timestamp('Jan 1 2013', 'Mon DD YYYY')
    AND to_timestamp('Dec 31 2014', 'MON DD YYYY') AND total_amount < 100.00;
--11
SELECT first_name FROM customer WHERE country IN ('Spain', 'Italy', 'Germany', 'France');
--12
SELECT country FROM customer WHERE country IN ('Canada', 'France', 'Italy', 'Australia', 'Finland', 'Netherlands', 'Denmark', 'Singapore', 'USA', 'Sweden', 'Norway', 'Germany', 'Brazil','UK', 'Japan') GROUP BY country;
--13
SELECT * FROM customer WHERE first_name LIKE ('Jo%');
--14
SELECT * FROM customer WHERE first_name ILIKE ('___a');
--15
SELECT country, count(*) AS cout_of_customer FROM customer GROUP BY country;
--16
SELECT country, count(*) AS count_of_customer FROM customer GROUP BY country ORDER BY count_of_customer DESC;
--17
SELECT SUM(total_amount), customer_id, COUNT(*) AS count_of_orders
FROM orders GROUP BY customer_id ORDER BY SUM(total_amount);
--18
SELECT SUM(total_amount), customer_id, COUNT(*) AS count_of_orders
FROM orders GROUP BY customer_id HAVING COUNT(*) > 20;


    }
}
