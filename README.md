# Apache Flink Elasticsearch 5 connector

Note: This is a hack to use with Apache Flink 1.2-SNAPSHOT until the official
update for the Elasticsearch 5 connector will be available.

## Installation

```
mvn install
```

## Configuration

Add the following dependencies to your master `pom.xml`:
```
<dependency>
    <groupId>org.apache.flink</groupId>
    <artifactId>flink-connector-elasticsearch5_2.11</artifactId>
    <version>1.2-SNAPSHOT</version>
</dependency>
<dependency>
    <groupId>org.elasticsearch.plugin</groupId>
    <artifactId>transport-netty4-client</artifactId>
    <version>5.0.2</version>
</dependency>
<dependency>
    <groupId>org.elasticsearch.plugin</groupId>
    <artifactId>transport-netty3-client</artifactId>
    <version>5.0.2</version>
</dependency>
```
