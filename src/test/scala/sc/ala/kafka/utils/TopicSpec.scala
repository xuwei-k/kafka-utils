package sc.ala.kafka.utils

/**
 * under construction
 */
class TopicSpec extends TestHelper {
  describe("partitions(topicName)") {
    it("return Seq(0)") {
      onFirstTopic{ t => 
        utils.partitions(t)  // works
      }
    }
  }

  describe("leader(topic, partition)") {
    it("return Some(1)") {
      onFirstTopic{ t => 
        assert(utils.leader(t, 0) === Some(1))
      }
    }
  }
}
