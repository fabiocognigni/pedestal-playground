# pedestal-playground

Playing around with Pedestal 0.4.0

## Getting Started

Using lein:

1. Start the application: `lein run-dev` \*
2. Go to [localhost:8080](http://localhost:8080/) to see: `Hello World!`
3. Read your app's source code at src/pedestal_playground/service.clj. Explore the docs of functions
   that define routes and responses.
4. Run your app's tests with `lein test`. Read the tests at test/pedestal_playground/service_test.clj.
5. Learn more! See the [Links section below](#links).

\* `lein run-dev` automatically detects code changes. Alternatively, you can run in production mode
with `lein run`.


From REPL:

1.
2. `(run-dev)` or (def dev-serv (run-dev))
3. Go to [localhost:8080](http://localhost:8080/)
4. make code changes
5. re-require/reload routes (service.clj)
6. refresh [localhost:8080](http://localhost:8080/)


## Configuration

To configure logging see config/logback.xml. By default, the app logs to stdout and logs/.
To learn more about configuring Logback, read its [documentation](http://logback.qos.ch/documentation.html).

## Run in prod mode

lein uberjar
java -jar target/XXXX-standalone.jar

## Links
* [Other examples](https://github.com/pedestal/samples)

