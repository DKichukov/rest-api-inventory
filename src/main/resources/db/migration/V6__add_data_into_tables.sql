-- Add sample data to categories table
INSERT INTO categories (id, name) VALUES (1, 'Electronics');
INSERT INTO categories (id, name) VALUES (2, 'Clothing');
INSERT INTO categories (id, name) VALUES (3, 'Furniture');

-- Add sample data to products table
INSERT INTO products ( name, price, description, category_id) VALUES ('iPhone', 999.99, 'Apple iPhone 13 Pro Max', 1);
INSERT INTO products (name, price, description, category_id) VALUES ('Samsung Galaxy S21', 799.99, 'Samsung Galaxy S21 5G', 1);
INSERT INTO products (name, price, description, category_id) VALUES ('Nike Air Max', 129.99, 'Men''s Nike Air Max 270', 2);
INSERT INTO products (name, price, description, category_id) VALUES ('Adidas Ultraboost', 139.99, 'Women''s Adidas Ultraboost 21', 2);
INSERT INTO products (name, price, description, category_id) VALUES ('Sofa', 899.99, '3-seater leather sofa', 3);
INSERT INTO products (name, price, description, category_id) VALUES ('Dining table', 499.99, 'Solid wood dining table', 3);
