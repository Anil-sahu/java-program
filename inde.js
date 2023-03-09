function StringChallenge(sen) {
    var str = sen.replace(/[^a-zA-Z0-9]/g, " ");
    var strArr = str.split(" ")

    for (var i = 0; i < strArr.length; i++) {
        for (var j = 0; strArr.length; j++) {
            if (strArr[i].length() > strArr[j].length()) {
                var temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
            }
        }


    }
    return strArr;

}

// keep this function call here 
console.log(StringChallenge("This si string"));