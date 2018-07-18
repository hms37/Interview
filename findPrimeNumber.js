function primeNumber(n) {
    var divider = 3;
    var limit = Math.sqrt(n);
    if (n ==2 || n ==3) {
        return true;
    }
    if (n % 2 == 0 ) {
        return false;
    }

    while(divider <= limit ) {
        if (n % divider == 0) {
            return false;
        }
        else {
            divider +=2;
        }
    }   
    return true;


}
