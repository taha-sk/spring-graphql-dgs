# spring-graphql-dgs

This is a test application working on DGS Framework with GraphQL. After starting the application, visit the following url:

```sh
http://localhost:8080/graphiql
```

Then, execute the following query:

```sh
{
    books {
      title
      author
      publisher
      publicationYear
    }
}
```

Also, you can filter the results:

```sh
{
    books(titleFilter: "of") {
      title
      author
      publisher
      publicationYear
    }
}
```

Spring, DGS, and GraphQL technologies are used.
