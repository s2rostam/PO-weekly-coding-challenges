// In this challenge you should repeat a specific given char x times. Create 
// a function that takes a string and a number as arguments and return a string

//Run using brower/nodejs

function printChars(character, times) {
    if (times < 268435440 && character.length === 1) {
        let currLength = character.length;
        let fullString = character;

        if (times <= 0) {
            return "";
        }
        while (currLength*2 < times) {
            fullString += fullString.substring(0, fullString.length);
            currLength = fullString.length;
        }
        let remaining = times - currLength;
        while (currLength < times) {
            if (remaining/2 < 1) {
                fullString += fullString.substring(0, remaining);
                remaining = remaining - Math.ceil(remaining/2);
                currLength++;
            }
            else {
                let half = Math.ceil(remaining/2);
                fullString += fullString.substring(0, half);
                remaining -= half;
                currLength += half;
            }
        }

        return fullString;
    }
    
}

let result = printChars("-", 268435439);
console.log(`Result is ${result.length} characters long`);