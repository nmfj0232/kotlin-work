// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    "Mark between 70 and 100 gives a Distinction" {
        grade(70) shouldBe "Distinction"
        grade(85) shouldBe "Distinction"
        grade(100) shouldBe "Distinction"
    }

        "Mark between 40 and 69 gives a Pass" {
                 grade(40) shouldBe "Pass"
                 grade(55) shouldBe "Pass"
                 grade(69) shouldBe "Pass"
            }


        "Mark between 0 and 39 gives a Fail" {
                  grade(0) shouldBe "Fail"
                  grade(20) shouldBe "Fail"
                  grade(39) shouldBe "Fail"
            }


        "Mark more than 100 or less than 0 gives a ?" {
                  grade(101) shouldBe "?"
                  grade(-1) shouldBe "?"
            }


        })

