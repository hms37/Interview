function primeFactors(n) {
var factors = [];
var divider = 2;
while(n > 2) {
    if (n % divider == 0) {
        factors.push(divider);
        n = n/divider;
    }
    else {
        divider++
    }
}
return factors;
}
