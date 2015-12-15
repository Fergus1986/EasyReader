USE easyreader;
DROP TABLE IF EXISTS canal;
CREATE TABLE canal (
id INT NOT NULL AUTO_INCREMENT,
titulo VARCHAR(127) NOT NULL,
enlace VARCHAR(127) NOT NULL,
url VARCHAR(127) NOT NULL,
descripcion VARCHAR(127),
categoria INT,
PRIMARY KEY (id) USING BTREE,
FOREIGN KEY (categoria) REFERENCES categoria(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
