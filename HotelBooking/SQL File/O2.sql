-- Insert data into the room table with unique type and price combinations
INSERT INTO room (type, size, price, available)
VALUES 
('Single Room', 40, 1000.00, true),
('Double Room', 50, 1200.00, true),
('Twin Room', 60, 1400.00, true),
('Triple Room', 70, 1600.00, true),
('Quad Room', 80, 1800.00, true),
('Queen Room', 90, 2000.00, true),
('King Room', 100, 2200.00, true),
('Hollywood Twin Room', 110, 2400.00, true),
('Suite', 120, 2600.00, true),
('Junior Suite', 130, 2800.00, true),
('Executive Suite', 140, 3000.00, true),
('Presidential Suite', 150, 3200.00, true),
('Studio Room', 160, 3400.00, true),
('Accessible Room', 170, 3600.00, true),
('Deluxe Room', 180, 3800.00, true),
('Standard Room', 190, 4000.00, true),
('Single Room', 200, 4200.00, true); -- Adjusted price to ensure uniqueness
