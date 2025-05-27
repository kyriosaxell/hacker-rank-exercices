package kotlinCodingChallenges

/**
 * Listo ✔️
 */
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun main() {

}

private fun encodeCaesarCipher(str: String, shift: Int): String {
    val ss = str.map {
        if (it.code + shift > 122) {
            var char = it.code
            var cont = 1
            for (i in 1..shift) {
                if (char + cont > 122) {
                    char = 97
                    cont = 1
                } else {
                    cont++
                }
            }
            char.toChar() + cont - 1
        } else {
            (it.code + shift).toChar()
        }
    }

    return ss.joinToString("")
}

// 122 - 121 + 50
private class Test {
    @Test
    fun `'abc' with shit 1 return 'bcd'`() {
        encodeCaesarCipher("abc", 1) shouldBeEqualTo "bcd"
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' shift 1 returns 'bcdefghijklmnopqrstuvwxyza'`() {
        encodeCaesarCipher(
            "abcdefghijklmnopqrstuvwxyz",
            1,
        ) shouldBeEqualTo "bcdefghijklmnopqrstuvwxyza"
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' shift 7 returns 'hijklmnopqrstuvwxyzabcdefg'`() {
        encodeCaesarCipher(
            "abcdefghijklmnopqrstuvwxyz",
            7,
        ) shouldBeEqualTo "hijklmnopqrstuvwxyzabcdefg"
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' shift 50 returns 'yzabcdefghijklmnopqrstuvwx'`() {
        encodeCaesarCipher(
            "abcdefghijklmnopqrstuvwxyz",
            50,
        ) shouldBeEqualTo "yzabcdefghijklmnopqrstuvwx"
    }
}