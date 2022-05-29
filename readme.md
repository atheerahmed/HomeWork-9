Create Movie rating software  

Movie Class :
ID, name , genre  , rating , duration , launchDate

Validation :

ID : 
1. Cannot be null 
2. Length more than 3
3. Must be unique 

name  :

1. Cannot be null
2. Length more than 2
3. Must be unique

genre :
1. Cannot be null ( validate from DB and server )
2. Can only have these values : (Drama, Action , Comedy)

rating :

1. Cannot be null
2. Has to be a number
3. must be between 1 - 5

duration :
1. Cannot be null
2. Has to be a number
3. Has to be represented in minutes
4. I must be more than 60

launchDate :
1. Cannot be null
2. Has to be date


- Use service layer

- Use projcet lombok

- Use repository layer

Endpoints :

Get all the Movies

Add new Movie

Update Movie

Delete Movie
