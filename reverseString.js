function reverseWithBuiltIn(str) {
    return str.split('').reverse().join('');
}

function reverseWithoutBuiltIn(str) {
    var reverserStr;
    var len = str.length;
    var halfIndex = Math.floor(len/2)-1;
    for (var i= 0; i<=halfIndex; i++) {
        reverserStr = str[i];
        str[i] = str[len-i-1];
        str[len-i-1]= reverserStr;
    }
    return str;
}

function reverseRecursive(str) {
    if (str.length == "") {
        return "";
    }
    else {
        return reverseRecursive(str.substr(1))+ charAt(0);
    }
}
