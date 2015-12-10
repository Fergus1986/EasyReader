DROP DATABASE IF EXISTS easyreader;
CREATE DATABASE easyreader;
GRANT USAGE ON *.* TO rtsoft@localhost IDENTIFIED BY 'rtsoft';
GRANT ALL PRIVILEGES ON easyreader.* TO rtsoft@localhost;
FLUSH PRIVILEGES;