

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-23", "Angielski", 34, "16:15", "2D", 1);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-23", "Angielski", 34, "18:15", "2D", 1);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-23", "Angielski", 34, "20:15", "2D", 1);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-23", "Angielski", 28, "14:15", "2D", 4);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-23", "Polski dubbing", 24, "10:45", "2D", 3);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-23", "Angielski", 30, "22:30", "2D", 2);



INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Angielski", 34, "12:30", "3D", 7);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Francuski", 34, "15:05", "2D", (SELECT movieId from filmy where tytuł_polski="Nietykalni"));

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Angielski", 34, "20:15", "2D", 8);


INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-26", "Angielski", 23, "12:45", "2D", 7);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Francuski", 22, "10:05", "3D", (SELECT movieId from filmy where tytuł_polski="Nietykalni"));

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Angielski", 18, "20:15", "2D", 5);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Angielski", 34, "14:45", "2D", 1);

INSERT INTO seanse(data, jezyk, cena, czas, rodzaj_seansu, movie_movieId)
values("2017-05-24", "Francuski", 38, "17:50", "3D", (SELECT movieId from filmy where tytuł_polski="Ojciec Chrzestny" or tytuł_polski="Ojciec chrzestny"));
