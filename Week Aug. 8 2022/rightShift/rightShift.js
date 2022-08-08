function rightShift(a, b) {
    console.log("Normal: " + Math.floor(a/(2**b)));
}

function rightShiftRecursion(a, b) {
    if (b == 0) {
        return a;
    }
    return rightShiftRecursion(Math.floor(a/2), b-1);
}

rightShift(80, 3);
console.log("Recursion: " + rightShiftRecursion(80, 3));
rightShift(-24, 2);
console.log("Recursion: " + rightShiftRecursion(-24, 2));
rightShift(-5, 1);
console.log("Recursion: " + rightShiftRecursion(-5, 1));