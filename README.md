# Java Dev Test 1

Purpose of this test is to value the abilities of developer in writing their own `spring-boot-starter`. Level: Normal

## Task

As you can see, This application as a test controller which accepts a *query string* model. The input field from this query string is then passed to a service (TestService).
TestService is supposed to generate an string. The way this string is generated is by concating `prefix` in `@Generator` to the input of `generate()` method and return the result.

So for example, for input of `test` we expect TestService to print: `Example1 - test` and for input `hello` we expect TestService to print `Example1 - hello`.
If we create another generator, we expect everything to work in same way.

As you can see, you cant build the application because it needs `Generator` annotation. Your task is to create a library that contains this annotation.

## Restrictions

These are the things you **cant to**:

- You can not add or modify any class inside the project. You can only use the classes available on your library.
- You can not implement `ExampleGenerator` or alter it in anyways.

## Expectation

What is expected is a library that we can add to this project POM.xml and expect everything to work fine.
