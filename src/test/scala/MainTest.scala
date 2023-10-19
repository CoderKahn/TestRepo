import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MainTest extends AnyWordSpec with Matchers {

  "A pro forma test" when {
    "being executed" must {
      "succeed" in new BaseFixture {
        true mustBe true
      }
    }
  }


  trait BaseFixture
}
