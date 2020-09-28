# java-15-demo
A set of tests demonstrating java 15 features


## Java 15 features
* Text blocks
* instanceof pattern matching
* records
* Sealed interfaces - todo: the fmt-maven-plugin:2.10 doesn't handle this yet


## Running the tests
```
mvn test
```
or if you want to use docker
```
docker build . -t java-15-demo
docker run -it --rm java-15-demo
```