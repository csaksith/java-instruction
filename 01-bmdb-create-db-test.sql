SELECT *
FROM Movie
ORDER BY Id;
SELECT *
FROM Actor;
SELECT *
FROM Credit;

INSERT INTO Movie(Title,Year,Rating,Director)
VALUES ("Test",2026,"PG","Test Dir");

DELETE
FROM Movie
WHERE Id=5;