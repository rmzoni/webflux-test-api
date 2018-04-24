# Reactive Product API
This API is example usage of the Spring Webflux to build a Reactive API on top of the Observer Design Pattern.

# Build
```sh
mvn clean install
```

# Run
```sh
mvn clean spring-boot:run
```

# Test
Get all the products as a normal HTTP request:
```sh
curl -X GET http://localhost:8787/products -H 'Accept: application/json' --verbose
```

Get all the products as subsciption requisition using Server Sent Events:
```sh
curl -X GET http://localhost:8787/products -H 'Accept: text/event-stream' --verbose
```

Get a non stop interval event stream:
```sh
curl -X GET http://localhost:8787/products/events -H 'Accept: text/event-stream' -N --verbose
```