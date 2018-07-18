function mergeSortedArray(a, b){
    var aElm = a[0];
    var bElm = b[0];
    var results = [];
    var i =1;
    var j = 1;
    if (a.length== 0){
        return b ;
    }
    if (b.length == 0) {
        return a;
    }

    while(aElm || bElm ) {
        if(aElm && !bElm || aElm < bElm) {
            results.push(aElm);
            aElm = a[i];
            i++;
        }

        else {
            results.push(bElm);
            bElm = b[j];
            j++;
        }
    }

    return results;

    
}
