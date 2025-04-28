CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255),
                       email VARCHAR(255) UNIQUE,
                       password VARCHAR(255),
                       role VARCHAR(50)
);

CREATE TABLE schools (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255),
                         sector VARCHAR(255),
                         district VARCHAR(255),
                         province VARCHAR(255),
                         latitude DOUBLE,
                         longitude DOUBLE,
                         headteacher_id BIGINT,
                         CONSTRAINT fk_school_headteacher FOREIGN KEY (headteacher_id) REFERENCES users(id)
);

CREATE TABLE infrastructure_reports (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        school_id BIGINT,
                                        date_submitted DATETIME,
                                        has_electricity BOOLEAN,
                                        has_internet BOOLEAN,
                                        number_of_classrooms INT,
                                        number_of_computers INT,
                                        clean_water_available BOOLEAN,
                                        toilets_available BOOLEAN,
                                        CONSTRAINT fk_report_school FOREIGN KEY (school_id) REFERENCES schools(id)
);