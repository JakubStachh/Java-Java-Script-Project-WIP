function longestWord(sentence) {
    return sentence.split(" ").reduce((longest, word) => word.length > longest.length ? word : longest, "");
}
console.log(longestWord("The quick brown fox jumps over the lazy dog")); // "jumps"
