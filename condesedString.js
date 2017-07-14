// @freecodecamp question

function condenseWords(left, right) {
	for (let i=0; i<left.length; i++) {
		let leftSubString = left.substring(i);
		if (right.startsWith(leftSubString)) {
			return left.slice(0,i) + right;
		}
	}
	return null
}

function condenseSentence(input) {
	let words = input.split(' ');
	for (let i = 0; i<words.length - 1; i++) {
		let condensedWord = condenseWords(words[i], words[i+1]);
		if (condensedWord) {
			words[i] = condensedWord;
			words.splice(i+1, 1);
			i--;
		}
	}
	return words.join(' ');
}