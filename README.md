<img alt="KODEIN-DI" src="https://raw.githubusercontent.com/Kodein-Framework/Kodein-DB/master/doc/modules/ROOT/images/kodein-db-logo.svg" width="700">

**_Kodein-DB_** is a _Kotlin/Multiplatform_ embedded NoSQL database that works on JVM, Android, Kotlin/Native and iOS.
It is suited for client or mobile applications.

**_Kodein-DB_** allows you to:
- Easily store, retrieve and query kotlin objects.
- Stop carrying about schema definitions.
- Easily set up a new project.

**_Kodein-DB_** is a good choice because it:
- proposes a very simple and readable DSL.
- integrates nicely with Android and iOS.
- offers very good performances.
- is just Kotlin!

_**CAUTION**: Under no circumstances should it be used in a server!_

### IMPORTANT
*Kodein-DB is in beta.*

Although, we do use Kodein-DB in production, this means we cannot ensure the library's correctness and stability.
Therefore, we ask that you first try Kodein-DB in non-critical applications, and report any mis-behaviour you may encounter.

### Example

.A simple example
```kotlin
val db = DB.open("path/to/db")

db.put(User("John", "Doe"))
db.put(User("Jane", "Doe"))
db.put(User("Someone", "Else"))

val does = db.find<User>().byIndex("lastName", "Doe").models()
println(does.joinToString()) // Jane, John
```

### Support

- Drop by the https://kotlinlang.slack.com/messages/kodein/[Kodein Slack channel]
- https://stackoverflow.com/questions/tagged/kodein[Stackoverflow] with the tag #kodein

### Contribute

Contributions are very welcome and greatly appreciated! The great majority of pull requests are eventually merged.

To contribute, simply fork https://github.com/Kodein-Framework/Kodein-DB[the project on Github], fix whatever is iching you, and submit a pull request!

We are sure that this documentation contains typos, inaccuracies and languages error.
If you feel like enhancing this document, you can propose a pull request that modifies https://github.com/Kodein-Framework/Kodein-DB/tree/master/doc[the documentation documents].
(Documentation is auto-generated from those).
