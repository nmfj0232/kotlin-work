// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

    fun redact(
        inputdocument: String,
        redactedtext: String,
        character: Char = 'X'): String {

        val replacement = character.toString().repeat(redactedtext.length)
        return inputdocument.replace(redactedtext,replacement)
    }
