object Bob {
    fun hey(input: String): String {

        var answer = input.trim()
        var isSilence = answer.isEmpty()
        var isQuestion = answer.endsWith("?")
        var isYelling = answer.any { it.isLetter() } && answer.all { !it.isLetter () || it.isUpperCase() }

        return when {
            isSilence -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            isQuestion -> "Sure."
            else -> "Whatever."
        }
        
    }
}
