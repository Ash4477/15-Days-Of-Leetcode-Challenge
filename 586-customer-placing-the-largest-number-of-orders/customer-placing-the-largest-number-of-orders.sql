-- Write your PostgreSQL query statement below
select customer_number from (
    select customer_number, count(order_number)
    from orders group by 1 order by 2 desc limit 1
);