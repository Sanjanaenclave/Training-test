const myDir = require("fs");

myDir.readdir("./",(err,data)=>{
    
    console.log(err);
    
    console.log(data);
    // if(err) throw err;
})