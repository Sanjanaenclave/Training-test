const fileDetials = require("fs");

console.log("before");

fileDetials.readFile("./myText2.txt","utf8",(err,data)=>{
    console.log(data);    
})
console.log("after");