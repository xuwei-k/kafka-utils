package sc.ala.kafka.utils

/**
 * under construction
 */
class CountingSpec extends TestHelper {
  describe("count()") {
    it("can be compiled") {
      onFirstTopic{ t => 
        utils.count(t)
        utils.counts(t)
        utils.count(t, 0)
      }
    }
  }
}
