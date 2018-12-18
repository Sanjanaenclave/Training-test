
const fileDetials = require("fs");

console.log("before");

let myOutput = fileDetials.readFileSync("./myText2.txt","utf8")

console.log(myOutput);

console.log("after");