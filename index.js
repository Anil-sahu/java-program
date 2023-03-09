function StringChallenge(sen) {
    var str = sen.replace(/[^a-zA-Z0-9]/g, " ");
    var strArr = str.split(" ")
    var resStr = "";
    var token = "vpykactmr92";
    var revToken = "";
    for (var i = 0; i < strArr.length; i++) {
        for (var j = 0; j < strArr.length; j++) {
            if (strArr[i].length > strArr[j].length || strArr[i].length == strArr[j].length) {
                var temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
            }
        }
    }
    for (var i = strArr[0].length - 1; i >= 0; i--) {
        resStr += strArr[0].charAt(i);
    }
    for (var i = token.length - 1; i >= 0; i--) {
        revToken = revToken + revToken.charAt(i);
    }
    token.r
    var finalStr = resStr + ": " + token.split("").reverse().join("");
    return finalStr;

}

// keep this function call here 
console.log(StringChallenge("This is string"));