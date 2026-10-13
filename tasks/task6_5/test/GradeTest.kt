// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
        "Mark between 70 and 100 gives a Distinction" {
            assertSoftly {
                withClue("Mark=70") { grade(70) shouldBe "Distinction" }
                withClue("Mark=85") { grade(85) shouldBe "Distinction" }
                withClue("Mark=100") { grade(100) shouldBe "Distinction" }
            }
        }

        "Mark between 40 and 69 gives a Pass" {
            assertSoftly {
                withClue("Mark=40") { grade(40) shouldBe "Pass" }
                withClue("Mark=55") { grade(55) shouldBe "Pass" }
                withClue("Mark=69") { grade(69) shouldBe "Pass" }
            }
        }


        "Mark between 0 and 39 gives a Fail" {
            assertSoftly {
                withClue("Mark=0") { grade(0) shouldBe "Fail" }
                withClue("Mark=20") { grade(20) shouldBe "Fail" }
                withClue("Mark=39") { grade(39) shouldBe "Fail" }
            }
        }

        "Mark more than 100 or less than 0 gives a ?" {
            assertSoftly {
                withClue("Mark=101") { grade(101) shouldBe "?" }
                withClue("Mark=-1") { grade(-1) shouldBe "?" }
            }
        }

        })

