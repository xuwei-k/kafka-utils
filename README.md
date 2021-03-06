# KafkaUtils

Simple Kafka Utils in Scala

Features
========

- simple api
  - see `sc.ala.kafka.utils.Api`

Usage
=====

### prepare

```scala
import sc.ala.kafka.utils._
val utils = KafkaUtils("localhost:2181")  // set zkConnect
```

### 1 hop api (just type one word)

#### get broker list

```scala
utils.brokers
// Seq[kafka.cluster.Broker] = ArrayBuffer(id:1,host:ubuntu,port:9092)
```

#### get topic names

```scala
utils.topics
// Seq[String] = ArrayBuffer(topic1, test)
```

### about topic

#### leader broker ids for the topic

```scala
utils.leaders("topic1")
// Map[Int,Option[Int]] = Map(2 -> Some(1), 1 -> Some(1), 0 -> Some(1))
```

#### partitions for the topic

```scala
utils.partitions("topic1")
// Seq[Int] = ArrayBuffer(2, 1, 0)
```

### testing: very alpha functions

#### count messages

```scala
utils.count("topic1")
// Long = 5
```

### teardown

```scala
utils.close
```

TODO
====

- write tests
- api: count(topic: String, partition: Int): Int
- api: counts(topic: String): Map[Int, Int]

Library
=======

- kafka-0.8.2.x
