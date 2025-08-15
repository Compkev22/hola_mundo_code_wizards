Base de Datos para el Ejercicio 6:

drop database if exists agenda_contactos_db2022473;
CREATE DATABASE IF NOT EXISTS agenda_contactos_db2022473 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE agenda_contactos_db2022473;

CREATE TABLE Contacto (
    codigoContacto INT AUTO_INCREMENT PRIMARY KEY,
    nombreContacto VARCHAR(100) NOT NULL,
    apellidoContacto VARCHAR(50),
	empresaContacto VARCHAR(50),
	telefonoContacto VARCHAR(50),
	descripcionContacto VARCHAR(150)
    
);

INSERT INTO Contacto (nombreContacto, apellidoContacto, empresaContacto, telefonoContacto, descripcionContacto)
VALUES
('Carlos', 'Ramírez', 'TechSolutions', '502-5555-1234', 'Proveedor de servicios informáticos'),
('María', 'López', 'Distribuidora López', '502-4444-5678', 'Cliente frecuente de repuestos'),
('Juan', 'Pérez', 'Ferretería El Martillo', '502-3333-9876', 'Compra herramientas al por mayor'),
('Ana', 'Gómez', 'Consultores G&G', '502-2222-4567', 'Asesora de proyectos'),
('Luis', 'Martínez', 'Supermercado Central', '502-1111-7890', 'Encargado de compras generales');

SELECT * FROM Contacto;
