function removeDuplicate(arr) {
    var exists = {};
    var results = [];
    for (var i = 0; i< arr.length; i++) {
        
        if (!exists[arr[i]]){
            exists[arr[i]] = true;
            results.push(arr[i]);
        }
    }
    return results;
}
