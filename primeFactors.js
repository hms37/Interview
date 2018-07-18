// Unique set of Prime Factors

function primeFactors(n) {
var factors = [];
var exists = {};
var divider = 2;
while(n > 2) {
    if (n % divider == 0 && !exists[divider]) {
            factors.push(divider);
            n = n/divider;
            exists[divider]=true;
    }
    else {
        divider++
    }
}
return factors;
}
