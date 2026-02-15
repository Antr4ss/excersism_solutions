fun reverse(input: String): String {

    var reversedInput = ""
    for (i in input.length - 1 downTo 0){
        reversedInput += input[i]
    }
    return reversedInput
}
