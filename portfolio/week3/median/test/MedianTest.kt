// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median when size=1" {
        median(listOf(5.0)) shouldBe 5.0
    }

    "Median when size=2" {
        median(listOf(4.0, 8.0)) shouldBe 6.0
    }

    "Median when size=3"{
        median(listOf(1.0, 9.0, 5.0)) shouldBe 5.0
    }

    "Median when size=4" {
        median(listOf(2.0, 4.0, 6.0, 8.0)) shouldBe 5.0
    }
})
