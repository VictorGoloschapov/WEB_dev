/*
1) Создать переменную numberOfFilms и в нее поместить ответ от пользователь на вопрос: "сколько фильмов вы уже посмотрели?"
*/

let numberOfFilms = +prompt("Сколько фильмов вы уже просмотрели?", "");
let a;
let b;
let c;
let d;
/*2)
создать объект personalMovieDB
*/
let personalMovieDB = {
    count: numberOfFilms,
    movies: {},
    actors: {},
    genres: [],
    privat: false
};

/*3)
-задать пользователю по два вопроса:
Один из поледних фильмов?
На сколько оцените его?

-записать ответы в объект movies в формате:
 movies: {
    "logan": "8.1"
 }
*/

a = prompt("Один из последних просмотренных фильмов?", "");
b = prompt("На сколько оцените его?", "");
c = prompt("Один из последних просмотренных фильмов?", "");
d = prompt("На сколько оцените его?", "");

personalMovieDB.movies[a] = b;
personalMovieDB.movies[c] = d;

document.write(personalMovieDB);
