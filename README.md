
# Book My Show 

Spring Boot,Java,Rest-API, MySQL, Maven, Hibernate, Oops, Jdbc Jan 2022 – Jan 2022

• This is Spring boot backend Application Application where we can Book a ticket, cancel ticket, Find show, Search Movies, and has 12 Other APIs’s

• Used Spring boot framework,Jpa hibernate ,MySQL DB, Maven, Postman/Swagger

• In this project I learn about Spring boot, Hibernate, different layers of APIs, MySQL connection ,DB designing

## Features

- Book tickets 
- Cancel tickets
- Add movies 
- get all movies
- add theater 
- search movies
- search theater
- ETC



## API Reference


#### ADD NEW MOVIE 
```http
http://localhost:9093/Movie/add
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `MovieRequestDTO`      | `String`    | We can add new movies |



#### Get all movies

```http
  http://localhost:9093/Movie/Get_All_Movies
```

| Request Parameter | OutPut     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `List<MovieResponceDto>` | here we can get all movies List |

#### Get Movie By MovieName

```http
  http://localhost:9093/Movie/Get_movie?MovieName=....
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `String`      | `MovieResponceDto`    | Here we get Movie Description by giving  MovieName Input |



#### ADD NEW USER 
```http
http://localhost:9093/User/add-user
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `UserRequestDTO`      | `String`    | We can add new User |



#### ADD NEW SHOW 
```http
http://localhost:9093/show/add
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `ShowRequestDTO`      | `String`    | We can add new Show |



#### ADD NEW THEATER 
```http
http://localhost:9093/theater/add
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `TheaterRequestDTO`      | `String`    | We can add new theater |


#### GET THEATER BY NAME 
```http
http://localhost:9093/theater/get_theater_by_name?name=....
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `String`      | `TheaterRequestDTO`    | We can get theater details by hitting this API |


#### GET THEATER BY MOVIENAME 
```http
http://localhost:9093/theater/get_TheatersByMovie?name=Pattan
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `String`      | `TheaterRequestDTO`    | We can get theater details by hitting this API |


#### GET THEATER BY THEATER I'D 
```http
http://localhost:9093/theater/get_Theater_by-Id?Id=1

```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `int`      | `TheaterRequestDTO`    | We can get theater details by hitting this API |


#### GET ALL THEATER
```http
http://localhost:9093/theater/Get_All_Theaters

```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `-`      | `List<TheaterRequestDTO>`    | We can get all theater details by hitting this API |


#### BOOK TICKETS 
```http
http://localhost:9093/tickets/book_ticket

```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `ThicketRequestDTO`      | `String`    | We can book_ticket |


#### CANCEL TICKETS 
```http
http://localhost:9093/tickets/cancel_ticket?Id=3

```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `int`      | `int`    | We can cancel_ticket |





## Screenshots
![Required DTOs](https://user-images.githubusercontent.com/105160327/217212094-6cb04843-b39d-4c68-bf13-8da9e3bd24a7.jpg)
These are required Dto's (Data Transfer Object) those DTOs are used to Transfer Data from input to Repository (Database)

![movie-control](https://user-images.githubusercontent.com/105160327/217212159-41a43ab4-825e-4726-bbe6-e2684189dca8.jpg)
Here we have all options to control movies
![add movie](https://user-images.githubusercontent.com/105160327/217212109-e114a5d0-0a0e-47e0-ace1-2daf5c20e950.jpg)
This Api is used for add New movies in movies Database
![get movie](https://user-images.githubusercontent.com/105160327/217212144-838c03f5-67f5-4e5b-9e2a-9494aee3ccc6.jpg)
This Api is used for get a movie details by Movie Name from Database
![get all movies](https://user-images.githubusercontent.com/105160327/217212139-82cc5b9d-8ec8-42dc-9ea1-653756f8eba6.jpg)
This Api id used for get all movie details  from Database


![show contro;](https://user-images.githubusercontent.com/105160327/217212100-7e8d78e1-0350-4a20-9e61-f38d220d02d2.jpg)
Here we have all options to control Shows
![add show](https://user-images.githubusercontent.com/105160327/217212115-6005949e-1608-4e80-a3e2-89faa376ba08.jpg)
This Api used for Add new Shows for new movies in different theaters and this show details will add in show Database
![add user](https://user-images.githubusercontent.com/105160327/217212119-65065b7e-a048-4c6f-87e2-49d5d27e52c9.jpg)
This Api is used for add New user in our user Database

![theater-control](https://user-images.githubusercontent.com/105160327/217212105-2ca54b98-4f2a-44a3-b496-5d027aa0bc84.jpg)
Here we have all options to control theaters

![Add-theater](https://user-images.githubusercontent.com/105160327/217212122-e9618517-0943-489a-a7a1-23ba0e495e89.jpg)
This Api is used to add new theater in theaters Database while hitting this Api
![get all theaters](https://user-images.githubusercontent.com/105160327/217212142-c010ce23-a3f6-4457-b67c-76d2af4184d8.jpg)
This Api is used to get All theaters from theaters Database by hitting this Api
![get theater by id](https://user-images.githubusercontent.com/105160327/217212147-639911e4-e552-497a-b7ad-be813123778c.jpg)
This Api is used for get theater details by using theater id from theater Database.
![get theater by Mvname](https://user-images.githubusercontent.com/105160327/217212149-d65b18b8-609a-4883-9b2a-d95af6b753fa.jpg)
This Api is used for get theater details by using Movie Name from theater Database.
![Get theater By Name](https://user-images.githubusercontent.com/105160327/217212155-11be0bb1-baca-4ee6-8f82-53e5f48f081d.jpg)
This Api is used for get theater details by using theater Name from theater Database.

![ticket control ](https://user-images.githubusercontent.com/105160327/217212108-6ec62d1d-8d9e-4333-b420-fee4afb7bad1.jpg)
In this ticket control section we can Book a ticket and Cancel a ticket
![Book tickets ](https://user-images.githubusercontent.com/105160327/217212130-bbb878d1-6b24-4c95-ab51-c04a04103bd1.jpg)
This
![Cancel tickets](https://user-images.githubusercontent.com/105160327/217212135-ec4cba53-f483-45a9-af3d-43298e452eb0.jpg)



